package Thread;


public class threadTest02 extends Thread{
	public static void main(String[] args) {
		
		Thread t = new threadTest02();
		
		t.start();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("main : " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			e.printStackTrace();
			}
			
			
		}
		System.out.println("main end");

	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("run : " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			e.printStackTrace();
			}
		}
		System.out.println("rund end");
	}

}
