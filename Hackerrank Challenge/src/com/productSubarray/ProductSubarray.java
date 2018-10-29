package com.productSubarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ProductSubarray {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number of inputs: ");
		int n = scanner.nextInt();
		while(n-->0) {
			System.out.println("Enter the limit :");
			int limit= scanner.nextInt();
			int input[] = new int[limit];
			System.out.println("Enter the Maximum product value: ");
			int maxProduct = scanner.nextInt();
			System.out.println("Enter "+limit+" numbers: ");
			for( int i = 0 ; i<limit; i++) {
				input[i]=scanner.nextInt();
			}
			Set<int[]> list = new LinkedHashSet<>();
			int tmp=1;
			int start=0;
			for(int i = 0 ; i<limit; ) {
				tmp *= input[i];
				if(tmp<maxProduct) {
					list.add(Arrays.copyOfRange(input, start, i+1));
					if(i==limit-1 && tmp!=input[i])
						list.add(Arrays.copyOfRange(input, i, i+1));
					i++;
					
				}
				else {
					tmp=1;
					if(start<limit)
						i = ++start;
					else
						break;
				}	
				
			}
			System.out.println("The max number of subarrays are: "+list.size());
			list.forEach(ar -> {
				for(int x: ar)
					System.out.print(x + " ");
				System.out.println('\n');
			});
		}
		

	}

}
//78 16 94 36 87 93 50 22 63 28 91 60 64 27 41 27 73 37 12 69 68 30 83 31 63 24 68 36 30 3 23 59 70 68 94 57 12 43 30 74 22 20 85 38 99 25 16 71 14 27 92 81 57 74 63 71 97 82 6 26 85 28 37 6 47 30 14 58 25 96 83 46 15 68 35 65 44 51 88 9 77 79 89 85


