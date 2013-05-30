package com.kyt.platform.screen;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.Map;

import javolution.util.FastList;
import javolution.util.FastMap;

import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.XmlOptions;
import org.ofbiz.base.location.ComponentLocationResolver;
import org.ofbiz.base.util.Debug;
import org.ofbiz.base.util.UtilMisc;
import org.ofbiz.entity.Delegator;
import org.ofbiz.entity.GenericEntityException;
import org.ofbiz.entity.GenericValue;
import org.ofbiz.service.ModelService;
import org.ofbiz.service.ServiceUtil;
import org.ofbiz.service.DispatchContext;

import com.kyt.xsd.widgetscreen.ScreenDocument.Screen;
import com.kyt.xsd.widgetscreen.ScreensDocument;
import com.kyt.xsd.widgetscreen.ScreensDocument.Screens;

public class ScreenServices {

	public static final String module = ScreenServices.class.getName();

	public static Map<String, Object> getScreensList(DispatchContext dctx,
			Map<String, ? extends Object> context) {
		Map<String, Object> result = ServiceUtil.returnSuccess();
		List<Map<String, Object>> datas = FastList.newInstance();
		Map<String, Object> screens = null;
		String fileName = (String) context.get("fileName");
		try {
			URL url = new ComponentLocationResolver()
					.resolveLocation("component://platform/widget/screens/"
							+ fileName + ".xml");
			ScreensDocument doc = ScreensDocument.Factory.parse(url);
			for (Screen sc : doc.getScreens().getScreenArray()) {
				screens = FastMap.newInstance();
				screens.put("name", sc.getName());
				datas.add(screens);
			}
			result.put("screens", datas);
		} catch (Exception e) {
			Debug.logWarning(e.getMessage(), module);
		}
		return result;
	}

	public static Map<String, Object> createScreenGroup(DispatchContext ctx,
			Map<String, ? extends Object> context) {
		Map<String, Object> result = FastMap.newInstance();
		Delegator delegator = ctx.getDelegator();
		String screenGroupId = delegator.getNextSeqId("ScreenGroup");
		GenericValue screenGroup = delegator.makeValue("ScreenGroup",
				UtilMisc.toMap("screenGroupId", screenGroupId));
		screenGroup.setNonPKFields(context);
		try {
			screenGroup.create();
		} catch (Exception e) {
			Debug.logWarning(e.getMessage(), module);
			return ServiceUtil.returnError("创建screenGroup失败!");
		}
		try {
			URL url = new ComponentLocationResolver()
					.resolveLocation("component://platform/documents/Screens.xml");
			File screenfile = new File(new ComponentLocationResolver()
					.resolveLocation("component://platform/widget/screens/")
					.getPath());
			FileUtils.copyURLToFile(url,
					new File(screenfile, screenGroup.getString("fileName")
							+ ".xml"));
		} catch (Exception e) {
			Debug.logWarning(e.getMessage(), module);
		}
		result.put("screenGroupId", screenGroupId);
		result.put(ModelService.RESPONSE_MESSAGE, ModelService.RESPOND_SUCCESS);
		return result;
	}

	public static Map<String, Object> updateScreenGroup(DispatchContext ctx,
			Map<String, ? extends Object> context) {
		Map<String, Object> result = FastMap.newInstance();
		Delegator delegator = ctx.getDelegator();
		String screenGroupId = context.get("screenGroupId").toString();
		String fileName = context.get("fileName").toString();
		GenericValue screenGroup = null;
		try {
			screenGroup = delegator.findByPrimaryKey("ScreenGroup",
					UtilMisc.toMap("screenGroupId", screenGroupId));
		} catch (Exception e) {
			Debug.logWarning(e.getMessage(), module);
			return ServiceUtil.returnError("未找到ScreenGroup!");
		}
		String oldFileName = screenGroup.getString("fileName");
		screenGroup.setNonPKFields(context);
		try {
			screenGroup.store();
			if (!oldFileName.equals(fileName)) {
				FileUtils.moveFile(
						new File(new ComponentLocationResolver()
								.resolveLocation(
										"component://platform/widget/screens/"
												+ oldFileName + ".xml")
								.getPath()),
						new File(new File(new ComponentLocationResolver()
								.resolveLocation(
										"component://platform/widget/screens/")
								.getPath()), fileName + ".xml"));
			}
		} catch (Exception e) {
			Debug.logWarning(e.getMessage(), module);
			return ServiceUtil.returnError("ScreenGroup保存失败!");
		}
		result.put(ModelService.RESPONSE_MESSAGE, ModelService.RESPOND_SUCCESS);
		return result;
	}
	
	public static Map<String, Object> removeScreenGroup(DispatchContext ctx,
			Map<String, ? extends Object> context) {
		Map<String, Object> result = FastMap.newInstance();
		Delegator delegator = ctx.getDelegator();
		String screenGroupId = context.get("screenGroupId").toString();
		GenericValue screenGroup = null;
		try {
			screenGroup = delegator.findByPrimaryKey("ScreenGroup", UtilMisc.toMap("screenGroupId",screenGroupId));
			screenGroup.remove();
			FileUtils.deleteQuietly(new File(new ComponentLocationResolver().resolveLocation("component://platform/widget/screens/"+ screenGroup.getString("fileName") + ".xml").getPath()));
			
		} catch (Exception e) {
			Debug.logWarning(e.getMessage(), module);
			return ServiceUtil.returnError("ScreenGroup刪除失败!");
		}
		result.put(ModelService.RESPONSE_MESSAGE, ModelService.RESPOND_SUCCESS);
		return result;
	}
	
	public static Map<String, Object> createScreens(DispatchContext ctx,
			Map<String, ? extends Object> context) {
		Map<String, Object> result = FastMap.newInstance();
		Delegator delegator = ctx.getDelegator();
		String screenId = delegator.getNextSeqId("Screen");
		GenericValue screens = delegator.makeValue("Screen",
				UtilMisc.toMap("screenId", screenId));
		screens.setNonPKFields(context);
		try {
			screens.create();
		} catch (Exception e) {
			Debug.logWarning(e.getMessage(), module);
			return ServiceUtil.returnError("添加screen记录失败!");
		}
		String fileName = getScreensFileName(delegator,screens.getString("screenGroupId"));
		try {
			if(fileName==null){
				return ServiceUtil.returnError("screen文件没有找到!");
			}
			URL url = new ComponentLocationResolver()
					.resolveLocation("component://platform/widget/screens/"
					+ fileName + ".xml");
			ScreensDocument doc = ScreensDocument.Factory.parse(url);
			Screens rootscreen = doc.getScreens();
			Screen newscreen = rootscreen.addNewScreen();
			newscreen.setName(screens.getString("screenName"));
			XmlOptions options = new XmlOptions();
			options.setSavePrettyPrint();
			options.setSavePrettyPrintIndent(4);
			doc.save(new File(url.getPath()),options);
		} catch (Exception e) {
			Debug.logWarning(e.getMessage(), module);
			return ServiceUtil.returnError("添加screen内容失败!");
		}
		result.put("screenId", screenId);
		result.put(ModelService.RESPONSE_MESSAGE, ModelService.RESPOND_SUCCESS);
		return result;
	}
	
	public static Map<String, Object> updateScreens(DispatchContext ctx,
			Map<String, ? extends Object> context) {
		Map<String, Object> result = FastMap.newInstance();
		Delegator delegator = ctx.getDelegator();
		String screenId = context.get("screenId").toString();
		String screenName = context.get("screenName").toString();
		GenericValue screen = null;
		try {
			screen = delegator.findByPrimaryKey("Screen",
					UtilMisc.toMap("screenId", screenId));
		} catch (Exception e) {
			Debug.logWarning(e.getMessage(), module);
			return ServiceUtil.returnError("未找到Screen!");
		}
		String oldFileName = screen.getString("screenName");
		screen.setNonPKFields(context);
		try {
			screen.store();
			if (!oldFileName.equals(screenName)) {
				String fileName = getScreensFileName(delegator,screen.getString("screenGroupId"));
				if(fileName==null){
					return ServiceUtil.returnError("screen文件没有找到!");
				}
				URL url = new ComponentLocationResolver()
				.resolveLocation("component://platform/widget/screens/"
				+ fileName + ".xml");
				ScreensDocument doc = ScreensDocument.Factory.parse(url);
				Screens rootscreen = doc.getScreens();
				Screen[] screens = rootscreen.getScreenArray();
				for(Screen sc : screens){
					if((sc.getName()).equals(oldFileName)){
						sc.setName(screenName);
						break;
					}
				}
				XmlOptions options = new XmlOptions();
				options.setSavePrettyPrint();
				options.setSavePrettyPrintIndent(4);
				doc.save(new File(url.getPath()),options);
			}
		} catch (Exception e) {
			Debug.logWarning(e.getMessage(), module);
			return ServiceUtil.returnError("Screen保存失败!");
		}
		result.put(ModelService.RESPONSE_MESSAGE, ModelService.RESPOND_SUCCESS);
		return result;
	}
	
	public static Map<String, Object> removeScreens(DispatchContext ctx,
			Map<String, ? extends Object> context) {
		Map<String, Object> result = FastMap.newInstance();
		Delegator delegator = ctx.getDelegator();
		String screenId = context.get("screenId").toString();
		GenericValue screen = null;
		try {
			screen = delegator.findByPrimaryKey("Screen", UtilMisc.toMap("screenId",screenId));
			String screenName = screen.getString("screenName");
			String fileName = getScreensFileName(delegator,screen.getString("screenGroupId"));
			screen.remove();
			if(fileName==null){
				return ServiceUtil.returnError("screen文件没有找到!");
			}
			URL url = new ComponentLocationResolver()
			.resolveLocation("component://platform/widget/screens/"
			+ fileName + ".xml");
			ScreensDocument doc = ScreensDocument.Factory.parse(url);
			Screens rootscreen = doc.getScreens();
			Screen[] screens = rootscreen.getScreenArray();
			int index = 0;
			for(Screen sc : screens){
				if((sc.getName()).equals(screenName)){
					rootscreen.removeScreen(index);
					break;
				}
				index++;
			}
			XmlOptions options = new XmlOptions();
			options.setSavePrettyPrint();
			options.setSavePrettyPrintIndent(4);
			doc.save(new File(url.getPath()),options);
		} catch (Exception e) {
			Debug.logWarning(e.getMessage(), module);
			return ServiceUtil.returnError("Screen刪除失败!");
		}
		result.put(ModelService.RESPONSE_MESSAGE, ModelService.RESPOND_SUCCESS);
		return result;
	}
	
	public static String getScreensFileName(Delegator delegator, String screenGroupId){
		String fileName = null;
		GenericValue screenGroup = null;
		try {
			screenGroup = delegator.findByPrimaryKey("ScreenGroup", UtilMisc.toMap("screenGroupId",screenGroupId));
			fileName = screenGroup.getString("fileName");
		} catch (GenericEntityException e) {
			Debug.logWarning(e.getMessage(), module);
		}
		return fileName;
	}
}
