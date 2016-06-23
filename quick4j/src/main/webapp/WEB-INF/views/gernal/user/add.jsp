<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<div class="pageContent">
	<form method="post" action="rest/user/insert" class="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone);">
		<div class="formBar">
			<ul>
				<!--<li><a class="buttonActive" href="javascript:;"><span>保存</span></a></li>-->
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">保存</button></div></div></li>
				<li>
					<div class="button"><div class="buttonContent"><button type="button" class="close">取消</button></div></div>
				</li>
			</ul>
		</div>
		<div class="pageFormContent" layoutH="56">
			
			<p>
				<label>员工姓名：</label>
				<input name="username" class="required" type="text" size="30" alt="姓名"/>
			</p>
			<p>
				<label>登陆密码：</label>
				<input id="passwd" name="password" class="required alphanumeric" minlength="6" maxlength="20" type="password" alt="密码"/>
			</p>
			<p>
				<label>密码确认：</label>
				<input type="password" class="required alphanumeric" size="20" alt="确认密码" equalto="#passwd"/>
			</p>
			<p>
				<label>工号：</label>
				<input name="workNo" type="text" size="15" alt="工号"/>
			</p>
			<p>
				<label>生日：</label>
				<input type="text" name="birthday" class="date" readonly="true"/>
				<a class="inputDateButton" href="javascript:;">选择</a>
			</p>
			<p>
				<label>手机号：</label>
				<input name="phone" class="phone" type="text" size="15" alt="手机号"/>
			</p>
			<p>
				<label>邮箱：</label>
				<input name="email" class="email" type="text" size="30" alt="邮箱"/>
			</p>
			<p>
				<label>地址：</label>
				<input name="address" type="text" size="40" alt="用户地址"/>
			</p>
			
		</div>
		
	</form>
</div>

