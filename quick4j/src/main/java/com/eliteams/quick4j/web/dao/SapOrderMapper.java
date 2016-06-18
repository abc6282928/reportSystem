package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.SapOrder;
import com.eliteams.quick4j.web.model.SapOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SapOrderMapper {
    int countByExample(SapOrderExample example);

    int deleteByExample(SapOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SapOrder record);

    int insertSelective(SapOrder record);

    List<SapOrder> selectByExample(SapOrderExample example);

    SapOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SapOrder record, @Param("example") SapOrderExample example);

    int updateByExample(@Param("record") SapOrder record, @Param("example") SapOrderExample example);

    int updateByPrimaryKeySelective(SapOrder record);

    int updateByPrimaryKey(SapOrder record);
}