package com.eliteams.quick4j.web.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.eliteams.quick4j.core.feature.orm.mybatis.Page;
import com.eliteams.quick4j.web.dao.UserInfoMapper;
import com.eliteams.quick4j.web.dao.UserMapper;
import com.eliteams.quick4j.web.model.User;
import com.eliteams.quick4j.web.model.UserInfo;
import com.eliteams.quick4j.web.service.UserInfoService;

/**
 * 用户Service实现类
 *
 * @author StarZou
 * @since 2014年7月5日 上午11:54:24
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;
    
    @Resource
    private UserMapper userMapper;

	@Override
	public List<UserInfo> getAllUserInfo() {
		List<UserInfo> userList = new ArrayList<UserInfo>();
		userList= userInfoMapper.selectAllUserInfo();
		return userList;
	}

	@Override
	public long insertUserInfo(User user,UserInfo userInfo) {
		userMapper.insert(user);
		long userId = user.getId();
		userInfo.setUserId(userId);
		userInfoMapper.insert(userInfo);
		return userId;
	}

	@Override
	public UserInfo getUserInfoByUserId(long userId) {
		User user = userMapper.selectByPrimaryKey(userId);
		UserInfo userInfo = userInfoMapper.selectByUserId(userId);
		userInfo.setUser(user);
		return userInfo;
	}

	@Override
	public List<UserInfo> getUserInfoByPage(Page page) {
		// TODO Auto-generated method stub
		return userInfoMapper.getUserInfoByPage(page);
	}

	  

}
