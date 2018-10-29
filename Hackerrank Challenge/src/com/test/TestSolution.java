package com.test;

import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TestSolution {

	static long arrayManipulation(int n, long[][] queries) {
		//Long[] zeroArray = new Long[n];
		List<Long> zerolist = new LinkedList<Long>();
		for(int i=0; i<n; i++) {
			zerolist.add(i,0L);
		}
		for (int i = 0; i < queries.length; i++) {
			for (long j = queries[i][0]; j <= queries[i][1]; j++) {
				//zeroArray[(int) j - 1] += queries[i][2];
				long tmp = zerolist.get((int) j-1) + queries[i][2] ;
				zerolist.set((int) j-1, tmp);
			}
		}
		return zerolist.stream().mapToLong(Long::longValue).max().getAsLong();
		//return Arrays.stream(zeroArray).max().getAsLong();

	}

	public static void main(String[] argh) {
		/*
		 * 1 2 100 2 5 100 3 4 100
		 */
		long [][] queries1 = {{29,40,787},
		{9,26,219},
		{21,31,214},
		{8,22,719},
		{15,23,102},
		{11,24,83},
		{14,22,321},
		{5,22,300},
		{11,30,832},
		{5,25,29},
		{16,24,577},
		{3,10,905},
		{15,22,335},
		{29,35,254},
		{9,20,20},
		{33,34,351},
		{30,38,564},
		{11,31,969},
		{3,32,11},
		{29,35,267},
		{4,24,531},
		{1,38,892},
		{12,18,825},
		{25,32,99},
		{3,39,107},
		{12,37,131},
		{3,26,640},
		{8,39,483},
		{8,11,194},
		{12,37,502}};
		int n1 = 40;
		int n = 5;
		long[][] queries = { { 1, 2, 100 }, { 2, 5, 100 }, { 3, 4, 100 } };
		long result = arrayManipulation(n1, queries1);
		System.out.println(result);
	}
}
