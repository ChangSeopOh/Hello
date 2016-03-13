package Thread;

public class threadTest05 extends Thread{
	
	public static void main(String[] args) {
	
		
		Thread t1 = new threadTest05();
		Thread t2 = new threadTest05();
		Thread t3 = new threadTest05();
		t1.setName("t1");//runnable���� �ȵ�, Thread����϶��� ������
		t2.setName("t2");
		t3.setName("t3");
		
		t1.setPriority(Thread.MAX_PRIORITY); //10�� ����
		t2.setPriority(Thread.NORM_PRIORITY); //10�� ����
		t3.setPriority(Thread.MIN_PRIORITY); //10�� ����
		
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