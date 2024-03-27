package classwork;

public abstract class AbstractSearch {
	public abstract boolean search(Object [] obj_list, Object obj);
	public static void main(String[] args) {
	    Integer[] integer_list = {1, 2, 3, 4, 5};
	    String[] string_list = {"Rajesh", "Ashwin", "Harish"};

	    IntegerSearch integerSearch = new IntegerSearch();
	    StringSearch stringSearch = new StringSearch();

	    System.out.println("Condition = " + integerSearch.search(integer_list, 3));
	    System.out.println("Condition = " + integerSearch.search(integer_list, 6));  

	    System.out.println("Condition = " + stringSearch.search(string_list, "Ashwin")); 
	    System.out.println("Condition = " + stringSearch.search(string_list, "Anand"));   
	}
}
