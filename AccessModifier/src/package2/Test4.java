package package2;

import package1.Test1;

public class Test4 {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.i = 5;
		System.out.println(t1.i);
		t1.display();
	}
}
