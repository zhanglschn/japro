package com.ju.japro.structalg.eleven.holding;


import java.net.URLEncoder;

import com.alibaba.fastjson.JSON;

public class Test {

	public static void main(String[] args) {
		A a = new A();
		
//		{"criteria":"mpc","datype":4,"startTime":"","endTime":"","pageNo":0,"pageSize":10,"orderBy":"initiate_time","descend":true}
		
		
//		a.setAppName("mpc");
//		a.setCriteria("");
//		a.setDatype(4);
//		a.setSource("");
//		a.setClassifyCode("");
//		a.setStartTime("");
//		a.setEndTime("");
//		a.setOrderBy("classify_code");
//		a.setDescend(false);
//		a.setStartTime("");
//		a.setEndTime("");
//		a.setOrderBy("initiate_time");
//		a.setDescend(true);
//		a.setArithmeticId("4");
		a.setType(3);
		a.setQueryStatus(1);
		a.setCriteria("");
		a.setDatype(4);
		a.setApplyTimeBegin("");
		a.setApplyTimeEnd("");
		a.setOrderBy("");
		a.setDescend(true);
		String str = JSON.toJSONString(a);
		
		System.out.println(str);
		System.out.println(URLEncoder.encode(str));
	}

}

class A {
	
	private String criteria;
	private int datype = 4;
	private String startTime;
	private String endTime;
	private String arithmeticId;
	private String source;
	private String classifyCode;
	private int type;
	private int queryStatus;
	private String applyTimeBegin;
	private String applyTimeEnd;
	
	
	/**
	 * 应用名称
	 */
//	private String appName;
	
	/**
	 * 排序字段
	 * @description 排序字段.initiate_time:发起时间；status:状态
	 */
	private String orderBy;
	
	/**
	 * 倒序排序
	 * @description true:倒序排列；false或者为空，则是升序排列
	 */
	private Boolean descend;

	
//	public String getAppName() {
//		return appName;
//	}
//
//	public void setAppName(String appName) {
//		this.appName = appName;
//	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public Boolean getDescend() {
		return descend;
	}

	public void setDescend(Boolean descend) {
		this.descend = descend;
	}

	public String getCriteria() {
		return criteria;
	}

	public void setCriteria(String criteria) {
		this.criteria = criteria;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public int getDatype() {
		return datype;
	}

	public void setDatype(int datype) {
		this.datype = datype;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getClassifyCode() {
		return classifyCode;
	}

	public void setClassifyCode(String classifyCode) {
		this.classifyCode = classifyCode;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getArithmeticId() {
		return arithmeticId;
	}

	public void setArithmeticId(String arithmeticId) {
		this.arithmeticId = arithmeticId;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getQueryStatus() {
		return queryStatus;
	}

	public void setQueryStatus(int queryStatus) {
		this.queryStatus = queryStatus;
	}

	public String getApplyTimeBegin() {
		return applyTimeBegin;
	}

	public void setApplyTimeBegin(String applyTimeBegin) {
		this.applyTimeBegin = applyTimeBegin;
	}

	public String getApplyTimeEnd() {
		return applyTimeEnd;
	}

	public void setApplyTimeEnd(String applyTimeEnd) {
		this.applyTimeEnd = applyTimeEnd;
	}
}
