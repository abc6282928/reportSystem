<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="pageContent">
	<form method="post" action="rest/user/save" class="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone);">
		<div class="pageFormContent" layoutH="56">
			
			<p>
				<label>员工姓名：</label>
				<input name="username" class="required" type="text" size="30" value="zhangsh" alt="请输入用户姓名"/>
			</p>
			<p>
				<label>登陆密码：</label>
				<input name="password" class="required" type="text" size="30" value="123" alt="请输入该用户密码"/>
			</p>
			<p>
				<label>手机号：</label>
				<input name="phone" class="required" type="text" size="30" value="18767101996" alt="请输入该用户手机"/>
			</p>
			
		</div>
		<div class="formBar">
			<ul>
				<!--<li><a class="buttonActive" href="javascript:;"><span>保存</span></a></li>-->
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">保存</button></div></div></li>
				<li>
					<div class="button"><div class="buttonContent"><button type="button" class="close">取消</button></div></div>
				</li>
			</ul>
		</div>
	</form>
</div>

