package ControlStatement;

import java.util.Scanner;

public class salaryTest {
	public static void main(String[] args) {
		String post;
		Scanner sc = new Scanner(System.in);
		System.out.println("What's your Post ?");
		post = sc.next();
		switch (post) {
		case ("MD"):
			System.out.println(230000+(230000*20)/100);
		break;
		case ("CEO"):
			System.out.println(250000+(250000*25.79)/100);
		break;
		case ("Manager"):
			System.out.println(176000+(176000*16)/100);
		break;
		case ("Helper"):
			System.out.println(145900+(145900*9)/100);
		break;
			
		}
	}

}
