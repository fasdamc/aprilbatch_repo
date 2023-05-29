package pkg1;

public class Day1 { //pillar #1
	int roll_no;
	int age;
	public void method_one(){
		System.out.println("welcome to all of you");
	}
	public void method_two(){
		System.out.println("automation is very easy");
	}
	public static void main(String[] args) { //pillar #2
		Day1 student_obj=new Day1(); //pillar #3
		student_obj.method_one(); //pillar #4
		student_obj.method_two();
		student_obj.roll_no=2;
		student_obj.age=30;
		System.out.println("roll number is  " + student_obj.roll_no);
		System.out.println("age is " + student_obj.age);
	}
}