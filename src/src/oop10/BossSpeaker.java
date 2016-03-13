package oop10;

public class BossSpeaker implements Amp{

	@Override
	public void powerOn() {
		System.out.println("Power On");
		
	}

	@Override
	public void powerOff() {
		System.out.println("Power Off");
		
	}

	@Override
	public void soundUp() {
		System.out.println("Sound Up");
		
	}

	@Override
	public void soundDown() {
		System.out.println("Sound Down");
		
	}

}
