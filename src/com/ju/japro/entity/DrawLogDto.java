package com.ju.japro.entity;


/**
 * D0提款记录表
 * 
 * @author zhanglschn
 * @date 20170516
 * @version 1.0
 */
public class DrawLogDto {
	/**
	 * 主键ID
	 */
	private long drawId;

	/**
	 * 交易类型
	 */
	private int transType;

	/**
	 * 提款流水号
	 */
	private String drawCode;

	/**
	 * 机构流水号
	 */
	private String transAgencyKey;

	/**
	 * 内部流水号
	 */
	private String transKey;

	/**
	 * 通道流水号
	 */
	private String transInsKey;

	/**
	 * 通道返回流水号
	 */
	private String transInsReKey;

	/**
	 * 提款交易结果
	 */
	private String drawRet;

	/**
	 * 提款交易结果信息
	 */
	private String drawResp;

	/**
	 * 通道交易结果
	 */
	private String insTransCode;

	/**
	 * 通道交易结果信息
	 */
	private String insTransResp;

	/**
	 * 机构编号
	 */
	private String agencyCode;

	/**
	 * 机构名称
	 */
	private String agencyName;

	/**
	 * 前端商户编号
	 */
	private String mchntCode;

	/**
	 * 前端商户名称
	 */
	private String mchntName;

	/**
	 * 通道编号
	 */
	private String insCode;

	/**
	 * 通道名称
	 */
	private String insName;

	/**
	 * 通道商户编号
	 */
	private String insMchntCode;

	/**
	 * 通道商户名称
	 */
	private String insMchntName;

	/**
	 * 功能码.固定为:7001
	 */
	private String funCod;

	/**
	 * 机构代码
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
	 * 账号
	 */
	private String accountNo;

	/**
	 * 当日可提余额
	 */
	private long available;

	/**
	 * 提款账户余额
	 */
	private long balance;

	/**
	 * 机构账户余额
	 */
	private long surplusAgtAmt;

	/**
	 * 每日封顶提款额度
	 */
	private long dayMaxAmt;

	/**
	 * 每笔最低提款额度
	 */
	private long dayMinAmt;

	/**
	 * 单笔封顶提款额度
	 */
	private long dealsMaxAmt;

	/**
	 * 单日封顶提款笔数
	 */
	private long dayMaxDeals;

	/**
	 * 提款交易金额
	 */
	private long amount;

	/**
	 * 出款账号，行业卡卡号
	 */
	private long accountId;

	/**
	 * 提款时间
	 */
	private String transTime;

	/**
	 * 创建时间
	 */
	private String creTime;

	/**
	 * 更新日期
	 */
	private String updTime;

	public long getDrawId() {
		return drawId;
	}

	public void setDrawId(long drawId) {
		this.drawId = drawId;
	}

	public int getTransType() {
		return transType;
	}

	public void setTransType(int transType) {
		this.transType = transType;
	}

	public String getDrawCode() {
		return drawCode;
	}

	public void setDrawCode(String drawCode) {
		this.drawCode = drawCode;
	}

	public String getTransAgencyKey() {
		return transAgencyKey;
	}

	public void setTransAgencyKey(String transAgencyKey) {
		this.transAgencyKey = transAgencyKey;
	}

	public String getTransKey() {
		return transKey;
	}

	public void setTransKey(String transKey) {
		this.transKey = transKey;
	}

	public String getTransInsKey() {
		return transInsKey;
	}

	public void setTransInsKey(String transInsKey) {
		this.transInsKey = transInsKey;
	}

	public String getTransInsReKey() {
		return transInsReKey;
	}

	public void setTransInsReKey(String transInsReKey) {
		this.transInsReKey = transInsReKey;
	}

	public String getDrawRet() {
		return drawRet;
	}

	public void setDrawRet(String drawRet) {
		this.drawRet = drawRet;
	}

	public String getDrawResp() {
		return drawResp;
	}

	public void setDrawResp(String drawResp) {
		this.drawResp = drawResp;
	}

	public String getInsTransCode() {
		return insTransCode;
	}

	public void setInsTransCode(String insTransCode) {
		this.insTransCode = insTransCode;
	}

	public String getInsTransResp() {
		return insTransResp;
	}

	public void setInsTransResp(String insTransResp) {
		this.insTransResp = insTransResp;
	}

	public String getAgencyCode() {
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode) {
		this.agencyCode = agencyCode;
	}

	public String getAgencyName() {
		return agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	public String getMchntCode() {
		return mchntCode;
	}

	public void setMchntCode(String mchntCode) {
		this.mchntCode = mchntCode;
	}

	public String getMchntName() {
		return mchntName;
	}

	public void setMchntName(String mchntName) {
		this.mchntName = mchntName;
	}

	public String getInsCode() {
		return insCode;
	}

	public void setInsCode(String insCode) {
		this.insCode = insCode;
	}

	public String getInsName() {
		return insName;
	}

	public void setInsName(String insName) {
		this.insName = insName;
	}

	public String getInsMchntCode() {
		return insMchntCode;
	}

	public void setInsMchntCode(String insMchntCode) {
		this.insMchntCode = insMchntCode;
	}

	public String getInsMchntName() {
		return insMchntName;
	}

	public void setInsMchntName(String insMchntName) {
		this.insMchntName = insMchntName;
	}

	public String getFunCod() {
		return funCod;
	}

	public void setFunCod(String funCod) {
		this.funCod = funCod;
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

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public long getAvailable() {
		return available;
	}

	public void setAvailable(long available) {
		this.available = available;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public long getSurplusAgtAmt() {
		return surplusAgtAmt;
	}

	public void setSurplusAgtAmt(long surplusAgtAmt) {
		this.surplusAgtAmt = surplusAgtAmt;
	}

	public long getDayMaxAmt() {
		return dayMaxAmt;
	}

	public void setDayMaxAmt(long dayMaxAmt) {
		this.dayMaxAmt = dayMaxAmt;
	}

	public long getDayMinAmt() {
		return dayMinAmt;
	}

	public void setDayMinAmt(long dayMinAmt) {
		this.dayMinAmt = dayMinAmt;
	}

	public long getDealsMaxAmt() {
		return dealsMaxAmt;
	}

	public void setDealsMaxAmt(long dealsMaxAmt) {
		this.dealsMaxAmt = dealsMaxAmt;
	}

	public long getDayMaxDeals() {
		return dayMaxDeals;
	}

	public void setDayMaxDeals(long dayMaxDeals) {
		this.dayMaxDeals = dayMaxDeals;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getTransTime() {
		return transTime;
	}

	public void setTransTime(String transTime) {
		this.transTime = transTime;
	}

	public String getCreTime() {
		return creTime;
	}

	public void setCreTime(String creTime) {
		this.creTime = creTime;
	}

	public String getUpdTime() {
		return updTime;
	}

	public void setUpdTime(String updTime) {
		this.updTime = updTime;
	}
}