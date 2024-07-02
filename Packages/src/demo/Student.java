package demo;

public class Student {
	int usn;
	String name;
	float marks;
	char gender;
	
	void add(int id,String fullname,float score) {
		usn = id;
		name = fullname;
		marks = score;
		System.out.println(usn+" "+name+" "+marks);
	}
	Student(){
		
	}
	Student(int id,String fullname,float score){
		usn = id;
		name = fullname;
		marks = score;
		System.out.println(usn+" "+name+" "+marks);
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.usn = 42;
		s1.name = "Rohini P Sidder";
		s1.marks = 40;
		s1.gender = 'F';
		
		Student s2 = new Student();
		s2.add(05,"Ankith",99);
		System.out.println(s1.usn+" "+s1.name+" "+s1.marks);
		
		Student s3 = new Student(90,"Shashank",90);
	}
}
