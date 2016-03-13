package oop8;

public class LgTV implements TV {
	private Speaker speaker = new MarshallSpeaker();

	@Override
	public void powerOn() {
		System.out.println("LgTV : TV를 켭니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV : TV를 끕니다.");
	}

	@Override
	public void channelUp() {
		System.out.println("LgTV : 채널을 올립니다.");
	}

	@Override
	public void channelDown() {
		System.out.println("LgTV : 채널을 낮춥니다.");
	}

	@Override
	public void soundUp() {
		if (speaker == null) {
			System.out.println("LgTV : 사운드를 높입니다.");
		} else {
			speaker.soundUp();
		}
	}

	@Override
	public void soundDown() {
		if (speaker == null) {
			System.out.println("LgTV : 사운드를 낮춥니다.");
		} else {
			speaker.soundDown();
		}
	}
}
