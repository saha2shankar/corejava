package javatest;

import java.util.Scanner;

public class Primetest {
public static void main(String[] args) {
	int n, i, prime = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your number !");
	n=sc.nextInt();
	
	if(n==0 || n==1)
		prime= 1;
	
	for(i=2; i<n; i++) 
		if(n%i==0) {
			prime =1;
			break;
		
	}
	if(prime ==1) {
		System.out.println(+n+ " is a non prime Number.");
	}else {
		System.out.println(+n+" is a Prime Number.");
	}
	
}
}
