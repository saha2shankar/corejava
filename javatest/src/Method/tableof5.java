package Method;
import java.util.Scanner;

public class tableof5 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter num which you want to print");
	int a = sc.nextInt();
	printtable(a);
}
static void printtable(int a) {
	for(int i=1; i<=10; i++) {
		System.out.println(+a+"X"+i+"="+(a*i));
	}
}

}
