package com.ju.japro.structalg.five;

import static com.ju.japro.common.util.Util.*;

public class Cup {

	public static void main(String[] args) {
		String str = "Ice.Config=src/conf/server.config";
		Cup cup = new Cup();
		cup.parseLine(str);
	}

	private void parseLine(String line) {
		String key = "";
		String value = "";
		int state = 0;
		String whitespace = "";
		String escapedspace = "";
		boolean finished = false;
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			switch (state) {
			case 0:
				switch (c) {
				case '\\':
					if (i < line.length() - 1) {
						c = line.charAt(++i);
						switch (c) {
						case '#':
						case '=':
						case '\\':
							key = key + whitespace;
							whitespace = "";
							key = key + c;
							break;
						case ' ':
							if (key.length() == 0)
								break;
							whitespace = whitespace + c;
							break;
						default:
							key = key + whitespace;
							whitespace = "";
							key = key + '\\';
							key = key + c;
							break;
						}
					} else {
						key = key + whitespace;
						key = key + c;
					}
					break;
				case '\t':
				case '\n':
				case '\r':
				case ' ':
					if (key.length() != 0) {
						whitespace = whitespace + c;
					}
					break;
				case '=':
					whitespace = "";
					state = 1;
					break;
				case '#':
					finished = true;
					break;
				default:
					key = key + whitespace;
					whitespace = "";
					key = key + c;
				}
				break;
			case 1:
				switch (c) {
				case '\\':
					if (i < line.length() - 1) {
						c = line.charAt(++i);
						switch (c) {
						case '#':
						case '=':
						case '\\':
							value = value + (value.length() == 0 ? escapedspace : whitespace);
							whitespace = "";
							escapedspace = "";
							value = value + c;
							break;
						case ' ':
							whitespace = whitespace + c;
							escapedspace = escapedspace + c;
							break;
						default:
							value = value + (value.length() == 0 ? escapedspace : whitespace);
							whitespace = "";
							escapedspace = "";
							value = value + '\\';
							value = value + c;
							break;
						}
					} else {
						value = value + (value.length() == 0 ? escapedspace : whitespace);
						value = value + c;
					}
					break;
				case '\t':
				case '\n':
				case '\r':
				case ' ':
					if (value.length() != 0) {
						whitespace = whitespace + c;
					}
					break;
				case '#':
					finished = true;
					break;
				default:
					value = value + (value.length() == 0 ? escapedspace : whitespace);
					whitespace = "";
					escapedspace = "";
					value = value + c;
				}
				break;
			}
			if (finished) {
				break;
			}
		}
		value = value + escapedspace;
		if (((state == 0) && (key.length() != 0)) || ((state == 1) && (key.length() == 0))) {
			return;
		}
		if (key.length() == 0) {
			return;
		}
		println(key + value);
	}

	Cup(int marker) {
		println("Cup(" + marker + ")");
	}

	Cup() {
	}

	void f(int marker) {
		println("f(" + marker + ")");
	}
}

class Cups {
	static Cup cup1;
}