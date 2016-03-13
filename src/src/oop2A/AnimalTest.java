package oop2A;

public class AnimalTest {
	public static void main(String[] args) {
//		Animal animal = new Eagle();  //up casting
//		Bird bird = new Eagle();
//		Eagle eagle = new Eagle();
//		
//		System.out.println(animal);
//		System.out.println(bird);
//		System.out.println(eagle);
//		
//	
//		//Bird bird2 = animal;  //down casting
//		Bird bird2 = (Bird)animal;  //강제형변환 필요
//		
//		System.out.println(bird2);
//		Animal animal2 = new Tiger();
//		System.out.println(animal2);
//		
//		
//		
//		
//		
		
		
		Eagle eagle2 = new Eagle();
		Animal animal3 = eagle2;
		
		
		if(animal3 instanceof Condor){
		Condor condor = (Condor) animal3;
		}else{
			System.out.println("animal3는 Condor가 아닙니다.");
		}
		
	}
}
