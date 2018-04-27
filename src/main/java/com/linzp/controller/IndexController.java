package com.linzp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.linzp.entity.ActivityRole;
import com.linzp.entity.BannerRole;
import com.linzp.entity.GroupRole;
import com.linzp.service.ActivityInfoService;
import com.linzp.service.BannerInfoService;
import com.linzp.service.GroupInfoService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping(value = "/index")
public class IndexController {
	@Autowired
	private ActivityInfoService activityInfoService;
	@Autowired
	private BannerInfoService bannerInfoService;
	@Autowired
	private GroupInfoService groupInfoService;

	@ResponseBody
	@RequestMapping(value = { "/getActList" }, method = { RequestMethod.GET })
	public String getActList(int count, String fromApp, HttpServletRequest request, HttpServletResponse response) throws IOException {
		JSONObject jsonObject = new JSONObject();
		List<ActivityRole> list = activityInfoService.getActList(fromApp, count);
		if (list == null || list.isEmpty()) {
			return null;
		}
		long conut = list.size();
		jsonObject.put("rows", list);
		jsonObject.put("total", conut);
		return jsonObject.toString();
	}
	
	@ResponseBody
	@RequestMapping(value = { "/getActContent" }, method = { RequestMethod.GET })
	public String getActById(String actId, HttpServletRequest request, HttpServletResponse response) throws IOException {
		JSONObject jsonObject = new JSONObject();
		ActivityRole role = activityInfoService.getActById(actId);
		
		if(role != null){
			jsonObject.put("actContent", role.getActContent());
			return jsonObject.toString();
		}else{
			return null;
		}
	}
	
	@ResponseBody
	@RequestMapping(value = { "/getBannerList" }, method = { RequestMethod.GET })
	public String getBannerList(int count, String fromApp, HttpServletRequest request, HttpServletResponse response) throws IOException {
		JSONObject jsonObject = new JSONObject();
		List<BannerRole> list = bannerInfoService.getBannerList(fromApp, count);
		if (list == null || list.isEmpty()) {
			return null;
		}
		long conut = list.size();
		jsonObject.put("rows", list);
		jsonObject.put("total", conut);
		return jsonObject.toString();
	}
	
	@ResponseBody
	@RequestMapping(value = { "/getGroupList" }, method = { RequestMethod.GET })
	public String queryListByActId(String fromApp, HttpServletRequest request, HttpServletResponse response) throws IOException {
		JSONObject jsonObject = new JSONObject();
		List<GroupRole> list = groupInfoService.getGroupList(fromApp);
		if (list == null || list.isEmpty()) {
			return null;
		}
		long conut = list.size();
		jsonObject.put("rows", list);
		jsonObject.put("total", conut);
		return jsonObject.toString();
	}
}
