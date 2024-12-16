package com.javaHackathon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputExample {
	public static void main(String[] args) throws IOException {
		readFromFile();
		writeToFile();
	}

	private static void writeToFile() throws IOException {
		FileOutputStream fout = new FileOutputStream("C:\\Users\\SanVij\\Documents\\Sanjana\\TekArch\\test.txt");
		String s = "Enjoy it to the fullest";
		byte b[] = s.getBytes();
		fout.write(b);
		fout.close();
		System.out.println("Written to the file .....");
	}

	private static void readFromFile() throws IOException {
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\SanVij\\Documents\\Sanjana\\TekArch\\test.txt");
			int i = 0;
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}
			fin.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}
}
