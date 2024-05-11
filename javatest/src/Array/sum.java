package Array;

public class sum {

	   public static void main(String[] args) {
	        String[] countries = {"USA", "Canada", "Brazil", "France", "Germany", "Japan", "India", "Australia", "Russia", "China"};
	        
	        printCountries(countries);
	    }
	    
	    public static void printCountries(String[] countries) {
	        System.out.println("List of countries:");
	        for (int i = 0; i < countries.length; i++) {
	            System.out.println((i+1) + ". " + countries[i]);
	        }
	    }
}
