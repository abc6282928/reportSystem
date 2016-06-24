package com.eliteams.quick4j.web.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.eliteams.quick4j.web.dao.ScrapMapper;
import com.eliteams.quick4j.web.model.Scrap;
import com.eliteams.quick4j.web.service.ScrapService;
/*
 * 
 * 报废接口实现类
 */
@Service
public class ScrapServiceImpl implements ScrapService {
	
	@Resource
	private ScrapMapper scrapMapper;

	@Override
	public List<Scrap> slelectAllScrap() {
		List<Scrap> scrapList = new ArrayList<Scrap>();
		scrapList = scrapMapper.selectAll();
		return scrapList;
	}

	@Override
	public void insertScrap(Scrap scrap) {
		scrapMapper.insert(scrap);
	}

}
