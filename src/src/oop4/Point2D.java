package oop4;

public class Point2D {
	int x;
	int y;
	
	
	
	//밑에 없을경우 PointTest에서 불러올떄 자동으로 만들어 준다.
	public Point2D(){// 메소드 같이 보이는데 리턴값이 없다
	this(10,10);//새롭게 구현한 것이 아니라 아래 메소드를 이용한 것이다.
	//this 때문에 아래 매개변수있는 메소드부터 출력하게된다.
	
	System.out.println("Point2D() 수행");
	
	
		// constructor라고도 한다
	}//default constructor 기본생성자.				 


//디폴트생성자가 없이 아래를 만들면 에러가 날수 있기때문에
//변수가 있는 생성자를 만들경우 디폴트생성자를 만들어야 한다
	public Point2D(int x, int y) {//변수가 있을경우
		//메인에서 변수가 있으면 넘긴다. 없으면 위에처럼
		//안넘어간다
		
		this.x = x;
		this.y = y;
		
		System.out.println("Point2D(x,y) 수행");
	}



	
	
	
}
