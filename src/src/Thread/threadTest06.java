package Thread;

public class threadTest06 extends Thread{
	public threadTest06(String name){
		super(name);
	}
	public static void main(String[] args) {
	
		
		Thread t1 = new threadTest06("t1");
		Thread t2 = new threadTest06("t2");
		Thread t3 = new threadTest06("t3");
		
		t1.start();
		t2.start();
		t3.start();
		
		//main Thread, Thread0, Thread1, Thread2������ �̸��� ������.(��Ƽ������)
		System.out.println(Thread.currentThread().getName()+"����");// �ַ� runnable���� ����
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