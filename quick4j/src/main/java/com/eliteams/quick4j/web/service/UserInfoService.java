package com.eliteams.quick4j.web.service;

import java.util.List;

import com.eliteams.quick4j.core.feature.orm.mybatis.Page;
import com.eliteams.quick4j.web.model.User;
import com.eliteams.quick4j.web.model.UserInfo;

/**
 * 用户详情 业务 接口
 * 
 * @author zhangsh
 **/
public interface UserInfoService {

	/*
	 * 用户信息列表展示
	 */
    List<UserInfo> getAllUserInfo();
    /*
     * 新建用户
     */
    long insertUserInfo(User user,UserInfo userInfo);
    /*
     * 通过userId获取用户信息
     */
    UserInfo getUserInfoByUserId(long userId);
    /*
     * Page用户信息
     */
    List<UserInfo> getUserInfoByPage(Page page);
}
