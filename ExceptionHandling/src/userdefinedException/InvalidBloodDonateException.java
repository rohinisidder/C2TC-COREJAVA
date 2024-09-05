package userdefinedException;

public class InvalidBloodDonateException extends RuntimeException {
	InvalidBloodDonateException(String s){
		super(s);
	}
}
