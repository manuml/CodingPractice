package com.countingValleys;

import java.util.Scanner;

public class CountingValleys {

	static int countingValleys(int n, String s) {
		int numberOfUps = 0;
		int numberOfDowns = 0;
		// boolean start = false;
		int valleycount = 0;
		int startValleyIndex = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'U') {
				numberOfUps++;
			} else if (s.charAt(i) == 'D') {
				if (numberOfUps == numberOfDowns) {
					if (i == 0) {
						valleycount++;
						numberOfDowns++;
						continue;
					}
					if (i < s.length()) {
						startValleyIndex = i + 1;
					}
					// startValleyIndex = i;
					numberOfUps = 0;
					numberOfDowns = 0;
					// start = true;
				}
				if (numberOfUps == numberOfDowns && s.charAt(startValleyIndex) == 'D') {
					valleycount++;
				}
				numberOfDowns++;
			}

		}
		return valleycount;
	}

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the number of steps: ");
		int steps = scanner.nextInt();
		System.out.println("Enter the ups and downs in (U/D) format: ");
		String upsAndDowns = scanner.next();
		int result = countingValleys(steps, upsAndDowns);

		System.out.println("The number of Valleys: " + result);

	}

}
