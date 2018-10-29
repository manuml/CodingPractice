package com.staircaseChallenge;

import java.util.Scanner;

public class StaircaseChallenge {

	// Complete the staircase function below.
	static void staircase(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i; j >= 0; j--) {
				/*
				 * for (k = n - j; k > 0; k--) { System.out.print(" "); }
				 */
				int k = n - i;
				if (j == i ) {
					while (k > 1) {
						System.out.print(" ");
						k--;
					}
				}
				System.out.print("#");
			}
			System.out.print('\n');
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the limit: ");
		int n = scanner.nextInt();
		// scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		staircase(n);

		scanner.close();
	}
}
