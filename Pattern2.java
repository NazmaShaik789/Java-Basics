package com.nzm.javaPatterns;

import java.util.Scanner;

public class Pattern2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n =scanner.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j>=i) {
					System.out.print("*\t");
				}
			}
			System.out.println();
			System.out.println();
			scanner.close();
		}
	}

}
