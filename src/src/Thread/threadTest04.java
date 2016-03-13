package Thread;

public class threadTest04 {
	public static void main(String[] args) {

		Thread t = new Thread(new Runnable() {

			@Override
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
		});

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

}
