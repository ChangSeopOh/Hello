package IO;

public class AutoCloseableTest implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("close ������..");
	}

	public static void main(String[] args) {
		
		
		try {
			
			System.out.println("try");
		} catch (Exception e) {
			System.out.println("catch");
		}
		System.out.println("����");
	}

}
