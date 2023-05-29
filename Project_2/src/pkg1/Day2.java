package pkg1;

public class Day2 {
	public int multi(int a,int b) {
		int x=a*b;
		return x;
	}
	public int sum(int c,int d) {
		int y=c+d;
		return y;
	}
	public int sub(int e,int f) {
		int z=e-f;
		return z;
	}
	public int div(int v1,int v2) {
		int w=v1/v2;
		return w;
	}
	public static void main(String[] args) {
		Day2 obj=new Day2();
		int multresult=obj.multi(10,2);
		int addresult=obj.sum(multresult, 2);
		int subtresult=obj.sub(addresult, 2);
		int subtresult2=obj.sub(subtresult, 2);
		int assignment2=obj.div(subtresult2, 2);
		System.out.println("Result of (((((10*2)-2)+2)-2)/2) is "+assignment2);
		
		int addresult2=obj.sum(10,2);
		int addresult3=obj.sum(addresult2,2);
		int subtresult3=obj.sub(addresult3, 2);
		int multiresult2=obj.multi(subtresult3, 2);
		int assignment1=obj.div(multiresult2,2);
		System.out.println("Result of (((((10+2)+2)-2)*2)/2) is "+assignment1);
	
	
		
	}
}
