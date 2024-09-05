package examples;

public class Autoboxing {
	public static void main(String[] args) {
		int a = 5;
		Integer i = Integer.valueOf(a);//older version
		Integer j = a;//newer version
		System.out.println(a);
		System.out.println(i);
		System.out.println(j);
	}
}
