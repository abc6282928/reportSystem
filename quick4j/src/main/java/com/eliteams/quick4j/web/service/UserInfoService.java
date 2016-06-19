package com.eliteams.quick4j.web.service;

import java.util.List;

import com.eliteams.quick4j.core.generic.GenericService;
import com.eliteams.quick4j.web.model.UserInfo;

/**
 * 用户 业务 接口
 * 
 * @author StarZou
 * @since 2014年7月5日 上午11:53:33
 **/
public interface UserInfoService extends GenericService<UserInfo, Long> {

	/**
	 * 用户信息列表展示
	 */
    List<UserInfo> getUserInfoList(UserInfo userInfo);
}
