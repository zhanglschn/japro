package com.ju.japro.emuns;

import java.text.MessageFormat;

public enum RespCodeEnum {

	CODE_SUCCESS_NORMAL("00000", "成功"), 
	CODE_FAIL_NORMAL("10000", "失败"), 
	CODE_EXP_NORMAL("20000", "异常"), 
	CODE_PROCESSING_NORMAL("30000", "处理中"), 
	CODE_TO_BE_PROCESS_NORMAL("40000", "未支付"),
	
	// 综合鉴权服务 101
	CODE_FAIL_MCHNT_CODE_FORMAT_FALSE("10100", "商户号必须为15位"),
	CODE_FAIL_NO_TRANS_TYPE("10101","交易类型不存在"),
	CODE_FAIL_ORDER_ID_FORMAT_FALSE("10102","订单号必须为12~20位英文大小写或数字"),
	CODE_FAIL_BANK_CODE_FORMAT_FALSE("10103","银行代码不能为空"),
	CODE_FAIL_ORG_TRANS_TYPE_ERROR("10104","原交易类型错误"),
	CODE_FAIL_ORG_ORDER_ID_FORMAT_FALSE("10105","原订单号必须为12~20位英文大小写或数字"),
	CODE_FAIL_ORDER_AMOUNT_FORMAT_FALSE("10106","订单金额不正确"),
	CODE_FAIL_QUERY_MCHNT_PER_FAILED("10107","查询商户及权限失败"),
	CODE_FAIL_NO_MCHNT_PER("10108","商户信息不存在或商户无此交易权限"),
	CODE_FAIL_QUERY_AGENCY_FAILED("10109","查询代理商信息失败"),
	CODE_FAIL_NO_AGENCY("10110","代理商信息不存在"),
	CODE_FAIL_QUERY_JUBANK_FAILED("10111","查询银行信息失败"),
	CODE_FAIL_NO_JUBANK("10112","银行信息不存在"),
	CODE_FAIL_QUERY_TRANS_LOG_FAILED("10113","查询交易流水失败"),
	CODE_FAIL_ORDER_ID_REPEAT("10114","商户订单号重复"),
	CODE_FAIL_QUERY_ORG_TRANS_LOG_FAILED("10115","查询原交易流水失败"),
	CODE_FAIL_NO_ORG_TRANS_LOG_FALSE("10116","原交易流水不存在"),
	CODE_FAIL_REFUND_AMOUNT_FAIL("10117","退款总金额必须小于或等于订单的金额"),
	CODE_FAIL_ORDERID_EXISTS_FIILED("10118","流水号重复"),
	CODE_FAIL_ORDER_PAY_NOTSUCCESS_FIILED("10119","原订单未支付成功"),
	
	// 计费服务 102
	CODE_FAIL_BILLING_FEE_NOFOUND("10200","费率未配置","{0}费率未配置"),
	CODE_FAIL_BILLING_FEE_TYPE_NOT_EXISTS("10201","手续费类型不存在", "手续费类型 {0} 不存在"), 
	CODE_FAIL_AMOUNT_IS_NEGATIVE("10202","金额出现负数", "金额出现负数: {0}"),
	CODE_FAIL_BILLING_FAIL("10203","计费失败"),
	CODE_FAIL_BILLING_ERROR("10204","费率计算失败"),
	CODE_FAIL_BILLING_ARGUMENT_IS_BLANK("10205","参数为空","参数 {0} 为空"),
	
	//路由服务 103
	CODE_FAIL_NO_ROUTE("10300","商户路由未配置"),
	CODE_FAIL_NO_INS_CONFIG("10301","未查询到通道配置信息"),
	
	// 通道dispatcher服务 107
	CODE_FAIL_UNKNOW_ERROR("10700","未知错误"),
	
	// 前端商户dispatcher服务 108
	CODE_FAIL_AUTH_PARAMS("10800","参数校验出错"),
	CODE_FAIL_AUTHIP("10801","ip校验出错"),
	CODE_FAIL_HTTPDISPATCH_CONNECT_ERROR("10802","httpdispatch连接失败，需重连"),
	CODE_FAIL_PARAM_ERROR("10803","参数错误"),
	
	// 网关支付核心服务 109
	CODE_FAIL_CALL_SAFE_ERROR("10900","调用安全服务失败"),
	CODE_FAIL_VERIFY_SIGN_ERROR("10901","签名校验未通过"),
	CODE_FAIL_CALL_AUTH_ERROR("10902","调用综合鉴权服务失败"),
	CODE_FAIL_AUTH_NOT_PASS("10903","综合鉴权未通过"),
	CODE_FAIL_CALL_RISK_ERROR("10904","调用风控服务失败"),
	CODE_FAIL_RISK_NOT_PASS("10905","风控未通过"),
	CODE_FAIL_CALL_ROUTE_ERROR("10906","调用路由服务失败"),
	CODE_FAIL_NO_CHANNEL_ROUTE("10907","路由未配置"),
	CODE_FAIL_CALL_ORDER_ERROR("10908","调用订单服务失败"),
	CODE_FAIL_ORDER_PRE_REGISTER("10909","订单预存失败"),
	CODE_FAIL_CREATE_INS_SIGN("10910","创建通道签名失败"),
	CODE_FAIL_CALL_BILLING_ERROR("10911","调用计费服务失败"),
	CODE_FAIL_BILLING_FAILED("10912","计费失败"),
	CODE_EXP_GATEWAYPAY_UNKNOW_ERROR("20900","网关支付未知异常"),
	CODE_EXP_ORDERQUERY_UNKNOW_ERROR("20901","订单查询未知异常"),
	CODE_EXP_ORDERREFUND_UNKNOW_ERROR("20902","退款未知异常"),
	
	//订单服务 110
	CODE_FAIL_PRE_REGISTER_ORDER_FAILED("11001","订单预存失败"),
	CODE_FAIL_NO_TRANS_LOG("11002","订单不存在"),
	CODE_FAIL_REGISTER_ORDER_FAILED("11003","更新订单失败"),
	CODE_FAIL_NO_ORG_TRANS_LOG("11004","原订单不存在"),
	CODE_FAIL_INS_TRANS_RET_FAIL("11005","支付状态错误"),
	
	//风控服务 111
	CODE_FAIL_ORDER_AMOUT_FAULT("11100","订单金额应大于0.00元"),
	CODE_FAIL_QUERY_MCHNT_RISK_FAULT("11101","查询商户风控信息失败"),
	CODE_FAIL_NO_MCHNT_RISK("11102","商户风控信息不存在"),
	CODE_FAIL_AMOUNT_UNREASONABLE("11103","交易金额不属于限额最小到最大范围之内"),
	CODE_FAIL_RISK_MONEY_GREATER_DAY("11104","交易超出单日累计限额"),
	CODE_FAIL_REDIS_CONNECT_FAULT("11105","连接redis失败"),
	CODE_FAIL_RISK_CHECK_FAULT("11106","风控核查失败"),
	
	//安全服务 112
	CODE_FAIL_MCHNT_KEY_PRO("11200","生成商户密钥失败"),
	CODE_FAIL_QUERY_MCHNT_INFO("11201","未查询到商户信息"),
	CODE_FAIL_NO_MCHNT_KEY("11202","商户密钥不存在"),
	CODE_FAIL_QUERY_INSMCHNT_INFO("11203","未查询到通道商户信息"),
	CODE_FAIL_NO_INSMCHNT_KEY("11204","通道商户密钥不存在"),
	CODE_FAIL_CREATE_SIGNATURE("11205","生成商户签名失败"),
	CODE_FAIL_CREATE_INS_SIGNATURE("11206","生成通道签名失败"),
	;

	private String code;
	private String name;
	
	/**
	 * 错误/异常描述
	 */
	private String errDesc;

	private RespCodeEnum(String code, String name, String errDesc) {
		this.code = code;
		this.name = name;
		this.errDesc = errDesc;
		
	}
	
	private RespCodeEnum(String code, String name) {
		this.code = code;
		this.name = name;
	}

	
	public String getErrDesc() {
		return errDesc;
	}

	public void setErrDesc(String errDesc) {
		this.errDesc = errDesc;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static RespCodeEnum getEnumByCodeValue(String code) {
		RespCodeEnum[] allEnums = values();
		for (RespCodeEnum enableStatus : allEnums) {
			if (enableStatus.getCode().equals(code))
				return enableStatus;
		}

		return null;
	}

	/**
	 * 格式化 errDesc
	 * @param respCodeEnum {@link RespCodeEnum}
	 * @param arguments 参数列表
	 * @return 格式化后的错误/异常描述
	 * @see {@link MessageFormat#format(String, Object...)} </br> {@link RespCodeEnum#errDesc}
	 */
	public static String getErrDesc(RespCodeEnum respCodeEnum, Object... arguments) {
		return MessageFormat.format(respCodeEnum.getErrDesc(), arguments);
	}
	
	

}
