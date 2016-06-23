package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.ReportYield;
import java.util.List;

public interface ReportYieldMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ReportYield record);

    ReportYield selectByPrimaryKey(Long id);

    List<ReportYield> selectAll();

    int updateByPrimaryKey(ReportYield record);
}