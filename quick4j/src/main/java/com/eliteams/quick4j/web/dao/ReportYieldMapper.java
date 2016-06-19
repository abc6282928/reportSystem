package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.ReportYield;
import com.eliteams.quick4j.web.model.ReportYieldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportYieldMapper {
    int countByExample(ReportYieldExample example);

    int deleteByExample(ReportYieldExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ReportYield record);

    int insertSelective(ReportYield record);

    List<ReportYield> selectByExample(ReportYieldExample example);

    ReportYield selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ReportYield record, @Param("example") ReportYieldExample example);

    int updateByExample(@Param("record") ReportYield record, @Param("example") ReportYieldExample example);

    int updateByPrimaryKeySelective(ReportYield record);

    int updateByPrimaryKey(ReportYield record);
}