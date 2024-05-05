package javatest;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		double price;
		double time;
		float rate;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter price:");
		price = sc.nextDouble();
		System.out.println("Enter Time:");
		time = sc.nextDouble();
		System.out.println("Enter Rate:");
		rate = sc.nextFloat();
		double Interest = (price* time * rate)100;
		System.out.println("The simeple Interest is :"+Interest);
	}

}
