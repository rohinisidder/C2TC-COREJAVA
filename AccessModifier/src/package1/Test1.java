package package1;

public class Test1 {
	public int i;
	public void display() {
		System.out.println("access modifier example");
	}
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.i = 5;
		System.out.println(t1.i);
		t1.display();
	}
}
