package oop8;

public class LgTV implements TV {
	private Speaker speaker = new MarshallSpeaker();

	@Override
	public void powerOn() {
		System.out.println("LgTV : TV�� �մϴ�.");
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV : TV�� ���ϴ�.");
	}

	@Override
	public void channelUp() {
		System.out.println("LgTV : ä���� �ø��ϴ�.");
	}

	@Override
	public void channelDown() {
		System.out.println("LgTV : ä���� ����ϴ�.");
	}

	@Override
	public void soundUp() {
		if (speaker == null) {
			System.out.println("LgTV : ���带 ���Դϴ�.");
		} else {
			speaker.soundUp();
		}
	}

	@Override
	public void soundDown() {
		if (speaker == null) {
			System.out.println("LgTV : ���带 ����ϴ�.");
		} else {
			speaker.soundDown();
		}
	}
}
