package com.kyt.platform.form;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.Map;

import javolution.util.FastList;
import javolution.util.FastMap;

import org.apache.commons.io.FileUtils;
import org.ofbiz.base.location.ComponentLocationResolver;
import org.ofbiz.base.util.Debug;
import org.ofbiz.base.util.UtilMisc;
import org.ofbiz.entity.Delegator;
import org.ofbiz.entity.GenericEntityException;
import org.ofbiz.entity.GenericValue;
import org.ofbiz.service.DispatchContext;
import org.ofbiz.service.ModelService;
import org.ofbiz.service.ServiceUtil;

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
			Map<String, ? extends Object> context) throws Exception {
		Map<String, Object> result = ServiceUtil.returnSuccess();
		List<Map<String, Object>> datas = FastList.newInstance();
		Map<String, Object> form = null;

		URL url = new ComponentLocationResolver()
				.resolveLocation("component://platform/widget/forms/CategoryForms.xml");
		FormsDocument doc = FormsDocument.Factory.parse(url);
		for (Form f : doc.getForms().getFormArray()) {
			form = FastMap.newInstance();
			form.put("name", f.getName());
			form.put("type", f.getType());
			datas.add(form);
		}

		result.put("formList", datas);
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
}
