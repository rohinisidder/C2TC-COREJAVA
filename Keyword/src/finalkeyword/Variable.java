package finalkeyword;
class Student{
	int id = 1;
	String name = "Rohini";
	final String college = "JSS";
}
public class Variable {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.college);	}
}
