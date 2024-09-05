package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		List a = new Vector();
		a.add(10);
		a.add(20.6f);
		a.add(30.78d);
		a.add("hello");
		a.add('c');
		System.out.println(a);
	}
}
