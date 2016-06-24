package com.eliteams.quick4j.web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eliteams.quick4j.core.entity.Result;
import com.eliteams.quick4j.core.feature.orm.mybatis.Page;
import com.eliteams.quick4j.core.generic.GenericController;
import com.eliteams.quick4j.web.model.User;
import com.eliteams.quick4j.web.model.UserInfo;
import com.eliteams.quick4j.web.security.PermissionSign;
import com.eliteams.quick4j.web.security.RoleSign;
import com.eliteams.quick4j.web.service.UserInfoService;
import com.eliteams.quick4j.web.service.UserService;

/**
 * 用户控制器
 * 
 * @author zhangsh
 * @since 2014年5月28日 下午3:54:00
 **/
@Controller
@RequestMapping(value = "/user")
public class UserController extends GenericController {

    @Resource
    private UserService userService;
    
    @Resource
    private UserInfoService userInfoService;

    /**
     * 用户登录
     * 
     * @param user
     * @param result
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@Valid User user, BindingResult result, Model model, HttpServletRequest request) {
        try {
            Subject subject = SecurityUtils.getSubject();
            // 已登陆则 跳到首页
            if (subject.isAuthenticated()) {
                return "redirect:/";
            }
            if (result.hasErrors()) {
                model.addAttribute("error", "参数错误！");
                return "login";
            }
            // 身份验证
            subject.login(new UsernamePasswordToken(user.getUsername(), user.getPassword()));
            // 验证成功在Session中保存用户信息
            final User authUserInfo = userService.selectByUsername(user.getUsername());
            request.getSession().setAttribute("userInfo", authUserInfo);
        } catch (AuthenticationException e) {
            // 身份验证失败
            model.addAttribute("error", "用户名或密码错误 ！");
            return "login";
        }
        return "redirect:/";
    }

    /**
     * 用户登出
     * 
     * @param session
     * @return
     */
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session) {
        session.removeAttribute("userInfo");
        // 登出操作
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "login";
    }

    /**
     * 基于角色 标识的权限控制案例
     */
    @RequestMapping(value = "/admin")
    @ResponseBody
    @RequiresRoles(value = RoleSign.ADMIN)
    public String admin() {
        return "拥有admin角色,能访问";
    }

    /**
     * 基于权限标识的权限控制案例
     */
    @RequestMapping(value = "/create")
    @ResponseBody
    @RequiresPermissions(value = PermissionSign.USER_CREATE)
    public String create() {
        return "拥有user:create权限,能访问";
    }
    
    /**
     * 用户列表查看
     */
    @RequestMapping(value = "/list")
    public String list(Model model,Page<UserInfo> page,HttpServletRequest request) {
//    	Page<UserInfo> page = new Page<UserInfo>();
//    	String pageSize = request.getParameter("pageSize");
    	userInfoService.getUserInfoByPage(page);
//    	List<UserInfo> userInfoList = userInfoService.getAllUserInfo();
    	model.addAttribute(page);
        return "gernal/user/list";
    }
    
    /**
     * 用户添加
     */
    @RequestMapping(value = "/add")
    public String add() {
        return "gernal/user/add";
    }
    
    @RequestMapping("/edit/{userId}")
	public String edit(@PathVariable("userId") int userId, Model model) {
		UserInfo userInfo = userInfoService.getUserInfoByUserId(userId);
		model.addAttribute(userInfo);
		return "gernal/user/edit";
	}
    
    /**
     * 用户新增
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public Result save(User user, UserInfo userInfo, Model model, HttpServletRequest request) {
    	userInfoService.insertUserInfo(user,userInfo);
    	/*String userName = request.getParameter("username");
    	try {
    		userService.insert(user);
		} catch (Exception e) {
			return ajaxDoneError(e.getMessage());
		}

		return ajaxDoneSuccess(getMessage("msg.operation.success"));*/
    	/*ModelAndView mav = new ModelAndView("ajaxDone");
		mav.addObject("statusCode", 200);
		mav.addObject("message", "Success");
		mav.addObject("forwardUrl", "rest/user/list");
		return mav;*/
    	Result result = new Result();
    	result.setStatusCode("200");
    	result.setMessage("success");
    	result.setNavTabId("userLiNav");
    	result.setCallbackType("closeCurrent");
    	result.setRel("userLiNav");
    	return result;
    }
}
