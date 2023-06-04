package pkg1;

public class Day5ParentConstructor {
	
	public Day5ParentConstructor()
	{
		this(1,2,3);
		System.out.println("Parent default constructor");
	}
	public Day5ParentConstructor(int d)
	{
		this();
		System.out.println("Parent one parameterized constructor");
	}
	public Day5ParentConstructor(int a, int b)
	{
		this(1);
		System.out.println("Parent two parameterized constructor");
	}
	public Day5ParentConstructor(int e, int f, int g)
	{
		System.out.println("Parent three parameterized constructor");
	}
	public static void main(String[] args) {
		Day5ParentConstructor obj=new Day5ParentConstructor(1,2);
	}
}
