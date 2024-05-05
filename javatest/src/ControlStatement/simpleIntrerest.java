package ControlStatement;

import java.util.Scanner;

public class simpleIntrerest {
public static void main(String[] args) {
	int p;
	int t;
	int r;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Price :");
	p = sc.nextInt();
	System.out.println("Enter Time :");
	t = sc.nextInt();
	System.out.println("Enter Rate :");
	r = sc.nextInt();
	if(p==0 || t==0 || r==0) {
		System.out.println("Price, time , or rate can not be zero, Try again !");
		
	} else {
		int simpleinterest = (p*t*r)/100;
		System.out.println("Simple Interest is Equal to :"+simpleinterest);
	}
	
}
}
