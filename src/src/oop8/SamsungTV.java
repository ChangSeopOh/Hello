package oop8;

public class SamsungTV implements TV{
	private Speaker speaker = new OrangeSpeaker();
	
	public void powerOn(){
		System.out.println("SamsungTV : ������ �մϴ�.");
	}
	public void powerOff(){
		System.out.println("SamsungTV : ������ ���ϴ�.");
	}
	public void channelUp(){
		System.out.println("SamsungTV : ä���� �ø��ϴ�.");
	}
	public void channelDown(){
		System.out.println("SamsungTV : ä���� �����ϴ�.");
	}
	public void soundUp(){
		if (speaker == null) {
			System.out.println("SamsungTV : �Ҹ��� Ű��ϴ�.");
		} else {
			speaker.soundUp();
		}
		
	}
	public void soundDown(){
		if (speaker == null) {
			System.out.println("SamsungTV : �Ҹ��� ����ϴ�.");
		} else {
			speaker.soundDown();
		}
	
	}
	
	
	
	
}
