package com.eliteams.quick4j.web.service.impl;

import javax.annotation.Resource;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.core.generic.GenericServiceImpl;
import com.eliteams.quick4j.web.dao.SapOrderMapper;
import com.eliteams.quick4j.web.model.SapOrder;
import com.eliteams.quick4j.web.service.SapOrderService;

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
		return null;
	}

	@Override
    public int insert(SapOrder model) {
        return sapOrderMapper.insertSelective(model);
    }

    @Override
    public int update(SapOrder model) {
        return sapOrderMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public int delete(Long id) {
        return sapOrderMapper.deleteByPrimaryKey(id);
    }
}
