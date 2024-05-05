package ControlStatement;

public class NestedTest {
	public static void main(String[] args) {
		String citizen = "nepali";
		boolean voterID = true;
		int Age = 20;
		if(citizen.equals("nepali")) {
			if(Age >18) {
				if(voterID) {
					System.out.println("You can Vote !");
				}else {
					System.out.println("you don't have voter card !");
				}
			}else {
				System.out.println("you are under age of 18");
			}
		}else {
			System.out.println("you are not a citizen of Nepal");
		}
		
	}

}
