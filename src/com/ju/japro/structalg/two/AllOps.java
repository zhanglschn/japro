package com.ju.japro.structalg.two;

import static com.ju.japro.structalg.two.util.Util.println;

public class AllOps {
	void f(boolean b) {

	}

	void boolTest(boolean x, boolean y) {
		// Arithmetic operators;
		// ! x = x * y;
		// ! x = x / y;
		// ! x = x % y;
		// ! x = x + y;
		// ! x = x - y;
		// ! x++;
		// ! x--;
		// ! x = +y;
		// ! x = -y;
		// Relational and logical
		// ! f (x > y);
		// ! f (x >= y);
		// ! f (x < y);
		// ! f (x <= y);
		f(x == y);
		f(x != y);
		f(!y);
		x = x && y;
		x = x || y;
		// Bitwise Operators
		// ! x = ~y;
		x = x & y;
		x = x | y;
		x = x ^ y;
		// ! x = x << 1;
		// ! x = x >> 1;
		// ! x = x >>> 1;
		// Compound assignment;
		// ! x += y;
		// ! x -= y;
		// ! x = *= y;
		// ! x /= y;
		// ! x %= y;
		// ! x <<= 1;
		// ! x >>= 1;
		// ! x >>>= 1;
		x &= y;
		x ^= y;
		x |= y;

		// Casting;
		// ! char c = (char) x;
		// ! byte b = (byte) x;
		// ! short s = (short) x;
		// ! int i = (int) x;
		// ! long l = (long) x;
		// ! float f = (float) x;
		// ! double d = (double) x;
	}

	void charTest(char x, char y) {
		// Arithmetic operators;
		x = (char) (x * y);
		x = (char) (x / y);
		x = (char) (x % y);
		x = (char) (x + y);
		x = (char) (x - y);

		x++;
		x--;
		x = (char) +y;
		x = (char) -y;

		// Relational and logical;
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);

		// ! f(!x);
		// ! f(x && y);
		// ! f(x || y);
		// Bitwise operators;
		x = (char) ~y;
		x = (char) (x & y);
		x = (char) (x | y);
		x = (char) (x ^ y);
		x = (char) (x << 1);
		x = (char) (x >> 1);
		x = (char) (x >>> 1);
		// Compound assignment;
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		x <<= 1;
		x >>= 1;
		x >>>= 1;
		x &= y;
		x ^= y;
		x |= y;
		// Casting
		// !boolean b1 = (boolean) x;
		byte b = (byte) x;
		short s = (short) x;
		int i = (int) x;
		long l = (long) x;
		float f = (float) x;
		double d = (double) x;

		println(b + s + i + l + f + d);
	}

	void byteTest(byte x, byte y) {
		// Arithmetic operators;
		x = (byte) (x * y);
		x = (byte) (x / y);
		x = (byte) (x % y);
		x = (byte) (x + y);
		x = (byte) (x - y);
		x++;
		x--;
		x = (byte) +y;
		x = (byte) -y;

		// Relational and logical;
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		// ! f(x && y);
		// ! f(x || y);
		// Bitwise operators;
		x = (byte) ~y;
		x = (byte) (x & y);
		x = (byte) (x | y);
		x = (byte) (x ^ y);
		x = (byte) (x << 1);
		// Compound assignment;
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		x <<= 1;
		x >>= 1;
		x >>>= 1;
		x &= y;
		x ^= y;
		x |= y;
		// Casting;
		// !boolean b1 = (boolean) x;
		char c = (char) x;
		short s = (short) x;
		int i = (int) x;
		long l = (long) x;
		double d = (double) x;
		float f = (float) x;
		println(c + s + i + l + d + f);
	}

	void shortTest(short x, short y) {
		// Arithmetic operators;
		x = (short) (x * y);
		x = (short) (x / y);
		x = (short) (x % y);
		x = (short) (x + y);
		x = (short) (x - y);
		x++;
		;
		x--;
		x = (short) +y;
		x = (short) -y;
		// Relational and logical;
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);

		// ! f(!x);
		// ! f(x && y);
		// ! f(x || y);
		// Bitwise operators;
		x = (short) ~y;
		x = (short) (x & y);
		x = (short) (x | y);
		x = (short) (x ^ y);
		x = (short) (x << 1);
		x = (short) (x >> 1);
		x = (short) (x >>> 1);
		// Compound assignment;
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		x <<= 1;
		x >>= 1;
		x &= y;
		x ^= y;
		x |= y;
		// Casting;
		// boolean bl = (boolean) x;
		char c = (char) x;
		byte b = (byte) x;
		int i = (int) x;
		long l = (long) x;
		float f = (float) x;
		double d = (double) x;

		println(c + b + i + l + f + d);
	}

	void intTest(int x, int y) {
		// Arithmetic operators;
		x = x * y;
		x = x / y;
		x = x % y;
		x = x + y;
		x = x - y;
		x++;
		x--;
		x = +y;
		x = -y;
		// Relational and logical;
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		// ! f(!x);
		// ! f(x && y);
		// Bitwise operators;
		x = ~y;
		x = x & y;
		x = x | y;
		x = x ^ y;
		x = x << 1;
		x = x >> 1;
		x = x >>> 1;
		// Compound assignment;
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		x <<= 1;
		x >>= 1;
		x >>>= 1;
		x &= y;
		x ^= y;
		x |= y;
		// Casting;
		// ! boolean b1 = (boolean) x;
		char c = (char) x;
		byte b = (byte) x;
		short s = (short) x;
		long l = (long) x;
		float f = (long) x;
		double d = (double) x;

		println(c + s + b + l + f + d);
	}

	void longTest(long x, long y) {
		// Arithmetic operators;
		x = x * y;
		x = x / y;
		x = x % y;
		x = x + y;
		x = x - y;
		x++;
		x--;
		x = +y;
		x = -y;
		// Relational and logical;
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		// ! f(!x);
		// ! f(x && y);
		// ! f(x || y);
		// Bitwise operators;
		x = ~y;
		x = x & y;
		x = x | y;
		x = x ^ y;
		x = x << 1;
		x = x >> 1;
		x = x >>> 1;
		// Compound assignment;
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		x <<= 1;
		x >>= 1;
		x >>>= 1;
		x &= y;
		x ^= y;
		x |= y;
		// Casting;
		// ! boolean b1 = (boolean) x;
		char c = (char) x;
		byte b = (byte) x;
		short s = (short) x;
		int i = (int) x;
		float f = (float) x;
		double d = (double) x;

		println(c + b + s + i + f + d);
	}

	void floatTest(float x, float y) {
		// Arithmetic operators
		x = x * y;
		x = x / y;
		x = x % y;
		x = x + y;
		x = x - y;
		x++;
		x--;
		x = +y;
		x = -y;
		// Relational and logical;
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		// ! f(!x);
		// ! f(x && y);
		// ! f(x || y);
		// Bitwise operators;
		// ! x = ~y;
		// ! x = x & y;
		// ! x = x ^ y;
		// ! x = x << 1;
		// ! x = x >> 1;
		// ! x = x >>> 1;
		// Compound assignment;
		x += y;
		x -= y;
		x *= y;
		x %= y;
		// ! x <<= 1;
		// ! x >>= 1;
		// ! x >>>= 1;
		// ! x &= y;
		// ! x ^= y;
		// ! x |= y;
		// Casting;
		// ! boolean b1 = (boolean) x;
		char c = (char) x;
		byte b = (byte) x;
		short s = (short) x;
		int i = (int) x;
		long l = (long) x;
		double d = (double) x;

		println(c + b + s + i + l + d);
	}

	void doubleTest(double x, double y) {
		// Arithmetic operators;
		x = x * y;
		x = x / y;
		x = x % y;
		x = x + y;
		x = x - y;
		x++;
		x--;
		x = +y;
		x = -y;
		// Relational and logical;
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		// ! f(!x);
		// ! f(x && y);
		// ! f(x || y);
		// Bitwise operators;
		// ! x = ~ y;
		// ! x = x & y;
		// ! x = x | y;
		// ! x = x ^ y;
		// ! x = x << 1;
		// ! x = x >> 1;
		// ! x = x >>> 1;
		// Compound assignment;
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		// ! x <<= 1;
		// ! x >>= 1;
		// ! x &= y;
		// ! x ^= y;
		// ! x |= y;
		// Casting;
		// !boolean b1 = (boolean) x;
		char c = (char) x;
		byte b = (byte) x;
		short s = (short) x;
		int i = (int) x;
		long l = (long) x;
		float f = (float) x;
		
		println(c + b + s + i + l + f);
	}

	public static void main(String[] args) {
		AllOps ops = new AllOps();
		// ops.boolTest(false, true);
		ops.charTest('a', 'z');
	}
}