package Method;

import java.util.Scanner;

public class largestnum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of a");
		int a = sc.nextInt();
		System.out.println("enter number of b");
		int b = sc.nextInt();
		
		
		int larg =checknum(a,b);
		System.out.println("largest number in "+a+ " and "+b+ "is " +larg);
		
	}
	
	static int checknum (int a,int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}

}
