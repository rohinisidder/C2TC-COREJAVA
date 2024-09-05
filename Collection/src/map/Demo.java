package map;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Demo {
	public static void main(String[] args) {
		NavigableMap m = new TreeMap();
		m.put(042, "rohini");
		m.put(005, "ankith");
		System.out.println(m);
	}
}
