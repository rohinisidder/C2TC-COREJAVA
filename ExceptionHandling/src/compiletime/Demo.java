package compiletime;

public class Demo {
	public static void main(String[] args) {
		int a  =10;
		int b = 0;
		try {
			int c = a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("welcome");
		}
	}
}
