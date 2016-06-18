package com.eliteams.quick4j.web.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.core.generic.GenericServiceImpl;
import com.eliteams.quick4j.web.dao.SapOrderMapper;
import com.eliteams.quick4j.web.model.SapOrder;
import com.eliteams.quick4j.web.service.SapOrderService;

@Service
public class SapOrderServiceImpl extends GenericServiceImpl<SapOrder, Long> implements SapOrderService {

	@Resource
    private SapOrderMapper sapOrderMapper;

	@Override
	public SapOrder gerProductOrderInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GenericDao<SapOrder, Long> getDao() {
		// TODO Auto-generated method stub
		return sapOrderMapper;
	}
	
	
}
