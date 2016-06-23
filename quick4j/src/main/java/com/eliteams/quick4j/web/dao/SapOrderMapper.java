package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.SapOrder;
import java.util.List;

public interface SapOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SapOrder record);

    SapOrder selectByPrimaryKey(Long id);

    List<SapOrder> selectAll();

    int updateByPrimaryKey(SapOrder record);
}