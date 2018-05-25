package com.ju.japro.io.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedReaderTest {
	public static void main(String[] args) throws Exception {
		FileInputStream input = null;
		FileOutputStream output = null;
		try {
			byte[] buffer = new byte[512];
			int numberRead = 0;

			input = new FileInputStream(new File("D:\\txt.txt"));
			output = new FileOutputStream(new File("D:\\txt1.txt"));

			while ((numberRead = input.read(buffer)) != -1) {
				output.write(buffer, 0, numberRead);
			}
		} catch (final IOException e) {

		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}