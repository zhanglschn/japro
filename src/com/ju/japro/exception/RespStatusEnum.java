package com.ju.japro.exception;

/**
 * 交易流水的状态枚举类
 * 
 * @author 刘翔翔
 *
 */
public enum RespStatusEnum {

	/* 成功 */
	STATUS_SUCCESS("0", "成功"),
	/* 失败 */
	STATUS_FAIL("1", "失败"),
	/* 异常 */
	STATUS_EXP("2", "异常"),
	/* 处理中 */
	STATUS_PROCESSING("3", "处理中"),
	/* 待处理 */
	STATUS_TO_BE_PROCESS("4", "待支付");

	private String code;
	private String name;

	/**
	 * 判断返回码是否归属指定的大类
	 * 
	 * @param respCode
	 * @param item
	 * @return
	 */
	public static final boolean typeEquals(String respCode, RespStatusEnum... item) {
		if (respCode == null || respCode.length() == 0)
			return false;

		for (RespStatusEnum it : item) {
			if (respCode.startsWith(it.getCode()))
				return true;
		}
		return false;
	}

	public static final boolean successEquals(String respCode) {
		return typeEquals(respCode, STATUS_SUCCESS);
	}

	private RespStatusEnum(String code, String name) {
		this.code = code;
		this.name = name;
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

	public static RespStatusEnum getEnumByCodeValue(String code) {
		RespStatusEnum[] allEnums = values();
		for (RespStatusEnum enableStatus : allEnums) {
			if (enableStatus.getCode().equals(code))
				return enableStatus;
		}
		return null;
	}

}
