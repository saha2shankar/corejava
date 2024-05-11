package Method;

import java.util.Scanner;

public class printName {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter your name");
String name = sc.next();
System.out.println("enter your address:");
String address = sc.next();
System.out.println("enter your number");
int mobilenumber = sc.nextInt();
System.out.println("enter yout salary");
int salary = sc.nextInt();
name(name,address,mobilenumber,salary);
sc.close();
	
}
static void name(String name, String address,int mobilenumber, int salary ) {
	System.out.println("your name is :"+name);
	System.out.println("Your Address is :"+address);
	System.out.println("Your mobile number is :"+mobilenumber);
	System.out.println("Your salary is :"+salary);
	
}
}
