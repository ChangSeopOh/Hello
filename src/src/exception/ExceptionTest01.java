package exception;

public class ExceptionTest01 {  //예외처리
	public static void main(String[] args) {
		String str = "Hello";
		int[] array = new int[3];
		
		
		

		try {
			System.out.println(str.toString());
			// throw new NullPointerException(); 이거이거나 이거보다 상위 클래스가
			// 와야한다.(Exception, Throwable, etc)
			
			for(int i=0; i<array.length;i++){
				System.out.println(array[i]);
			}
			
		} catch (NullPointerException e) { // null값일땐 NullPointerException이고
											// 나머지는 다 Exception이면 된다.
			// TODO Auto-generated catch block
			System.out.println("Null PointerException이 발생. Str을 확인하세요");
		} // surround with -> try-catch( try해보고 안되면 catch로 넘어간다)
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("배열 인덱스 에러"+e.getMessage());  //e.toString() 몇번째줄인지확인할때
		}					//e.printStackTrace() > e.toString() > e.getMessage() 에러 확인할때,
		catch (Exception e) {
			System.out.println("Exception 발생~");
			e.printStackTrace();
		}finally{ //예외가 적용됬든 안됬는 무조건 사용
			System.out.println("Finally Block");
		}

		System.out.println("종료");
	}
}
