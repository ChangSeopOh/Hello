package Thread;


public class threadTest03 implements Runnable{
	public static void main(String[] args) {
		
		Thread nt = new Thread(new threadTest03());
		nt.start();
		
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
