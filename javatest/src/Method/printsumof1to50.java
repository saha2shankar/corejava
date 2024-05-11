package Method;

public class printsumof1to50 {
public static void main(String[] args) {
	int s  =sum();
	System.out.println("sum of 1 to 50 is :"+s);
	
}
static int sum() {
	
	int j=0;
	for(int i=1; i<=50; i++) {
		j= j+i;
	}
	return j;
}
}
