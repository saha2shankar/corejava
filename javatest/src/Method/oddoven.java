package Method;

import java.util.Scanner;

public class oddoven {
	
public static void main(String[] args) {
	
	oddevencheck();
}

static void oddevencheck() {
	int a;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter Value of num");
	a= sc.nextInt();
	if(a%2==0) {
		System.out.println("given Number is Even Number !");
	} else {
		System.out.println("Given Number is odd");
	}
}

}
