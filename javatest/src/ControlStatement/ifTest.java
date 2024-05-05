package ControlStatement;

import java.util.Scanner;

public class ifTest {
public static void main(String[] args) {
	int salary;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your salary ");
	salary = sc.nextInt();
	if(salary <40000) {
		salary = salary +5000;
	}
	System.out.println("Total salary is :"+salary);
}
}
