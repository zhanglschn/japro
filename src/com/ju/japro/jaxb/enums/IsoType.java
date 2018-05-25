package com.ju.japro.jaxb.enums;

/**
 * <p>报文域类型,该类待修改，以使本框架更通用.</p>
 * @author zhanglschn
 *
 */
public enum IsoType {
	/**
	 * 定义了8583协议中的集中数据格式，注：时间类型以及金额都当做NUMBERIC类型处理
	 * acs编码字符串为CHAR
	 * 二进制为BINARY
	 * 数字及bcd编码的格式为NUMERIC
	 * LLVAR为前置1字节长度字段
	 * LLLVAR为前置2字节长度字段
	 * LLVAR_NUMERIC:一字节边长的数字类型（BCD编码）
	 * LLLVAR_NUMERIC:二字节边长的数字类型（BCD编码）
	 * LLLVAR_BINARY:二字节边长的数字类型（二进制）
	 */
	BINARY,CHAR,NUMERIC,LLVAR,LLLVAR,LLVAR_NUMERIC,LLLVAR_NUMERIC,LLLVAR_BINARY;
}