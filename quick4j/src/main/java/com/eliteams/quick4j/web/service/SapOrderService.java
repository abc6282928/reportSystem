package com.eliteams.quick4j.web.service;

import java.util.Date;

import com.eliteams.quick4j.core.generic.GenericService;
import com.eliteams.quick4j.web.model.ReportYield;
import com.eliteams.quick4j.web.model.SapOrder;

/**
 * sap 订单交互接口
 * @author zhang
 *
 */
public interface SapOrderService extends GenericService<SapOrder, Long> {
	void getSingleProductOrderInfo(String factory, Date alterDate, Date alterTime);
	void getMoreProductOrderInfo(String factory, Date alterDate, Date alterTime);
	
	ReportYield reporCurrentYield(ReportYield ry);
}
