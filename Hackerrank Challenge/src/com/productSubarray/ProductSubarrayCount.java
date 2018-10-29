package com.productSubarray;

import java.util.Scanner;

public class ProductSubarrayCount {

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
			int tmp=1;
			int start=0,count=0;
			for(int i = 0 ; i<limit; ) {	
				tmp *= input[i];
				if(tmp<=maxProduct) {
					count++;
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
			System.out.println("The max number of subarrays are: "+count);
		
		}		
	}
}
