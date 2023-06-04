package pkg1;

public class Day5ChildConstructor extends Day5ParentConstructor {
	
	public Day5ChildConstructor() {
		this(1,2);
		System.out.println("Child default constructor");
	}
	public Day5ChildConstructor(int d)
	{
		this();
		System.out.println("Child one parameterized constructor");
	}
	public Day5ChildConstructor(int a, int b)
	{
		this(1,2,3);
		System.out.println("Child two parameterized constructor");
	}
	public Day5ChildConstructor(int e, int f, int g)
	{
		super(1,2);
		System.out.println("Child three parameterized constructor");
	}
	public static void main(String[] args) {
		Day5ChildConstructor ob=new Day5ChildConstructor(1);
	}
}
