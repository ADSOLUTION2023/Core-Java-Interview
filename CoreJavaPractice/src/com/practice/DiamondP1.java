package com.practice;

public class DiamondP1 {
	public static void main(String[] args) {
		// Right angled triangle

//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//
//		// Inverted right angled triangle
//
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 5; j >= i; j--) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

//Diamond Pattern Started
		// Triangle
//		  for (int i = 1; i <= 5; i++) {
//			  // for Spaces 
//			for (int j = 1; j <= 5 - i; j++){ 
//				  System.out.print(" "); 
//				  } 
//			  //for Stars 
//		  for  (int j = 1; j <= i; j++) {
//		  System.out.print("* "); 
//		  } 
//			  System.out.println(); 
//		  }
//     		//Inverted Right angled
//		for (int i = 1; i <= 4; i++) {
//			// for Spaces
//			for (int j = 1; j <=i; j++) {
//				System.out.print(" ");
//			}
//			//for Stars
//			for (int j = 5; j >i ; j--) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//Diamond Pattern Ended

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}