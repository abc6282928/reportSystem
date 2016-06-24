<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<div class="pageContent">
	<form method="post" action="<c:url value='rest/scrap/insert?navTabId=scrapNav&callbackType=closeCurrent'/>" class="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone);">
		<div class="formBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">保存</button></div></div></li>
				<li>
					<div class="button"><div class="buttonContent"><button type="button" class="close">取消</button></div></div>
				</li>
			</ul>
		</div>
		<div class="pageFormContent" layoutH="56">
			
			<p>
				<label>报废单：</label>
				<input name="scrapId" class="required" type="text" size="30"/>
			</p>
			<!-- <p>
				<label>登陆密码：</label>
				<input id="passwd" name="password" class="required alphanumeric" minlength="6" maxlength="20" type="password" alt="密码"/>
			</p>
			<p>
				<label>密码确认：</label>
				<input type="password" class="required alphanumeric" size="20" alt="确认密码" equalto="#passwd"/>
			</p> -->
			<p>
				<label>物料编码：</label>
				<input name="materialId" class="required" type="text" size="30"/>
			</p>
			<p>
				<label>物料描述：</label>
				<input name="materialDescribe" class="required" type="text" size="30"/>
			</p>
			<!-- <p>
				<label>工号：</label>
				<input name="workNo" type="text" size="15" alt="工号"/>
			</p> -->
			<p>
				<label>报废日期：</label>
				<input type="text" name="scrapTime" class="date" readonly="true"/>
				<a class="inputDateButton" href="javascript:;">选择</a>
			</p>
			<p>
				<label>报废量：</label>
				<input name="scrapNum" class="required" type="text" size="30"/>
			</p>
			<p>
				<label>核准量：</label>
				<input name="scrapAuditing" class="required" type="text" size="30"/>
			</p>
			<p>
				<label>工序：</label>
				<input name="productionProcess" class="required" type="text" size="30"/>
			</p>
			<p>
				<label>质检员：</label>
				<input name="inspector" class="required" type="text" size="30"/>
			</p>
			<p>
				<label>班次：</label>
				<!-- <div id="combox_1059839" class="select">
					<a class="required" href="javascript:;" name="classes" value="早"></a>
					<select class="required" name="classes">
						<option value="">请选择</option>
						<option value="早">早</option>
						<option value="中">中</option>
						<option value="晚">晚</option>
					</select>
				</div> -->
				<input name="classes" class="required" type="text" size="30"/>
			</p>
			<p>
				<label>制单日期：</label>
				<input type="text" name="createTime" class="date" readonly="true"/>
				<a class="inputDateButton" href="javascript:;">选择</a>
			</p>
			<!-- <p>
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
			</p>-->
			
		</div>
		
	</form>
</div>

