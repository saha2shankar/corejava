package ControlStatement;

import java.util.Scanner;

public class switchtest {
public static void main(String[] args) {
	int day;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number between 1-7 !");
	day = sc.nextInt();{
		
	}
	switch(day) {
	case 1:
		System.out.println("Sunday");
		break;
	case 2:
		System.out.println("Monday");
		break;
	case 3:
		System.out.println("Tuesday");
		break;
	case 4:
		System.out.println("Wednesday");
		break;
	case 5:
		System.out.println("Thrusday");
		break;
	case 6:
		System.out.println("Friday");
		break;
	case 7:
		System.out.println("Saturday");
		break;
	default:
		System.out.println("You choosees Worng Num !");
	
	}
			
}
}
