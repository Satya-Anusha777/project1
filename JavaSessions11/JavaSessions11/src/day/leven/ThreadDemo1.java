package day.leven;
/* Creating Thread by extending Thread class 
 --------------------------------------------
 1) Create a new Class by extending Thread class
 2) Override run() 
 3) Create Object of User Class (Acts as a Thread)
 4) Invoke start() which automatically invokes run()
 */
class MyThread extends Thread {
	public void run() {
		System.out.println("Current Thread is :" + Thread.currentThread()); 
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
	}
}
public class ThreadDemo1 {
	public static void main(String[] args) {
	System.out.println("Current Thread is :" + Thread.currentThread()); 
		MyThread myThread = new MyThread();
	myThread.start();
	}
}
