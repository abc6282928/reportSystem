package com.eliteams.quick4j.web.service;

import java.util.List;

import com.eliteams.quick4j.web.model.Scrap;

/*
 * 
 * 报废单接口
 */
public interface ScrapService {
	
	List<Scrap> slelectAllScrap();//查询所有报废单信息
	void insertScrap(Scrap scrap);//编制新的报废单
	

}
