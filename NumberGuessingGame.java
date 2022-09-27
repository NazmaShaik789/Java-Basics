package com.nzm.javabasics;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int num = r.nextInt(100);
		System.out.println("Welcome to Number Guessing Game :)");
		System.out.println("A number choosen between 1 to 100" + " "+ "You have 5 chances to guess the number" );
		int k =5,i, guessed_num;
		
		for(i=0;i<k;i++) {
			System.out.println("Guess the number:");
			guessed_num = sc.nextInt();
			if(guessed_num == num) {
				System.out.println("Congrats!!!... you guessed the number correctly ");
				break;
			}else if(guessed_num < num && i!=k) {
				System.err.println("Sorry :( ");
				System.err.println("Hint -> The number is greater than" + guessed_num);
				System.out.println("you have left  "+(k-i-1)+" chances");
			}else if(guessed_num > num && i!=k){
				System.err.println("Sorry :( ");
				System.err.println("Hint -> The number is less than" + guessed_num);
				System.err.println("you have left  "+(k-i-1)+" chances");
			}
		}
		if(i==k) {
			System.out.println(
					"You have exhausted"
					+ " K trials.");

				System.out.println(
					"The number was " + num);
		}
	}

}
