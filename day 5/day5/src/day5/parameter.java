package day5;

public class parameter {

	public parameter() 
	{
		System.out.println("Default");
	}
	
	public parameter(String name) {
		System.out.println("Paramertre");
		System.out.println(name);
	}
	
	public static void  main(String args []) {
		parameter p = new parameter();
		parameter p1 = new parameter("Mudit");
	}
	
}
