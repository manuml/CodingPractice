package com.repeatingString;

import java.util.Scanner;

public class RepeatingStringCallenge {
	static long repeatedString(String s, long n) {
		double newStringLen = Math.ceil(((double)n /s.length()));
		String newStrn = "";
		long count=0;
		for (int i = 0; i < newStringLen; i++)
			newStrn = newStrn.concat(s);
		newStrn = newStrn.substring(0,(int)n);
		System.out.println(newStrn);
		for(int i=0; i<newStrn.length();i++) {
			if(newStrn.charAt(i)=='a')
				count++;
		}
		return count;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.next();

		long n = scanner.nextLong();
		// scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		long result = repeatedString(s, n);

		/*
		 * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
		 * 
		 * bufferedWriter.close();
		 */
		System.out.println("The result is: " + result);

		scanner.close();
	}
}
