package com.kyt.platform.form;

import java.net.URL;
import java.util.List;
import java.util.Map;

import javolution.util.FastList;
import javolution.util.FastMap;

import org.apache.xmlbeans.XmlDocumentProperties;
import org.apache.xmlbeans.XmlOptions;
import org.ofbiz.base.location.ComponentLocationResolver;
import org.ofbiz.service.DispatchContext;
import org.ofbiz.service.ServiceUtil;

import com.kyt.xsd.widgetform.FormDocument.Form;
import com.kyt.xsd.widgetform.FormsDocument;

public class FormServices {

	public static Map<String, Object> getFormList(DispatchContext dctx,
			Map<String, ? extends Object> context) throws Exception {
		Map<String, Object> result = ServiceUtil.returnSuccess();
		List<Map<String, Object>> datas = FastList.newInstance();
		Map<String, Object> form = null;
		
		URL url = new ComponentLocationResolver()
				.resolveLocation("component://platform/widget/forms/CategoryForms.xml");
		FormsDocument doc = FormsDocument.Factory.parse(url);
		XmlDocumentProperties props = doc.documentProperties();
		System.out.println(props.getDoctypePublicId());
		System.out.println(props.getDoctypeName());
		System.out.println(props.getDoctypeSystemId());
		for(Form f : doc.getForms().getFormArray()) {
			form = FastMap.newInstance();
			form.put("name", f.getName());
			form.put("type", f.getType());
			datas.add(form);
		}

		result.put("formList", datas);
		return result;
	}

}
