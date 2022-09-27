package com.nzm.javabasics;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		
		int[][] a1 = new int[r1][c1];
		//accepting input elements for first array a1
		
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a1[0].length;j++) {
				a1[i][j] = sc.nextInt();
			}
		}
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		
		int[][] a2 = new int[r2][c2];
		//accepting input elements for first array a2
		
		for(int i=0;i<a2.length;i++) {
			for(int j=0;j<a2[0].length;j++) {
				a2[i][j] = sc.nextInt();
			}
		}
		
		int[][] prd = new int[r1][c2];
		
		if(r1 != c2) {
			System.out.println("Invalid input");
			return;
		}
		
		for(int i=0;i<prd.length;i++) {
			for(int j=0;j<prd[0].length;j++) {
				
				for(int k=0;k<c1;k++) {
					
					prd[i][j] += a1[i][k]*a2[k][j];
				}
			}
		}
		
		
		for(int i=0;i<prd.length;i++) {
			for(int j=0;j<prd[0].length;j++) {
				System.out.print(prd[i][j]+" ");
			}
			System.out.println();
		}
	}

}
