package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.Scrap;
import java.util.List;

public interface ScrapMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Scrap record);

    Scrap selectByPrimaryKey(Long id);

    List<Scrap> selectAll();

    int updateByPrimaryKey(Scrap record);
}