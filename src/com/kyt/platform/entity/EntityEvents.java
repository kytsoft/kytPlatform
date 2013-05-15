package com.kyt.platform.entity;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.ofbiz.base.location.ComponentLocationResolver;

/**
 * 
 * @author lcwen
 * 
 */
public class EntityEvents {

	/**
	 * 下载实体xml
	 */
	public static String downloadEntityXml(HttpServletRequest request,
			HttpServletResponse response) {
		String xmlName = request.getParameter("xmlName");
		response.setContentType("text/xml");
		try {
			OutputStream out = response.getOutputStream();
			URL url = new ComponentLocationResolver()
					.resolveLocation("component://platform/entitydef/"
							+ xmlName + ".xml");
			InputStream in = new FileInputStream(new File(url.getPath()));
			IOUtils.copy(in, out);
			out.flush();
			out.close();
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
			return "error";
		}
		return "success";
	}

	/**
	 * 上传实体xml
	 */
	public static String uploadEntityXml(HttpServletRequest request,
			HttpServletResponse response) {
		String xmlName = request.getParameter("xmlName");
		String xmlContent = request.getParameter("xmlContent");
		try {
			URL url = new ComponentLocationResolver()
					.resolveLocation("component://platform/entitydef/"
							+ xmlName + ".xml");
			FileUtils.writeStringToFile(new File(url.getPath()), xmlContent);
		} catch (IOException e) {
			e.printStackTrace();
			return "error";
		}
		return "success";
	}
}
