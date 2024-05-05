package Jumpingtest;

public class Return {
public static void main(String[] args) {
	for(int x=1; x<=20; x++) {
		if (x==5) {
			return;
			
		}
		System.out.println(x);
	}
	System.out.println("Hello World !");
}
}
