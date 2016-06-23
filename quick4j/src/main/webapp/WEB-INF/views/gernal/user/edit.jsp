<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<div class="pageContent">
	<form method="post" action="rest/user/update" class="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone);">
	<input type="hidden" name="id" value="${userInfo.userId}"/>
		<div class="pageFormContent" layoutH="56">
			
			<p>
				<label>员工姓名：</label>
				<input name="username" class="required" type="text" size="30" value="${userInfo.user.username}" readonly="readonly"/>
			</p>
			<p>
				<label>登陆密码：</label>
				<input name="password" class="required alphanumeric" value="${userInfo.user.password}" minlength="6" maxlength="20" type="text"/>
			</p>
			<p>
				<label>工号：</label>
				<input name="workNo" type="text" value="${userInfo.workNo}" size="15"/>
			</p>
			<p>
				<label>生日：</label>
				<input type="text" name="birthday" class="date" readonly="true" value="<fmt:formatDate value='${userInfo.birthday}' pattern='yyyy-MM-dd'/>"/>
				<a class="inputDateButton" href="javascript:;">选择</a>
			</p>
			<p>
				<label>手机号：</label>
				<input name="phone" class="phone" type="text" value="${userInfo.phone}" size="15"/>
			</p>
			<p>
				<label>邮箱：</label>
				<input name="email" class="email" type="text" value="${userInfo.email}" size="30"/>
			</p>
			<p>
				<label>地址：</label>
				<input name="address" type="text" value="${userInfo.address}" size="40"/>
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

