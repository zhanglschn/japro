package com.ju.japro.exception;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
	public static void main(String[] args) {
//		Object[] str1 = {"", "1025", "中国工商银行", "1051", "中国建设银行", "104", "中国银行", "103", "中国农业银行", "3407", "交通银行", "3230", "邮政储蓄银行", "3080", "招商银行", "313", "中信银行",
//				"314", "上海浦东发展银行", "309", "兴业银行", "305", "中国民生银行", "312", "光大银行", "307", "平安银行", "311", "华夏银行", "310", "北京银行", "3061", "广东发展银行", "326", "上海银行",
//				"335", "北京农商行", "342", "重庆农商银行", "343", "上海农商行", "316", "南京银行", "302", "宁波银行", "324", "杭州银行", "336", "成都银行", "3341", "青岛银行", "344", "恒丰银行",
//				"317", "渤海银行", "401", "厦门银行", "402", "陕西信合", "403", "浙江稠州银行", "404", "贵州农信", "1027", "中国工商银行", "1054", "中国建设银行", "106", "中国银行", "1031", "农业银行",
//				"3011", "交通银行", "3231", "邮政储蓄银行", "308", "招商银行", "3131", "中信银行", "3141", "上海浦东发展银行", "3091", "兴业银行", "3051", "中国民生银行", "3121", "光大银行", "3071",
//				"平安银行", "3112", "华夏银行", "306", "广东发展银行", "3261", "上海银行", "303", "宁波银行", "3241", "杭州银行", "334", "青岛银行", "3101", "北京银行", "4031", "浙江稠州银行",
//				"9102", "中国工商银行", "9103", "中国农业银行", "9104", "交通银行", "9105", "中国建设银行", "9107", "招商银行", "9108", "光大银行", "9109", "中国银行", "9110", "平安银行", "9102",
//				"中国工商银行", "9103", "中国农业银行", "9104", "交通银行", "9105", "中国建设银行", "9107", "招商银行", "9108", "光大银行", "9109", "中国银行", "9110", "平安银行" };
//		for (int i = 0; i < str1.length; i++) {
//			if (i % 2 == 0) {
//				System.out.println(str1[i] + "</option> ");
//				continue;
//			}
//			System.out.print("<option value=\"" + str1[i] +  "\">");
//		}
		
		
		Map<String,String> testMap  = new HashMap<String,String>();
		testMap.put("1", "1");
		testMap.put("2", "1");
		testMap.put("3", "1");
		testMap.put("4", "1");
		
		System.out.println(testMap.toString());
	}
}