package com.ju.japro.string;

public class BCDTest {

	public static void main(String[] args) {
//		byte[] bts = str2Bcd("ABC123456789");
//		String str = "测试";
//		byte[] bs = str.getBytes();
//		System.out.println(1);
//		String str = "ABCDEFGHJKLMNOPQRSTUVWSYZ";
		
//		char a = str.charAt(10);
//		System.out.println(a);
		
		System.out.println(Character.digit('A',16));
	}
	
	
	

	public static byte[] bcd(String code, int flag) {
		int length = code.length() % 2 == 0 ? code.length() / 2
				: code.length() / 2 + 1;
		if (length < 0) {
			throw new IllegalArgumentException("参数lengh不能小于0，length: " + length);
		} else if (length == 0) {
			return new byte[0];
		}

		byte[] bt = new byte[length];
		// 表示当前位置
		int point = 0;
		if (code.length() < 2 * length) {
			if (flag == 0) {
				code = addBlankLeft(code, 2 * length - code.length(), "0");
			} else {
				code = addBlankRight(code, 2 * length - code.length(), "0");
			}
		}
		// 每2位合并为一个字节
		for (; point < code.length(); point += 2) {
			// (point+1)/2计算当前指向的值
			// Character.digit将对应的Char转为数字，如'8'-> 8
			// <<4左移四位：即为→_→（右边）的数字让开位置
			bt[(point + 1) / 2] = (byte) (Character.digit(code.charAt(point),16) << 4 | Character.digit(code.charAt(point + 1), 16));
		}
		return bt;
	}

	private static String addBlankRight(String code, int addLen, String string) {
		if (code != null && code.length() == 0) {
			throw new IllegalArgumentException("参数lengh不能等于0");
		}
		if (addLen < 0) {
			throw new IllegalArgumentException("添加个数不能为负数");
		}
		StringBuffer sb = new StringBuffer();
		sb.append(code);
		for (int i = 0; i < addLen; i++) {
			sb.append(string);
		}
		return sb.toString();
	}

	private static String addBlankLeft(String code, int addLen, String string) {
		if (code != null && code.length() == 0) {
			throw new IllegalArgumentException("参数lengh不能等于0");
		}
		if (addLen < 0) {
			throw new IllegalArgumentException("添加个数不能为负数");
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < addLen; i++) {
			sb.append(string);
		}
		sb.append(code);
		return sb.toString();
	}

	/**
	 * @功能: BCD码转为10进制串(阿拉伯数据)
	 * @参数: BCD码
	 * @结果: 10进制串
	 */
	public static String bcd2Str(byte[] bytes) {
		StringBuffer temp = new StringBuffer(bytes.length * 2);
		for (int i = 0; i < bytes.length; i++) {
			temp.append((byte) ((bytes[i] & 0xf0) >>> 4));
			temp.append((byte) (bytes[i] & 0x0f));
		}
		return temp.toString().substring(0, 1).equalsIgnoreCase("0") ? temp
				.toString().substring(1) : temp.toString();
	}

	/**
	 * @功能: 10进制串转为BCD码
	 * @参数: 10进制串
	 * @结果: BCD码
	 */
	public static byte[] str2Bcd(String asc) {
		int len = asc.length();
		int mod = len % 2;
		if (mod != 0) {
			asc = "0" + asc;
			len = asc.length();
		}
		byte[] bts = new byte[len];
		if (len >= 2) {
			len = len / 2;
		}
		byte[] bbt = new byte[len];
		bts = asc.getBytes();

		int j, k;
		for (int p = 0; p < bbt.length; p++) {
			if ((bts[2 * p] >= '0') && (bts[2 * p] <= '9')) {
				j = bts[2 * p] - '0';
			} else if ((bts[2 * p] >= 'a') && (bts[2 * p] <= 'z')) {
				j = bts[2 * p] - 'a' + 0x0a;
			} else {
				j = bts[2 * p] - 'A' + 0x0a;
			}

			if ((bts[2 * p + 1] >= '0') && (bts[2 * p + 1]) <= '9') {
				k = bts[2 * p + 1] - '0';
			} else if ((bts[2 * p + 1] >= 'a') && (bts[2 * p + 1] <= 'z')) {
				k = bts[2 * p + 1] - 'a' + 0x0a;
			} else {
				k = bts[2 * p + 1] - 'A' + 0x0a;
			}

			int a = (j << 4) + k;
			byte b = (byte) a;
			bbt[p] = b;
		}
		return bbt;
	}

	public static String bcd2Str1(byte[] bytes) {
		char temp[] = new char[bytes.length * 2], val;

		for (int i = 0; i < bytes.length; i++) {
			val = (char) (((bytes[i] & 0xf0) >> 4) & 0x0f);
			temp[i * 2] = (char) (val > 9 ? val + 'A' - 10 : val + '0');

			val = (char) (bytes[i] & 0x0f);
			temp[i * 2 + 1] = (char) (val > 9 ? val + 'A' - 10 : val + '0');
		}
		return new String(temp);
	}

}