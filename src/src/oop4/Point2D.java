package oop4;

public class Point2D {
	int x;
	int y;
	
	
	
	//�ؿ� ������� PointTest���� �ҷ��Ë� �ڵ����� ����� �ش�.
	public Point2D(){// �޼ҵ� ���� ���̴µ� ���ϰ��� ����
	this(10,10);//���Ӱ� ������ ���� �ƴ϶� �Ʒ� �޼ҵ带 �̿��� ���̴�.
	//this ������ �Ʒ� �Ű������ִ� �޼ҵ���� ����ϰԵȴ�.
	
	System.out.println("Point2D() ����");
	
	
		// constructor��� �Ѵ�
	}//default constructor �⺻������.				 


//����Ʈ�����ڰ� ���� �Ʒ��� ����� ������ ���� �ֱ⶧����
//������ �ִ� �����ڸ� ������ ����Ʈ�����ڸ� ������ �Ѵ�
	public Point2D(int x, int y) {//������ �������
		//���ο��� ������ ������ �ѱ��. ������ ����ó��
		//�ȳѾ��
		
		this.x = x;
		this.y = y;
		
		System.out.println("Point2D(x,y) ����");
	}



	
	
	
}
