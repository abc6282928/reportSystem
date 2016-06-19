package com.eliteams.quick4j.web.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eliteams.quick4j.web.dao.SapOrderMapper;
import com.eliteams.quick4j.web.model.ReportYield;
import com.eliteams.quick4j.web.model.SapOrder;
import com.eliteams.quick4j.web.service.SapOrderService;

@Controller
@RequestMapping(value = "/sapOrder")
public class SapOrderController {
	
	@Resource
	SapOrderService sapOrderService;
	
	@RequestMapping(value = "/testInsert")
	public void testInsert(){
		String factory = "1001";
		Date alterDate = new Date();
		Date alterTime = new Date();
		sapOrderService.getSingleProductOrderInfo(factory,alterDate,alterTime);
	}
	
	
	@RequestMapping(value = "/testReport")
	public void testReport(){
		ReportYield ry = new ReportYield();
		ry.setMessageId("xx");
		ry.setOperation("A");
		ry.setProductOrderId("dd0001");
		ry.setProcessDescribe("合成");
		ry.setManufactureDate(new Date());
		ry.setClasses("0021");
		sapOrderService.reporCurrentYield(ry);
	}
}
