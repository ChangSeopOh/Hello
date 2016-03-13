package oop8;

public class OrangeSpeaker implements Speaker {

	@Override
	public void soundUp() {
	System.out.println("Oranger Speaker : 소리를 높입니다");
		
	}

	@Override
	public void soundDown() {
		System.out.println("Oranger Speaker : 소리를 낮춥니다");
		
	}

}
