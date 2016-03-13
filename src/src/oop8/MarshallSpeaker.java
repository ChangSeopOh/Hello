package oop8;

public class MarshallSpeaker implements Speaker{

	@Override
	public void soundUp() {
		System.out.println("MarshallSpeaker : 소리를 올립니다.");
		
	}

	@Override
	public void soundDown() {
		System.out.println("MarshallSpeaker : 소리를 줄입니다.");
		
	}

}
