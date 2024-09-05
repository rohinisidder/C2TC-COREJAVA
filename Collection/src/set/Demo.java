package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
		SortedSet t = new TreeSet();
		t.add(10);
		t.add(20);
		t.add(3);
		t.add(17);
		t.add(100);
		System.out.println(t);
		
		List l = new ArrayList();
		l.add(10);
		l.add(2);
		l.add(34);
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
	}
}
