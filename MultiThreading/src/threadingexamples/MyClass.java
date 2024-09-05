package threadingexamples;
class Chrome implements Runnable{
	public void run() {
		for(int i = 0;i<5;i++) {
		System.out.println("chrome run method");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		}
	}
}
class Notes implements Runnable{
	public void run() {
		System.out.println("notes run method");
	}
}
public class MyClass {
	public static void main(String[] args) {
		Chrome c = new Chrome();
		Thread obj = new Thread(c);
		obj.start();
	}
}
