package Thread;

public class threadTest05 extends Thread{
	
	public static void main(String[] args) {
	
		
		Thread t1 = new threadTest05();
		Thread t2 = new threadTest05();
		Thread t3 = new threadTest05();
		t1.setName("t1");//runnable때는 안됨, Thread상속일때만 가능함
		t2.setName("t2");
		t3.setName("t3");
		
		t1.setPriority(Thread.MAX_PRIORITY); //10과 같음
		t2.setPriority(Thread.NORM_PRIORITY); //10과 같음
		t3.setPriority(Thread.MIN_PRIORITY); //10과 같음
		
		t1.start();
		t2.start();
		t3.start();
		
		//main Thread, Thread0, Thread1, Thread2순으로 이름이 지어짐.(멀티쓰레드)
		System.out.println(Thread.currentThread().getName()+"종료");// 주로 runnable에서 쓰임
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName()+" : " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"end");
	}
}