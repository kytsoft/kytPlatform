package com.kyt.platform.form;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javolution.util.FastMap;

import org.apache.xmlbeans.SchemaStringEnumEntry;
import org.apache.xmlbeans.XmlOptions;
import org.ofbiz.base.location.ComponentLocationResolver;

import com.kyt.xsd.widgetform.FormDocument;
import com.kyt.xsd.widgetform.FormDocument.Form;
import com.kyt.xsd.widgetform.FormDocument.Form.Type.Enum;
import com.kyt.xsd.widgetform.FormsDocument;


public class FormEvents {

	public static String setFormAttribute(HttpServletRequest request,
			HttpServletResponse response) {
		FormsDocument doc =null;
		URL url=null;
		String formName=request.getParameter("formName");
		String type=request.getParameter("type");
		String target=request.getParameter("target");
		try{
				 url = new ComponentLocationResolver()
			.resolveLocation("component://platform/widget/forms/CategoryForms.xml");		
			
			 doc = FormsDocument.Factory.parse(url);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
			Form[] forms = doc.getForms().getFormArray();
			for(Form fo:forms){
				try{
				if(	fo.getName().equals(formName)){
					System.out.println("找到这个节点了。哈哈！！");
						fo.setTarget(target);
						fo.setName(formName);
						fo.setType(FormDocument.Form.Type.Enum.forString(type));
						break;
				}
				}catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
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
	return "success";
	}
	public static String getFormAttribute(HttpServletRequest request,
			HttpServletResponse response) {
		FormsDocument doc =null;
		URL url=null;
		Form[] forms = null;
		Map<String , Object> formAttribute=FastMap.newInstance(); 
		String formName=request.getParameter("formName");
		try{
			url = new ComponentLocationResolver()
			.resolveLocation("component://platform/widget/forms/CategoryForms.xml");		
			
			doc = FormsDocument.Factory.parse(url);
			 forms = doc.getForms().getFormArray();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		for(Form fo:forms){
			try{
				if(	fo.getName().equals(formName)){
					formAttribute.put("formName", fo.getName());
					formAttribute.put("formTitle", fo.getTitle());
					formAttribute.put("formtarget", fo.getTarget());
					formAttribute.put("formtarget", fo.getTarget());
					formAttribute.put("formType", fo.getType());
					break;
				}
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		request.setAttribute("formAtt", formAttribute);
		return "success";
	}
}
