package com.timeconversion;

import java.util.Scanner;

public class TimeConversion {

	static String timeConversion(String s) {
		int tmp = Integer.parseInt(s.substring(0, 2));
		if (s.endsWith("PM")&& tmp==12) {
			String newTime = s.substring(0, s.length() - 2);
			return newTime;
		}
		else if(s.endsWith("PM")) {
			tmp = 12 + tmp;
			String newTime = tmp + s.substring(2, s.length() - 2);
			return newTime;
		}
		else if (s.endsWith("AM") && tmp == 12) {
			String newTime = "00" + s.substring(2, s.length() - 2);
			return newTime;
		} else {
			String newTime = s.substring(0, s.length() - 2);
			return newTime;
		}

	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the time: ");

		String s = scan.nextLine();

		String result = timeConversion(s);

		System.out.println(result);

	}

}
