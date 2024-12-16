package com.javaHackathon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadFileWriteInReverse {
	public static void main(String[] args) {
		String inputFile = "C:\\Users\\SanVij\\Documents\\Sanjana\\TekArch\\input.txt";
		String outputFile = "C:\\Users\\SanVij\\Documents\\Sanjana\\TekArch\\output.txt";

		try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
				BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
			List<String> lines = new ArrayList<>();

			String line;

			while ((line = reader.readLine()) != null) {

				lines.add(line);
			}

			Collections.reverse(lines);

			for (String reversedLine : lines) {

				writer.write(reversedLine);

				writer.newLine();

			}
			System.out.println("Success... Check the file");
		} catch (Exception e) {

			System.err.println("An error occurred: " + e.getMessage());

		}
	}
}
