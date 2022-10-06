package com.nzm.javaPatterns;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sp = n/2;
		int st = 1;
		
		for(int i=1;i<=n;i++) {
			for(int j=sp;j>=1;j--) {
				System.out.print("\t");
			}
			for(int j=1;j<=st && st<=n;j++) {
				System.out.print("*\t");
			}
			
			st +=2;
			sp--;
			System.out.println();
		}
		
		scanner.close();
	}

}
