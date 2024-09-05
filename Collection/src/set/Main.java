package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set b = new HashSet();
		Set a = new LinkedHashSet();
		a.add(10);
		a.add(20.6f);
		a.add(30.78d);
		a.add("hello");
		a.add('c');
		System.out.println(a);
		
		Set s1 = new LinkedHashSet();
		s1.add(120);
		s1.add(20.6f);
		s1.add(30.78d);
		s1.add("hello world");
		s1.add('z');
		System.out.println(s1);
		
		//intersection
		a.retainAll(s1);
		System.out.println(a);
		
		//union
		a.addAll(s1);
		System.out.println(a);
		
		//difference
		a.remove(s1);
		System.out.println(a);
	}
}
