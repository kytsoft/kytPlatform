package com.kyt.platform.form;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javolution.util.FastMap;

import org.apache.xmlbeans.XmlOptions;
import org.ofbiz.base.location.ComponentLocationResolver;
import org.ofbiz.base.util.UtilHttp;
import org.ofbiz.base.util.UtilMisc;
import org.ofbiz.entity.Delegator;
import org.ofbiz.entity.GenericValue;

import com.kyt.xsd.widgetform.FormDocument.Form;
import com.kyt.xsd.widgetform.FormsDocument;

public class FormEvents {

	public static final String module = FormEvents.class.getName();
	/*
	public static String getFormAttribute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		FormsDocument doc = null;
		URL url = null;
		Form[] forms = null;
		List<GenericValue> formValue = null;
		String formId = null;
		Map<String, Object> formAttribute = FastMap.newInstance();
		Delegator delegator = (Delegator) request.getAttribute("delegator");
		String formName = request.getParameter("formName");
		String fileName = request.getParameter("fileName");
		String formGroupId = request.getParameter("formGroupId");
		try {
			formValue = delegator.findByAnd("FormManager", UtilMisc.toMap(
					"formName", formName, "formGroupId", formGroupId));
			System.out.println(formValue);
			if (formValue != null) {
				formId = formValue.get(0).getString("formId");
			}
			url = new ComponentLocationResolver()
					.resolveLocation("component://platform/widget/forms/"
							+ fileName + ".xml");
			doc = FormsDocument.Factory.parse(url);
			forms = doc.getForms().getFormArray();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (Form fo : forms) {
			try {
				if (fo.getId().equals(formId)) {
					formAttribute.put("formName", fo.getName());
					formAttribute.put("formTitle", fo.getTitle());
					formAttribute.put("formtarget", fo.getTarget());
					formAttribute.put("formType", fo.getType());
					formAttribute.put("formId", formId);
					formAttribute.put("formGroupId", formGroupId);
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		formAttribute.put("fileName", fileName);
		request.setAttribute("formAtt", formAttribute);
		return "success";
	}
	*/
	
	public static String deleteFormaction(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		FormsDocument doc = null;
		URL url = null;
		XmlOptions options = null;
		Form[] forms = null;
		List<GenericValue> formValue = null;
		String formId = null;
		Map<String, Object> formAttribute = FastMap.newInstance();
		Delegator delegator = (Delegator) request.getAttribute("delegator");
		String formName = request.getParameter("formName");
		String fileName = request.getParameter("fileName");
		String formGroupId = request.getParameter("formGroupId");
		formValue = delegator.findByAnd("FormManager", UtilMisc.toMap(
				"formName", formName, "formGroupId", formGroupId));
		if (formValue != null) {
			formId = formValue.get(0).getString("formId");
		}
		try {
			url = new ComponentLocationResolver()
					.resolveLocation("component://platform/widget/forms/"
							+ fileName + ".xml");
			doc = FormsDocument.Factory.parse(url);
			options = new XmlOptions();
			options.setSavePrettyPrint();
			options.setSavePrettyPrintIndent(4);
			forms = doc.getForms().getFormArray();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		for (Form fo : forms) {
			try {
				if (fo.getId().equals(formId)) {
					fo.setNil();
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println(doc);
		int i = delegator.removeByAnd("FormManager",
				UtilMisc.toMap("formId", formId));
		doc.save(new File(url.getPath()), options);
		return "success";
	}
}
