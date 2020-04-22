package com.string.code;

import java.io.*;
import java.util.*;

public class CandidateCode {
	public static void main(String args[]) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine(); // "ritikisagoodboy" ; //
		String sub = "";
		int number = scanner.nextInt(); // 4 ; // scanner.nextInt();
		List<String> listOfStrings = new ArrayList<>();
		listOfStrings = findSubstrings(word, number);
		List<Integer> possibleLength = new ArrayList<>();
		for (String i : listOfStrings) {
			int c;
			int length = i.length();
			if (!findSubstringsHaveConsonants(word, length, i,number)) {
				possibleLength.add(length);
			}
		}
		System.out.print(possibleLength.stream().min(Integer::compare).get());

	}

	private static boolean findSubstringsHaveConsonants(String word, int length, String i, int number) {
		boolean condition = false;
		for (int c = 0; c < word.length(); c++) {
			if (c + length <= word.length()) {
				String sub1 = word.substring(c, c + length);
				if (findSpecifiedNumConsonants(sub1, number).isEmpty()) {
					condition = true;
					break;
				}
			}
		}
		return condition;

	}

	private static List<String> findSubstrings(String word, int number) {
		int i, c;
		List<String> listOfStrings = new ArrayList<>();
		String sub = "";
		// scanner.nextInt();
		for (c = 0; c < word.length(); c++) {
			for (i = 1; i <= word.length() - c; i++) {
				if (c + i >= number) {
					sub = word.substring(c, c + i);
					String result = findSpecifiedNumConsonants(sub, number);
					if (!result.isEmpty()) {
						listOfStrings.add(findSpecifiedNumConsonants(sub, number));
					}
				}
			}
		}

		return listOfStrings;
	}

	private static String findSpecifiedNumConsonants(String sub, int j) {
		String vowels = "aeiouAEIOU";
		int consCount = 0;
		int length = sub.length();
		for (int i = 0; i < length; i++) {
			char currentChar = sub.charAt(i);
			if (Character.isLetter(currentChar)) {
				if (currentChar != 'a' && currentChar != 'e' && currentChar != 'i' && currentChar != 'o'
						&& currentChar != 'u' && currentChar != 'A' && currentChar != 'E' && currentChar != 'I'
						&& currentChar != 'O' && currentChar != 'U') {
					consCount++;
				}
			}

		}

		String result = consCount >= j ? sub : "";
		return result;

	}

}
