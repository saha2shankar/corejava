package Looping;

public class forEachloop {
public static void main(String[] args) {
	int[] value = {20,29,29,432,44,242,114,1454,442,114};
	int i=0;
	for(int x : value) {
		System.out.println(x);
		i= i+x;
		
	}
	System.out.println("sum of all num :"+i);
	
}
}
