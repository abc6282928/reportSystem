<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<form id="pagerForm" method="post" action="#rel#">
	<input type="hidden" name="pageNum" value="1" />
	<input type="hidden" name="numPerPage" value="${model.numPerPage}" />
	<input type="hidden" name="orderField" value="${param.orderField}" />
	<input type="hidden" name="orderDirection" value="${param.orderDirection}" />
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
			<li><a class="add" href="rest/scrap/add" target="navTab"><span>编制</span></a></li>
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
				<th width="120">报废单编号</th>
				<th width="120">物料编码</th>
				<th width="80">物料描述</th>
				<th width="100">报废日期</th>
				<th width="80">班次</th>
				<th width="80">报废数量</th>
				<th width="120">工序</th>
				<th width="80">质检员</th>
				<th width="120">制单时间</th>
				<th width="80">审核人</th>
				<th width="100">审核时间</th>
				<th width="120">审核内容</th>
				<th width="120">报废核准量</th>
				<th width="120">原始凭证</th>
				<th width="80">审核状态</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${scrapList}" varStatus="s">
			<tr target="slt_objId" rel="${item.scrapId}">
				<td><input name="ids" value="${item.scrapId}" type="checkbox"></td>
				<td>${s.index + 1}</td>
				<td>${item.scrapId}</td>
				<td>${item.materialId }</td>
				<td>${item.materialDescribe }</td>
				<td><fmt:formatDate value="${item.scrapTime}" pattern="yyyy-MM-dd"/></td>
				<td>${item.classes }</td>
				<td>${item.scrapNum }</td>
				<td>${item.productionProcess }</td>
				<td>${item.inspector }</td>
				<td><fmt:formatDate value="${item.createTime}" pattern="yyyy-MM-dd"/></td>
				<td>${item.auditor }</td>
				<td><fmt:formatDate value="${item.auditingTime}" pattern="yyyy-MM-dd"/></td>
				<td>${item.auditingContents }</td>
				<td>${item.scrapAuditing }</td>
				<td>${item.file }</td>
				<td>${item.state }</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="panelBar">
		<div class="pages">
			<span>显示</span>
			<select class="combox" name="numPerPage" onchange="navTabPageBreak({numPerPage:this.value})">
				<option value="20">20</option>
				<option value="50">50</option>
				<option value="100">100</option>
				<option value="200">200</option>
			</select>
			<span>条，共${totalCount}条</span>
		</div>
		
		<div class="pagination" targetType="navTab" totalCount="200" numPerPage="20" pageNumShown="10" currentPage="1"></div>

	</div>
</div>
