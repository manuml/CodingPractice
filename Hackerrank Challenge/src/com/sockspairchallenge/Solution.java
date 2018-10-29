package com.sockspairchallenge;

import java.io.*;
import java.util.*;

public class Solution {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {
		Set<Integer> set = new TreeSet<>();
		Map<Integer, Integer> pairMap = new HashMap<>();
		for (int i : ar) {
			set.add(i);
		}
		for (int i : set) {
			int count = 0;
			for (int j = 0; j < ar.length; j++) {
				if (ar[j] == i)
					pairMap.put(i, ++count);
			}
		}
		int sum = 0;
		for (int i : pairMap.keySet()) {

			int value = pairMap.get(i);
			sum += value/2;

		}
		return sum;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));
		System.out.println(Messages.getString("Solution.0")); //$NON-NLS-1$
		int n = scanner.nextInt();
		// scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[n];

		System.out.println(Messages.getString("Solution.1")); //$NON-NLS-1$

		for (int i = 0; i < n; i++) {
			ar[i] = scanner.nextInt();
			//System.out.println("Element " + i + ": " + ar[i]);
		}

		int result = sockMerchant(n, ar);
		System.out.println(Messages.getString("Solution.2")+result); //$NON-NLS-1$
		// bufferedWriter.write(String.valueOf(result));
		// bufferedWriter.newLine();

		// bufferedWriter.close();

		scanner.close();
	}
}
