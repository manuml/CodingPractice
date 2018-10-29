package com.repeatingString;

import java.util.Scanner;

public class RepeatedStringAlternateSolution {

	static long repeatedString(String s, long n) {
		long newStringLen = n /s.length();
        long count=0;
        long extracount = 0;
        for(int i=0; i<s.length();i++) {
            if(s.charAt(i)=='a')
                count++;
        }
        //finding number of a in substring(s%n)
        for(int i=0; i<s.substring(0, (int) (n%s.length())).length();i++) {
            if(s.charAt(i)=='a')
                extracount++;
        }                  
        return (count*newStringLen)+extracount;

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
