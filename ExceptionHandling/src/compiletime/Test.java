package compiletime;
import java.io.FileInputStream;
public class Test {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:\\Users\\Rohini\\Desktop\\AIML-Syll.lnk");
		}
		catch(Exception e){
			System.out.println(e);
		}
		int k;
		try {
			while((k=fis.read())!=-1) {
				System.out.println((char)k);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
