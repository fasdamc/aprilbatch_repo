package pkg1;

public class Day4 { 
	public Day4(int a,int b,int c) { //type class name and ctrl + space
		// TODO Auto-generated constructor stub
		System.out.println("3 parameterized constructor");
	}
	public Day4() { 
		this (1,2,3);
		System.out.println("default constructor");
	}
	public Day4(int d,int e) { 
		this ();
		System.out.println("2 parameterized constructor");
	}
	public Day4(int f, int h, int i, int j) { 
		this (1,2);
		System.out.println("4 parameterized constructor");
	}	
	public Day4(int k) { 
		this (1,2,3,4);
		System.out.println("1 parameterized constructor");
	}
	public static void main(String[] args) {
		Day4 obj=new Day4(1);
	}
}
