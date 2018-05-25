package com.ju.japro.jaxb;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ROOT")
@XmlAccessorType(XmlAccessType.FIELD)
public class DrawReqDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private String FunCod;

	/**
	 * 机构代码。拉卡拉提供的机构代码
	 */
	private String compOrgCode;
	/**
	 * 请求流水号
	 */
	private String reqLogNo;
	/**
	 * 商户号
	 */
	private String shopNo;
	/**
	 * 提款金额
	 */
	private String amount;
	/**
	 * 账号
	 */
	private String accountNo;
	/**
	 * MAC
	 */
	private String MAC;

	public String getFunCod() {
		return FunCod;
	}

	public void setFunCod(String FunCod) {
		this.FunCod = FunCod;
	}

	public String getCompOrgCode() {
		return compOrgCode;
	}

	public void setCompOrgCode(String compOrgCode) {
		this.compOrgCode = compOrgCode;
	}

	public String getReqLogNo() {
		return reqLogNo;
	}

	public void setReqLogNo(String reqLogNo) {
		this.reqLogNo = reqLogNo;
	}

	public String getShopNo() {
		return shopNo;
	}

	public void setShopNo(String shopNo) {
		this.shopNo = shopNo;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getMAC() {
		return MAC;
	}

	public void setMAC(String MAC) {
		this.MAC = MAC;
	}
}