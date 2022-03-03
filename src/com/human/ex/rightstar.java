package com.human.ex;

public class rightstar {
	public static void main(String[] args) {
		int row=5;
		for(int i =0; i<row; i++) {

			for(int j=0; j<row-i-1; j++) {
				System.out.print(" ");
			}
			for(int j=row-i-1; j<row; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
