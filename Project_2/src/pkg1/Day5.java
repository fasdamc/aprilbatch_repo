package pkg1;

public class Day5 {

	public void m1()
	{
		System.out.println("Default method");
	}
	
	public void m2(int a)
	{
		System.out.println("One parameterized method");
	}	
	
	public void m3(int b, int c)
	{
		System.out.println("Two parameterized method");
	}	
	
	public void m4(int d, int e, int f)
	{
		System.out.println("Three parameterized method");
		this.m1();
		this.m3(1,2);
		this.m5(1,2,3,4);
		this.m2(5);
	}
	
	public void m5(int g, int h, int i, int j)
	{
		System.out.println("Four parameterized method");
	}
	
	public static void main(String[] args) {
		Day5 obj=new Day5();
		obj.m4(2,3,4);
	}
}
