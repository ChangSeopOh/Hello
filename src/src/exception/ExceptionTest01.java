package exception;

public class ExceptionTest01 {  //����ó��
	public static void main(String[] args) {
		String str = "Hello";
		int[] array = new int[3];
		
		
		

		try {
			System.out.println(str.toString());
			// throw new NullPointerException(); �̰��̰ų� �̰ź��� ���� Ŭ������
			// �;��Ѵ�.(Exception, Throwable, etc)
			
			for(int i=0; i<array.length;i++){
				System.out.println(array[i]);
			}
			
		} catch (NullPointerException e) { // null���϶� NullPointerException�̰�
											// �������� �� Exception�̸� �ȴ�.
			// TODO Auto-generated catch block
			System.out.println("Null PointerException�� �߻�. Str�� Ȯ���ϼ���");
		} // surround with -> try-catch( try�غ��� �ȵǸ� catch�� �Ѿ��)
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�迭 �ε��� ����"+e.getMessage());  //e.toString() ���°������Ȯ���Ҷ�
		}					//e.printStackTrace() > e.toString() > e.getMessage() ���� Ȯ���Ҷ�,
		catch (Exception e) {
			System.out.println("Exception �߻�~");
			e.printStackTrace();
		}finally{ //���ܰ� ������ �ȉ�� ������ ���
			System.out.println("Finally Block");
		}

		System.out.println("����");
	}
}
