package threadingexamples;
class Eclipse extends Thread{
	public void run() {
		System.out.println("eclipse id:"+Thread.currentThread().getId());
		System.out.println("eclipse priority:"+Thread.currentThread().getPriority());
		System.out.println("eclipse thread name:"+Thread.currentThread().getName());
	}
}
class Powerpointpresentation extends Thread{
	public void run() {
		System.out.println("ppt id:"+Thread.currentThread().getId());
		System.out.println("ppt priority:"+Thread.currentThread().getPriority());
		System.out.println("ppt thread name:"+Thread.currentThread().getName());
	}
}
public class Main {
	public static void main(String[] args) {
		Eclipse e = new Eclipse();
		e.start();
		e.setPriority(Thread.MAX_PRIORITY);
		
		Powerpointpresentation p = new Powerpointpresentation();
		p.start();
		p.setPriority(Thread.MIN_PRIORITY);
		System.out.println("main thread");
		System.out.println("main thread id:"+Thread.currentThread().getId());
		System.out.println("main thread name:"+Thread.currentThread().getName());
	}
}
