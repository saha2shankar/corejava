package javatest;

import java.util.Scanner;

public class sumofnum {
	public static void main(String[] args) {
		int x=0;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			x = x+i;
		}
		System.out.println("Sum of 1 to "+n+" is :"+x);
	}

}
