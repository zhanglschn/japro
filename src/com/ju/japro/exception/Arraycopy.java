package com.ju.japro.exception;

public class Arraycopy {
	
	public static void main(String[] args) {
//		String[] respSplit = respStr.split(FieldNumEnums.SEP_CHAR.toString());
//		int len = respSplit.length;
//		if(len != 7) {//如果没有7个返回结果。返回结果有误
//			resp.setRespCode(RespCodeEnum.CODE_FAIL_NORMAL.getCode());
//			resp.setRespInfo(RespCodeEnum.CODE_FAIL_NORMAL.getName());
//			return resp;
//		}
//		// 返回案例100000178|10000001|2014010101010101|N|0|20141029184503|b4d6a91f6af4ce07c87420762d73d0e
//		// 对应MemberID-商户 ID|TerminalID-终端 ID|TransID-订单 ID|CheckResult-支付结果|succMoney-实际成功金额|SuccTime-支付完成时间|Md5Sign-交易签名
//		//100000178|10000001|000000000076|N|0|20170505191912|9d2fa05bb1fdf67a4642ab3e1b8b873b
//		resp.setMemberID(respSplit[0]);
//		resp.setTerminalID(respSplit[1]);
//		resp.setTransID(respSplit[2]);
//		resp.setCheckResult(respSplit[3]);
//		resp.setSuccMoney(respSplit[4]);
//		resp.setSuccTime(respSplit[5]);
//		resp.setMd5Sign(respSplit[6]);
//		
//		return resp;
		
		String str = "100000178|10000001|000000000076|N|0|20170505191912|9d2fa05bb1fdf67a4642ab3e1b8b873b";
		String[] str2= str.split("\\|");
		System.out.println(str2.length);
	}
	
	public static void main1(String[] args) {
		System.out.println(Integer.toBinaryString(123456) );
	}
	
	public static void main2(String[] args) {
		String[] s1 = { "中国", "山西", "太原", "TYUT", "zyy", "加拿大", "不知道哪个州",
				"不知道哪个市", "不知道哪个学校", "yxf" };
		String[] s2 = new String[s1.length];

		System.arraycopy(s1, 0, s2, 0, 10);
		s2[6] = "假设蒙大拿州";
		s2[7] = "假设蒙特利尔市";
		s2[8] = "假设Montreal商学院";
		System.out.println("This is s1");
		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i] + ",");
		}

		System.out.println("\nThis is s2");
		for (int i = 0; i < s2.length; i++) {
			System.out.print(s2[i] + ",");
		}
	}
}