package com.staircaseChallenge;

import java.util.Scanner;

public class StaircaseChallengeAlternate {

	// Complete the staircase function below.
	static void staircase(int n) {
		String str="#";
        for (int i=0;i<n;i++)
            { 
            System.out.printf("%"+(n+1)+"s",str+"\n");
            str=str+"#";
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
