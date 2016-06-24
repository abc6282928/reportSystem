<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<form id="pagerForm" method="post" action="rest/user/list">
	<input type="text" name="pageNum" value="1" />
	<input type="text" name="pageSize" value="${page.pageSize}" />
	<%-- <input type="hidden" name="orderField" value="${param.orderField}" />
	<input type="hidden" name="orderDirection" value="${param.orderDirection}" /> --%>
</form>

<div class="pageHeader">
	<form rel="pagerForm" onsubmit="return navTabSearch(this);" action="w_removeSelected.html" method="post">
	<div class="searchBar">
		<ul class="searchContent">
			<li>
				<label>我的客户：</label>
				<input type="text" name="keywords" value=""/>
			</li>
			<li>
			<select class="combox" name="province">
				<option value="">所有省市</option>
				<option value="北京">北京</option>
				<option value="上海">上海</option>
				<option value="天津">天津</option>
				<option value="重庆">重庆</option>
				<option value="广东">广东</option>
			</select>
			</li>
		</ul>
		<!--
		<table class="searchContent">
			<tr>
				<td>
					我的客户：<input type="text"/>
				</td>
				<td>
					<select class="combox" name="province">
						<option value="">所有省市</option>
						<option value="北京">北京</option>
						<option value="上海">上海</option>
						<option value="天津">天津</option>
						<option value="重庆">重庆</option>
						<option value="广东">广东</option>
					</select>
				</td>
			</tr>
		</table>
		-->
		<div class="subBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">检索</button></div></div></li>
				<li><a class="button" href="demo_page6.html" target="dialog" mask="true" title="查询框"><span>高级检索</span></a></li>
			</ul>
		</div>
	</div>
	</form>
</div>
<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<li><a class="add" href="rest/user/add" target="navTab"><span>添加</span></a></li>
			<li><a class="edit" target="navTab" rel="userNav" href="<c:url value='rest/user/edit/{slt_objId}'/>" title="编辑用户"><span>编辑</span></a></li>
			<li><a title="确实要删除这些记录吗?" target="selectedTodo" rel="ids" href="demo/common/ajaxDone.html" class="delete"><span>批量删除默认方式</span></a></li>
			<li><a title="确实要删除这些记录吗?" target="selectedTodo" rel="ids" postType="string" href="demo/common/ajaxDone.html" class="delete"><span>批量删除逗号分隔</span></a></li>
			<li><a class="edit" href="demo_page4.html?uid={sid_user}" target="navTab" warn="请选择一个用户"><span>修改</span></a></li>
			<li class="line">line</li>
			<li><a class="icon" href="demo/common/dwz-team.xls" target="dwzExport" targetType="navTab" title="实要导出这些记录吗?"><span>导出EXCEL</span></a></li>
		</ul>
	</div>
	<table class="table" layoutH="138">
		<thead>
			<tr>
				<th width="22"><input type="checkbox" group="ids" class="checkboxCtrl"></th>
				<th width="25"></th>
				<th width="80">用户名</th>
				<th width="120">工号</th>
				<th width="80">性别</th>
				<th width="100">生日</th>
				<th width="120">手机号</th>
				<th width="180">邮箱</th>
				<th width="350">地址</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${page.result}" varStatus="s">
			<tr target="slt_objId" rel="${item.userId}">
				<td><input name="ids" value="${item.userId}" type="checkbox"></td>
				<td>${s.index + 1}</td>
				<td>${item.user.username}</td>
				<td>${item.workNo}</td>
				<td>${item.sex}</td>
				<td><fmt:formatDate value="${item.birthday}" pattern="yyyy-MM-dd"/></td>
				<td>${item.phone}</td>
				<td>${item.email}</td>
				<td>${item.address}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="panelBar">
		<div class="pages">
			<span>显示</span>
			<select class="combox" name="pageSize" onchange="navTabPageBreak({numPerPage:this.value})">
				<option value="1">15</option>
				<option value="2">30</option>
				<option value="3">50</option>
				<option value="5">100</option>
			</select>
			<span>条，共${page.totalCount}条</span>
		</div>
		
		<div class="pagination" targetType="navTab" totalCount="${page.totalCount}" numPerPage="${page.pageSize}" pageNumShown="10" currentPage="${page.pageNo}"></div>

	</div>
</div>
