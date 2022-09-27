package com.nzm.javabasics;

import java.util.Scanner;

public class SpiralArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		int[][] arr = new int[r][c];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int minr=0;
		int minc=0;
		int maxr=arr.length-1;
		int maxc=arr[0].length-1;
		int total_elements = r * c;
		int count=0;
		
		while(count < total_elements) {
			
			for(int i=minr, j=minc;i<=maxr && count < total_elements;i++) {
				System.out.println(arr[i][j]);
				count++;
			}
			minc++;
			
			for(int i=maxr, j=minc;j<=maxc && count < total_elements;j++) {
				System.out.println(arr[i][j]);
				count++;
			}
			maxr--;
			
			for(int i=maxr, j=maxc;i>=minr && count < total_elements;i--) {
				System.out.println(arr[i][j]);
				count++;
			}
			maxc--;
			
			for(int i=minr, j=maxc;j>=minc && count < total_elements;j--) {
				System.out.println(arr[i][j]);
				count++;
			}
			minr++;
		}
		
		
	}

}
