package com.kyt.platform.form;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javolution.util.FastMap;

import org.apache.xmlbeans.SchemaStringEnumEntry;
import org.apache.xmlbeans.XmlOptions;
import org.ofbiz.base.location.ComponentLocationResolver;
import org.ofbiz.base.util.Debug;
import org.ofbiz.base.util.UtilMisc;
import org.ofbiz.entity.Delegator;
import org.ofbiz.entity.GenericEntityException;
import org.ofbiz.entity.GenericValue;
import org.ofbiz.service.DispatchContext;
import org.ofbiz.service.ServiceUtil;

import com.kyt.xsd.widgetform.FormDocument;
import com.kyt.xsd.widgetform.FormDocument.Form;
import com.kyt.xsd.widgetform.FormDocument.Form.Type.Enum;
import com.kyt.xsd.widgetform.FormsDocument;


public class FormEvents {

	public static final String module = FormEvents.class.getName();
	public static String setFormAttribute(HttpServletRequest request,
		HttpServletResponse response) {
		FormsDocument doc =null;
		URL url=null;
		GenericValue forminfo=null;
		 Delegator delegator = (Delegator) request.getAttribute("delegator");
		String formId=request.getParameter("formId");
		String formName=request.getParameter("formName");
		String target=request.getParameter("target");
		String fileName=request.getParameter("fileName");
		String formGroupId=request.getParameter("formGroupId");
			try{
				 url = new ComponentLocationResolver()
				.resolveLocation("component://platform/widget/forms/"+fileName+".xml");		
				 doc = FormsDocument.Factory.parse(url);
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			Form[] forms = doc.getForms().getFormArray();
			try{
					for(Form fo:forms){
						if(	fo.getId().equals(formId)){
							System.out.println("找到这个节点了。哈哈！！");
								fo.setTarget(target);
								fo.setName(formName);
								// fo.setType(FormDocument.Form.Type.Enum.forString(type));
								break;
						}
					}
					forminfo=delegator.findByPrimaryKey("FormManager", UtilMisc.toMap("formId", formId));
					System.out.println("AAAAAAAAAAAAAAAAAformName:"+formName);
					forminfo.set("formName", formName);
					forminfo.store();
				}catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
				}
				XmlOptions options = new XmlOptions();
				options.setSavePrettyPrint();
				options.setSavePrettyPrintIndent(4);
				try {
					doc.save(new File(url.getPath()), options);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				request.setAttribute("groupId",formGroupId);
			return "success";
	}
	public static String getFormAttribute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		FormsDocument doc =null;
		URL url=null;
		Form[] forms = null;
		List<GenericValue> formValue = null;
		String formId=null;
		Map<String , Object> formAttribute=FastMap.newInstance(); 
		 Delegator delegator = (Delegator) request.getAttribute("delegator");
		String formName=request.getParameter("formName");
		String fileName=request.getParameter("fileName");
		String formGroupId=request.getParameter("formGroupId");
		try{
				formValue = delegator.findByAnd("FormManager",UtilMisc.toMap("formName", formName,"formGroupId",formGroupId));
				System.out.println(formValue);
				if(formValue!=null){
					formId=formValue.get(0).getString("formId");
				}
				url = new ComponentLocationResolver()
				.resolveLocation("component://platform/widget/forms/"+fileName+".xml");		
				doc = FormsDocument.Factory.parse(url);
				 forms = doc.getForms().getFormArray();
		}catch (Exception e) {
			e.printStackTrace();
		}
		for(Form fo:forms){
			try{
				if(	fo.getId().equals(formId)){
					formAttribute.put("formName", fo.getName());
					formAttribute.put("formTitle", fo.getTitle());
					formAttribute.put("formtarget", fo.getTarget());
					formAttribute.put("formType", fo.getType());
					formAttribute.put("formId", formId);
					formAttribute.put("formGroupId", formGroupId);
					break;
				}
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		formAttribute.put("fileName",fileName);
		request.setAttribute("formAtt", formAttribute);
		return "success";
	}
	//新建表单操作
	public static String createFormaction(HttpServletRequest request,
			HttpServletResponse response) {
			 Delegator delegator = (Delegator) request.getAttribute("delegator");
			 String formId = delegator.getNextSeqId("FormGroup");
			FormsDocument doc =null;
			URL url=null;
			String formName=request.getParameter("formName");
			String formGroupId=request.getParameter("formGroupId");
			String type=request.getParameter("type");
			String target=request.getParameter("target");
			String formNamezh=request.getParameter("formNamezh");
			String fileName=null;
		   try {
					GenericValue groups = delegator.findByPrimaryKey("FormGroup", UtilMisc.toMap("formGroupId", formGroupId));
					fileName=groups.getString("fileName");
			} catch (GenericEntityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		   if(fileName!=null){
			try{
					url = new ComponentLocationResolver()
					.resolveLocation("component://platform/widget/forms/"+fileName+".xml");		
					
					doc = FormsDocument.Factory.parse(url);
					XmlOptions options = new XmlOptions();
					options.setSavePrettyPrint();
					options.setSavePrettyPrintIndent(4);
					Form formd=doc.getForms().addNewForm();
					formd.setName(formName);
					formd.setType(FormDocument.Form.Type.Enum.forString("single"));
					formd.setTitle("");
					formd.setTarget(target);
					formd.setId(formId);
					formd.setDefaultTableStyle("basic-table");
					doc.save(new File(url.getPath()),options);
				try{
					delegator.create("FormManager",UtilMisc.toMap("formId", formId,"formGroupId",formGroupId,"formName",formName,"formNamezh",formNamezh));
				}catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					System.out.println("【数据库插入数据出现异常】");
				}
				}catch (Exception e) {
				// TODO: handle exception
			}
			request.setAttribute("fileName",fileName);
			request.setAttribute("groupId",formGroupId);
			return "success";
		   }	
		   return "fail";
	}
	public static String deleteFormaction(HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		FormsDocument doc =null;
		URL url=null;
		XmlOptions options=null;
		Form[] forms = null;
		List<GenericValue> formValue = null;
		String formId=null;
		Map<String , Object> formAttribute=FastMap.newInstance(); 
		 Delegator delegator = (Delegator) request.getAttribute("delegator");
		String formName=request.getParameter("formName");
		String fileName=request.getParameter("fileName");
		String formGroupId=request.getParameter("formGroupId");
		formValue = delegator.findByAnd("FormManager",UtilMisc.toMap("formName", formName,"formGroupId",formGroupId));
		if(formValue!=null){
			formId=formValue.get(0).getString("formId");
		}
		try{
			url = new ComponentLocationResolver()
			.resolveLocation("component://platform/widget/forms/"+fileName+".xml");		
			doc = FormsDocument.Factory.parse(url);
			 options = new XmlOptions();
			options.setSavePrettyPrint();
			options.setSavePrettyPrintIndent(4);
			 forms = doc.getForms().getFormArray();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		for(Form fo:forms){
			try{
				if(	fo.getId().equals(formId)){
					fo.setNil(); 
					break;
				}
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println(doc);
		int  i=	delegator.removeByAnd("FormManager", UtilMisc.toMap("formId", formId));
		doc.save(new File(url.getPath()),options);
		return "success";
	}
}
