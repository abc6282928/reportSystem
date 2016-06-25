package com.eliteams.quick4j.web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eliteams.quick4j.core.entity.Json;
import com.eliteams.quick4j.core.generic.GenericController;
import com.eliteams.quick4j.web.model.Scrap;
import com.eliteams.quick4j.web.service.ScrapService;

/*
 * 
 * 报废控制器
 */
@Controller
@RequestMapping(value = "/scrap")
public class ScrapController extends GenericController {

	@Resource
	private ScrapService scrapService;

	/**
	 * 报废单列表查看
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		List<Scrap> scrapList = scrapService.slelectAllScrap();
		model.addAttribute(scrapList);
		return "execute/scrap/list";
	}
	
	/**
	 * 编制新的报废单
	 * 1 页面跳转
	 * 2 数据库插入加页面刷新
	 */
	@RequestMapping(value = "/add")
	public String dispatch(){
		return "execute/scrap/add";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public Json save(Scrap scrap, Model model, HttpServletRequest request) {
		scrapService.insertScrap(scrap);
    	Json result = new Json();
    	result.setStatusCode("200");
    	result.setMessage("success");
    	result.setCallbackType("closeCurrent");
    	result.setRel("scrapNav");
    	return result;
    }
}
