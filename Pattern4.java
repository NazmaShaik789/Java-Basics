package com.nzm.javaPatterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int st =n;
		int sp =0;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print("\t");
			}
			for(int j=1;j<=st;j++) {
				System.out.print("*\t");
			}
			System.out.println();
			System.out.println();
			sp++;
			st--;
		}
		scanner.close();
	}

}
