package throwexample;

import java.io.IOException;

public class ThrowExample {
	public static void validate(int age) throws IOException {
		if(age<21||age>27) {
			throw new IOException("not eligible");
		}
		else {
			System.out.println("eligible to attend military selection");
		}
	}
	public static void main(String[] args) throws IOException {
		try {
			validate(30);
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}
}
