package com.eliteams.quick4j.web.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eliteams.quick4j.web.dao.SapOrderMapper;
import com.eliteams.quick4j.web.model.SapOrder;
import com.eliteams.quick4j.web.service.SapOrderService;

@Controller
@RequestMapping(value = "/sapOrder")
public class SapOrderController {
	
	@Resource
	SapOrderService sapOrderService;
	
	@RequestMapping(value = "/testInsert")
	public void testInsert(){
		SapOrder so = new SapOrder();
		so.setProductOrderId("cs234");
		sapOrderService.insert(so);
	}
}
