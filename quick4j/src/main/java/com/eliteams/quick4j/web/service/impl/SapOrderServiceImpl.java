package com.eliteams.quick4j.web.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.eliteams.quick4j.core.feature.factory.SapConn;
import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.core.generic.GenericServiceImpl;
import com.eliteams.quick4j.web.dao.SapOrderMapper;
import com.eliteams.quick4j.web.model.SapOrder;
import com.eliteams.quick4j.web.service.SapOrderService;
import com.sap.conn.jco.AbapException;
import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoException;
import com.sap.conn.jco.JCoFunction;
import com.sap.conn.jco.JCoTable;

@Service
public class SapOrderServiceImpl extends GenericServiceImpl<SapOrder, Long> implements SapOrderService {

	@Resource
	private SapOrderMapper sapOrderMapper;

	@Override
	public GenericDao<SapOrder, Long> getDao() {
		// TODO Auto-generated method stub
		return sapOrderMapper;
	}

	@Override
	public void getSingleProductOrderInfo(String factory, Date alterDate, Date alterTime) {

		SapOrder so = new SapOrder();

		String AUFNR = "";// 生产订单号
		String AUART = "";// 订单类型
		String KDAUF = "";// 销售订单
		String KDPOS = "";// 订单销售行
		String SORTL = "";// 客户简称
		String VERID = "";// 生产版本
		String MATNR = "";// 物料
		String MAKTX = "";// 物料描述
		Integer PSMNG = 0;// 数量
		Integer WEMNG = 0;// 完成数
		Integer PSAMG = 0;// 确认的废品
		String AMEIN = "";// 单位
		Date GSTRS = null;// 计划开始日期
		Date GLTRS = null;// 计划完成日期
		String LOEKZ = "";// 删除标记
		String STATUS = "";// 状态

		JCoFunction function = null;
		// 连接sap，类似于连接数据库
		JCoDestination destination = SapConn.connect();
		try {
			// 调用ZBC_TOSAP_0010函数
			function = destination.getRepository().getFunction("ZBC_TOSAP_0010");
			// 将当前传入的值赋予各个参数
			function.getImportParameterList().setValue("WERKS", factory);
			function.getImportParameterList().setValue("AEDAT", alterDate);
			function.getImportParameterList().setValue("AEZEIT", alterTime);
			function.execute(destination);
			// 获取各个值
			AUFNR = function.getExportParameterList().getString("AUFNR");
			AUART = function.getExportParameterList().getString("AUART");
			KDAUF = function.getExportParameterList().getString("KDAUF");
			KDPOS = function.getExportParameterList().getString("KDPOS");
			SORTL = function.getExportParameterList().getString("SORTL");
			VERID = function.getExportParameterList().getString("VERID");
			MATNR = function.getExportParameterList().getString("MATNR");
			MAKTX = function.getExportParameterList().getString("MAKTX");
			PSMNG = function.getExportParameterList().getInt("PSMNG");
			WEMNG = function.getExportParameterList().getInt("WEMNG");
			PSAMG = function.getExportParameterList().getInt("PSAMG");
			AMEIN = function.getExportParameterList().getString("AMEIN");
			GSTRS = function.getExportParameterList().getDate("GSTRS");// 参数类型
			GLTRS = function.getExportParameterList().getDate("GLTRS");// 参数类型
			LOEKZ = function.getExportParameterList().getString("LOEKZ");
			STATUS = function.getExportParameterList().getString("STATUS");

			so.setDelRemark(LOEKZ);
			so.setFinishedTotal(WEMNG);
			so.setManufactureVersion(VERID);
			so.setMaterialId(MATNR);
			so.setMaterialDescribe(MAKTX);
			so.setPlanEndDate(GLTRS);
			so.setPlanStartDate(GSTRS);
			so.setProductOrderId(AUFNR);
			so.setProductOrderType(AUART);
			so.setSaleOrderRow(KDPOS);
			so.setSaleOrderId(KDAUF);
			so.setState(STATUS);
			so.setTargetSum(PSMNG);
			so.setUnit(AMEIN);
			so.setWasteTotal(PSAMG);
			so.setUserSimpleName(SORTL);

			sapOrderMapper.insertSelective(so);

		} catch (JCoException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void getMoreProductOrderInfo(String factory, Date alterDate, Date alterTime) {
		JCoFunction function = null;
		JCoDestination destination = SapConn.connect();
		String AUFNR = "";// 生产订单号
		String AUART = "";// 订单类型
		String KDAUF = "";// 销售订单
		String KDPOS = "";// 订单销售行
		String SORTL = "";// 客户简称
		String VERID = "";// 生产版本
		String MATNR = "";// 物料
		String MAKTX = "";// 物料描述
		Integer PSMNG = 0;// 数量
		Integer WEMNG = 0;// 完成数
		Integer PSAMG = 0;// 确认的废品
		String AMEIN = "";// 单位
		Date GSTRS = null;// 计划开始日期
		Date GLTRS = null;// 计划完成日期
		String LOEKZ = "";// 删除标记
		String STATUS = "";// 状态
		try {
			// 调用ZBC_TOSAP_0010函数
			function = destination.getRepository().getFunction("ZBC_TOSAP_0010");
			if (function == null) {
				throw new RuntimeException("ZBC_TOSAP_0010 not found in SAP.");
			}
			// 获取传入表参数GT_OUTPUT
			JCoTable GT_OUTPUT = function.getTableParameterList().getTable("GT_OUTPUT");
			GT_OUTPUT.appendRow();// 增加一行
			// 给表参数中的字段赋值
			GT_OUTPUT.setValue("WERKS", factory);
			GT_OUTPUT.setValue("AEDAT", alterDate);
			GT_OUTPUT.setValue("AEZEIT", alterTime);
			function.execute(destination);

			/*try {
				function.execute(destination);
			} catch (AbapException e) {
				System.out.println(e.toString());
				return;
			}
			// 获取Table参数：GT_OUTPUT
			JCoTable codes = function.getTableParameterList().getTable("GT_OUTPUT");
			for (int i = 0; i < codes.getNumRows(); i++) {// 遍历Table
				SapOrder so = new SapOrder();
				codes.setRow(i);// 将行指针指向特定的索引行
				AUFNR = codes.getString("AUFNR");
				AUART = codes.getString("AUART");
				KDAUF = codes.getString("KDAUF");
				KDPOS = codes.getString("KDPOS");
				SORTL = codes.getString("SORTL");
				VERID = codes.getString("VERID");
				MATNR = codes.getString("MATNR");
				MAKTX = codes.getString("MAKTX");
				PSMNG = codes.getInt("PSMNG");
				WEMNG = codes.getInt("WEMNG");
				PSAMG = codes.getInt("PSAMG");
				AMEIN = codes.getString("AMEIN");
				GSTRS = codes.getDate("GSTRS");// 参数类型
				GLTRS = codes.getDate("GLTRS");// 参数类型
				LOEKZ = codes.getString("LOEKZ");
				STATUS = codes.getString("STATUS");

				so.setDelRemark(LOEKZ);
				so.setFinishedTotal(WEMNG);
				so.setManufactureVersion(VERID);
				so.setMaterialId(MATNR);
				so.setMaterialDescribe(MAKTX);
				so.setPlanEndDate(GLTRS);
				so.setPlanStartDate(GSTRS);
				so.setProductOrderId(AUFNR);
				so.setProductOrderType(AUART);
				so.setSaleOrderRow(KDPOS);
				so.setSaleOrderId(KDAUF);
				so.setState(STATUS);
				so.setTargetSum(PSMNG);
				so.setUnit(AMEIN);
				so.setWasteTotal(PSAMG);
				so.setUserSimpleName(SORTL);

				sapOrderMapper.insertSelective(so);
			}*/

			GT_OUTPUT.firstRow();// 获取第一行的对象(此处看sap端如何写的，如果返回的可能有多行，那得循环)
			// 获取各个值
			AUFNR = GT_OUTPUT.getString("AUFNR");
			AUART = GT_OUTPUT.getString("AUART");
			KDAUF = GT_OUTPUT.getString("KDAUF");
			KDPOS = GT_OUTPUT.getString("KDPOS");
			SORTL = GT_OUTPUT.getString("SORTL");
			VERID = GT_OUTPUT.getString("VERID");
			MATNR = GT_OUTPUT.getString("MATNR");
			MAKTX = GT_OUTPUT.getString("MAKTX");
			PSMNG = GT_OUTPUT.getInt(PSMNG);
			WEMNG = GT_OUTPUT.getInt(WEMNG);
			PSAMG = GT_OUTPUT.getInt(PSAMG);
			AMEIN = GT_OUTPUT.getString("AMEIN");
			GSTRS = GT_OUTPUT.getDate("GSTRS");// 参数类型
			GLTRS = GT_OUTPUT.getDate("GLTRS");// 参数类型
			LOEKZ = GT_OUTPUT.getString("LOEKZ");
			STATUS = GT_OUTPUT.getString("STATUS");

			GT_OUTPUT.clear();// 清空本次条件，如果要继续传入值去或者还要循环，那得将之前的条件清空
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
