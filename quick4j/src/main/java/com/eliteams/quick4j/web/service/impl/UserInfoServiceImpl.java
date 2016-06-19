package com.eliteams.quick4j.web.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.core.generic.GenericServiceImpl;
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
public class UserInfoServiceImpl extends GenericServiceImpl<UserInfo, Long> implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;
    
    @Resource
    private UserMapper userMapper;

	@Override
	public List<UserInfo> getUserInfoList(UserInfo userInfo) {
		User user = userInfo.getUser();
		
		return null;
	}

	@Override
	public GenericDao<UserInfo, Long> getDao() {
		return userInfoMapper;
	}

    

}
