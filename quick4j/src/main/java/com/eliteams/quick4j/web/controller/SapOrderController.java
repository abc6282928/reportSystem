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
		Date alterDate = new Date(2016-1900,3,4);
		Date alterTime = new Date(2016-1900,3,4,5,30,0);
		sapOrderService.getSingleProductOrderInfo(factory,alterDate,alterTime);
	}
	
	
	@RequestMapping(value = "/testReport")
	public void testReport(){
		ReportYield ry = new ReportYield();
		ry.setMessageId("300000013");
		ry.setOperation("A");
		ry.setProductOrderId("000010043494");
		ry.setProcessDescribe("旋压");
		ry.setCurrentYield(150);
		ry.setCurrentWaste(20);
		ry.setManufactureDate(new Date(2016-1900,3,4));
		ry.setClasses("早班");
		sapOrderService.reporCurrentYield(ry);
	}
}
