package userdefinedException;

public class Method {
	public static void validate(int age, int weight){
		if (age>18&&weight<55) {
			throw new InvalidBloodDonateException("not eligible");
		}
		else {
			System.out.println("Can Donate Blood");
		}
	}
}
