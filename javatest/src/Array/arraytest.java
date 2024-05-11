package Array;

import java.util.Scanner;

public class arraytest {
public static void main(String[] args) {
	
	int  age[]= new int[10];
	Scanner sc = new Scanner(System.in);
	for(int i=0; i<age.length; i++) {
		System.out.println("enter yout age");
		age[i] =sc.nextInt();
	}
	for(int s: age) {
		System.out.println(s);
	}
}
}
