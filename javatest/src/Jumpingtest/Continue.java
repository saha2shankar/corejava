package Jumpingtest;

public class Continue {
public static void main(String[] args) {
	for (int i=10; i<=20; i++) {
		if(i==14 ||i==19) {
			continue;
		}
		System.out.println(i);
	}
}
}
