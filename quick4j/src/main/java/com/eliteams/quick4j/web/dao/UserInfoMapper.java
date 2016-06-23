package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.UserInfo;
import java.util.List;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserInfo record);

    UserInfo selectByUserId(Long id);

    List<UserInfo> selectAll();

    int updateByPrimaryKey(UserInfo record);
    
    List<UserInfo> selectAllUserInfo();
}