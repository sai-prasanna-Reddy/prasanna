class Hi2 implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hi");               //Multithreading concept
			try {Thread.sleep(1000); }catch(Exception e){}
		}
	}
}
class Hello2 implements Runnable{           // RUNNABLE interface concept
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello");
			try {Thread.sleep(1000); }catch(Exception e){}
		}
	}
}
public class MulThreRunn37 {
	public static void main(String[] args) {
		Runnable obj1=new Hi2();
		Runnable obj2=new Hello2();
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.start();
		t2.start();
	}
}                                     
