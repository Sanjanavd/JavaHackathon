package com.javaHackathon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DisplayDuplicateCharacter {
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		sc.close();

		Map<Character, Integer> charcount = new HashMap<>();

		for (char c : str.toCharArray()) {
			if (charcount.containsKey(c)) {
				charcount.put(c, charcount.get(c) + 1);

			} else {
				charcount.put(c, 1);
			}
		}

		System.out.println("Duplicate Characters");
		Set<Character> keys = charcount.keySet();
		for (char c : keys) {
			if (charcount.get(c) > 1) {
				System.out.println(c);
			}

		}

	}
}