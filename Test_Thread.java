
class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
		start();
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Child Thread "+i);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println("Thread interrupted");
			}
		}	
	}
}
public class Test_Thread {

	public static void main(String[] args) {
		System.out.println("Thread");
		MyThread t1=new MyThread("ChildThread");
		for(int i=1;i<=5;i++) {
			System.out.println("Main Thread "+i);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println("Main Thread is interrupted");
			}
		}	
                
	}

}