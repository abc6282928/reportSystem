package com.eliteams.quick4j.web.service;

import com.eliteams.quick4j.core.generic.GenericService;
import com.eliteams.quick4j.web.model.SapOrder;

/**
 * sap 订单交互接口
 * @author zhang
 *
 */
public interface SapOrderService extends GenericService<SapOrder, Long> {
	SapOrder gerProductOrderInfo();
}
