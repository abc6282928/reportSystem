package com.eliteams.quick4j.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eliteams.quick4j.web.dao.SapOrderMapper;
import com.eliteams.quick4j.web.model.SapOrder;

@Controller
@RequestMapping(value = "/sapOrder")
public class SapOrderController {
	
	
	@Autowired
	SapOrderMapper sapOrderMapper;
	@RequestMapping(value = "/testInsert")
	public void testInsert(){
		SapOrder so = new SapOrder();
		so.setProductOrderId("cs234");
		sapOrderMapper.insertSelective(so);
	}
}
