package examples;

public class Unboxing {
	public static void main(String[] args) {
		Integer a = new Integer(5);
		int i = a.intValue();
		int j = a;
		System.out.println(a);
		System.out.println(i);
		System.out.println(j);
	}
}
