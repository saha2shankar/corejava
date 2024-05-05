package ControlStatement;

import java.util.Scanner;

public class marks {
public static void main(String[] args) {
	int mark;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Marks");
	mark = sc.nextInt();
	if(mark >=90 && mark<=100) {
		System.out.println("congralution you Got A+");
	}else if(mark >=80 && mark<90) {
		System.out.println("Congralution you Got A");
	}else if(mark >=70 && mark<80) {
		System.out.println("Congralution you Got B+");
	}else if(mark >=60 && mark<70) {
		System.out.println("Congralution you got B");
	}else if(mark >=50 && mark<=60) {
		System.out.println("Congralution you got c+");
	}else if (mark >=40 && mark<=50) {
		System.out.println("Congralution you get c");
	}else if (mark >=30 && mark<40) {
		System.out.println("Congralution you get D+");
	}else if (mark <30 && mark >0) {
		System.out.println("You get fail, Try Again");
	}else {
		System.out.println("please enter correct marks");
	}
	
}
}
