package javatest;

import java.util.Scanner;

public class Area {
public static void main(String[] args) {
	int l;
	int b;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of Length :");
	l = sc.nextInt();
	System.out.println("Enter tha value of Breath :");
	b = sc.nextInt();
	 int area = l*b;
	 System.out.println("The area is : "+ area);
}
}
