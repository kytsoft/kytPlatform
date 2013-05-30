package com.kyt.platform.form;

import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javolution.util.FastList;
import javolution.util.FastMap;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.xmlbeans.XmlOptions;
import org.ofbiz.base.location.ComponentLocationResolver;
import org.ofbiz.base.util.Debug;
import org.ofbiz.base.util.UtilMisc;
import org.ofbiz.entity.Delegator;
import org.ofbiz.entity.GenericEntityException;
import org.ofbiz.entity.GenericValue;
import org.ofbiz.entity.model.ModelEntity;
import org.ofbiz.entity.model.ModelField;
import org.ofbiz.service.DispatchContext;
import org.ofbiz.service.ModelService;
import org.ofbiz.service.ServiceUtil;

import com.kyt.xsd.widgetform.FormDocument;
import com.kyt.xsd.widgetform.FormDocument.Form;
import com.kyt.xsd.widgetform.FormsDocument;

/**
 * 
 * @author lcwen
 * 
 */
public class FormServices {
	public static final String module = FormServices.class.getName();

	public static Map<String, Object> getFormList(DispatchContext dctx,
			Map<String, ? extends Object> context)  {
		Map<String, Object> result = ServiceUtil.returnSuccess();
		List<Map<String, Object>> datas = FastList.newInstance();
		Map<String, Object> form = null;
		String fileName = (String) context.get("fileName");
		try{
//		URL url = new ComponentLocationResolver()
//				.resolveLocation("component://platform/widget/forms/"+fileName.trim()+".xml");
		URL url = new ComponentLocationResolver()
				.resolveLocation("component://platform/widget/forms/"+fileName+".xml");
	
		FormsDocument doc = FormsDocument.Factory.parse(url);
		for (Form f : doc.getForms().getFormArray()) {
			form = FastMap.newInstance();
			form.put("formId", f.getId());
//			form.put("target", f.getTarget());
			form.put("name", f.getName());
			form.put("type", f.getType());
			datas.add(form);
		}
		result.put("formList", datas);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}

	public static Map<String, Object> createFormGroup(DispatchContext ctx,
			Map<String, ? extends Object> context) {
		Map<String, Object> result = FastMap.newInstance();
		Delegator delegator = ctx.getDelegator();
		String formGroupId = delegator.getNextSeqId("FormGroup");
		GenericValue formGroup = delegator.makeValue("FormGroup",
				UtilMisc.toMap("formGroupId", formGroupId));
		formGroup.setNonPKFields(context);
		formGroup.set("fileName", UUID.randomUUID().toString());
		try {
			formGroup.create();
		} catch (GenericEntityException e) {
			Debug.logWarning(e.getMessage(), module);
			return ServiceUtil.returnError("创建FormGroup失败!");
		}
		try {
			URL url = new ComponentLocationResolver()
					.resolveLocation("component://platform/documents/Forms.xml");
			File file = new File(new ComponentLocationResolver()
					.resolveLocation("component://platform/widget/forms/")
					.getPath());
			FileUtils.copyURLToFile(url,
					new File(file, formGroup.getString("fileName") + ".xml"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		result.put("formGroupId", formGroupId);
		result.put(ModelService.RESPONSE_MESSAGE, ModelService.RESPOND_SUCCESS);
		return result;
	}

	public static Map<String, Object> updateFormGroup(DispatchContext ctx,
			Map<String, ? extends Object> context) {
		Map<String, Object> result = FastMap.newInstance();
		Delegator delegator = ctx.getDelegator();
		String formGroupId = context.get("formGroupId").toString();
		String fileName = (String) context.get("fileName");
		GenericValue formGroup = null;
		try {
			formGroup = delegator.findByPrimaryKey("FormGroup",
					UtilMisc.toMap("formGroupId", formGroupId));
		} catch (GenericEntityException e) {
			Debug.logWarning(e.getMessage(), module);
			return ServiceUtil.returnError("未找到FormGroup!");
		}
		String oldFileName = formGroup.getString("fileName");
		formGroup.setNonPKFields(context);
		try {
			formGroup.store();
			if (!oldFileName.equals(fileName)) {
				FileUtils.moveFile(
						new File(new ComponentLocationResolver()
								.resolveLocation(
										"component://platform/widget/forms/"
												+ oldFileName + ".xml")
								.getPath()),
						new File(new File(new ComponentLocationResolver()
								.resolveLocation(
										"component://platform/widget/forms/")
								.getPath()), fileName + ".xml"));
			}
		} catch (Exception e) {
			Debug.logWarning(e.getMessage(), module);
			return ServiceUtil.returnError("更新FormGroup失败!");
		}
		result.put(ModelService.RESPONSE_MESSAGE, ModelService.RESPOND_SUCCESS);
		return result;
	}

	public static Map<String, Object> removeFormGroup(DispatchContext ctx,
			Map<String, ? extends Object> context) {
		Map<String, Object> result = FastMap.newInstance();
		Delegator delegator = ctx.getDelegator();
		String formGroupId = context.get("formGroupId").toString();
		try {
			GenericValue formGroup = delegator.findByPrimaryKey("FormGroup",
					UtilMisc.toMap("formGroupId", formGroupId));
			formGroup.remove();
			FileUtils.deleteQuietly(new File(new ComponentLocationResolver()
					.resolveLocation(
							"component://platform/widget/forms/"
									+ formGroup.getString("fileName") + ".xml")
					.getPath()));
		} catch (Exception e) {
			Debug.logWarning(e.getMessage(), module);
			return ServiceUtil.returnError("删除FormGroup失败!");
		}
		result.put(ModelService.RESPONSE_MESSAGE, ModelService.RESPOND_SUCCESS);
		return result;
	}

	public static Map<String, Object> createForm(DispatchContext ctx,
			Map<String, ? extends Object> context) {
		Map<String, Object> result = FastMap.newInstance();
		Delegator delegator = ctx.getDelegator();
		String formId = delegator.getNextSeqId("Form");
		GenericValue form = delegator.makeValue("Form",
				UtilMisc.toMap("formId", formId));
		form.setNonPKFields(context);
		form.set("formName", UUID.randomUUID().toString());
		try {
			form.create();
		} catch (GenericEntityException e) {
			Debug.logWarning(e.getMessage(), module);
			return ServiceUtil.returnError("创建Form失败!");
		}
		try {
			GenericValue group = form.getRelatedOne("FormGroup");
			URL url = new ComponentLocationResolver()
					.resolveLocation("component://platform/widget/forms/"
							+ group.getString("fileName") + ".xml");
			FormsDocument doc = FormsDocument.Factory.parse(url);
			Form formd = doc.getForms().addNewForm();
			formd.setName(form.getString("formName"));
			formd.setType(FormDocument.Form.Type.Enum.forString("single"));
			formd.setTitle("");
			formd.setId(formId);
			formd.setDefaultTableStyle("basic-table");
			XmlOptions options = new XmlOptions();
			options.setSavePrettyPrint();
			options.setSavePrettyPrintIndent(4);
			doc.save(new File(url.getPath()), options);
		} catch (Exception e) {
			Debug.logWarning(e.getMessage(), module);
			return ServiceUtil.returnError("创建Form失败!");
		}
		result.put("formId", formId);
		return result;
	}

	public static Map<String, Object> updateForm(DispatchContext ctx,
			Map<String, ? extends Object> context) {
		Map<String, Object> result = FastMap.newInstance();
		Delegator delegator = ctx.getDelegator();
		String formId = context.get("formId").toString();
		GenericValue form = null;
		try {
			form = delegator.findByPrimaryKey("Form",
					UtilMisc.toMap("formId", formId));
		} catch (GenericEntityException e) {
			Debug.logWarning(e.getMessage(), module);
			return ServiceUtil.returnError("未找到Form!");
		}
		try {
			GenericValue group = form.getRelatedOne("FormGroup");
			String fileName = group.getString("fileName");
			form.setNonPKFields(context);
			form.store();
			
			URL url = new ComponentLocationResolver()
					.resolveLocation("component://platform/widget/forms/"
							+ fileName + ".xml");
			FormsDocument doc = FormsDocument.Factory.parse(url);
			Form[] forms = doc.getForms().getFormArray();
			for (Form fo : forms) {
				if (fo.getId().equals(formId)) {
					fo.setName(form.getString("formName"));
					break;
				}
			}
			XmlOptions options = new XmlOptions();
			options.setSavePrettyPrint();
			options.setSavePrettyPrintIndent(4);
			doc.save(new File(url.getPath()), options);
		} catch (Exception e) {
			Debug.logWarning(e.getMessage(), module);
			return ServiceUtil.returnError("更新Form失败!");
		}
		result.put(ModelService.RESPONSE_MESSAGE, ModelService.RESPOND_SUCCESS);
		return result;
	}

	public static Map<String, Object> deleteForm(DispatchContext ctx,
			Map<String, ? extends Object> context) {
		Map<String, Object> result = FastMap.newInstance();
		Delegator delegator = ctx.getDelegator();
		String formId = context.get("formId").toString();
		String formGroupId=null;
		try {
			GenericValue form = delegator.findByPrimaryKey("Form",
					UtilMisc.toMap("formId", formId));
			formGroupId=form.getString("formGroupId");
			form.remove();
			GenericValue formGroup = delegator.findByPrimaryKey("FormGroup",
					UtilMisc.toMap("formGroupId", formGroupId));
			//删除节点
			URL url = new ComponentLocationResolver()
			.resolveLocation("component://platform/widget/forms/"
					+ formGroup.getString("fileName") + ".xml");
			FormsDocument doc = FormsDocument.Factory.parse(url);
			Form[] forms = doc.getForms().getFormArray();
			for (int i=0;i<forms.length;i++) {
				if (forms[i].getId().equals(formId)) {
						doc.getForms().removeForm(i);
					break;
				}
			}
			XmlOptions options = new XmlOptions();
			options.setSavePrettyPrint();
			options.setSavePrettyPrintIndent(4);
			doc.save(new File(url.getPath()), options);
		} catch (Exception e) {
			Debug.logWarning(e.getMessage(), module);
			return ServiceUtil.returnError("删除Form失败!");
		}
		result.put(ModelService.RESPONSE_MESSAGE, ModelService.RESPOND_SUCCESS);
		return result;
	}
	
	public static Map<String, Object> examinationForm(DispatchContext dctx,
			Map<String, ? extends Object> context){
		Map<String, Object> result = ServiceUtil.returnSuccess();
		String xmlName = context.get("xmlname").toString();
		String formName = context.get("formname").toString();
		boolean findForm = false;
		if(StringUtils.isNotEmpty(xmlName) && StringUtils.isNotEmpty(formName)){
			URL url = null;
			try {
				url = new ComponentLocationResolver().resolveLocation("component://platform/widget/forms/"+ xmlName +".xml");
			} catch (Exception e) {
				result.put("findform", "false");
				e.printStackTrace();
				return result;
			}
			try {
				FormsDocument doc = FormsDocument.Factory.parse(url);
				Form[] fs = doc.getForms().getFormArray();
				for(Form f : fs){
					if(StringUtils.equals(f.getName(), formName)){
						findForm = true;
						break;
					}
				}
			} catch (Exception e) {
				result.put("findform", "false");
				e.printStackTrace();
				return result;
			}
		}
		if(findForm){
			result.put("formname", formName);
			result.put("xmlpath", "component://platform/widget/forms/"+ xmlName +".xml");
			result.put("findform", "true");
		}else{
			result.put("formname", "main");
			result.put("xmlpath", "main");
			result.put("findform", "false");
		}
		return result;
	}
}
