package j0516;

public class Tv {
	String color;
	boolean power;
	int channel;
	int volume;
	
	void power() {// 메소드
		power = !power;
	}// void power

	void channelUp() {
		if(channel>=999) {
			channel=1;
			return;
		}
		channel++;
	}// void channelup

	void channelDown() {
		if(channel<=1) {
			channel=999;
			return;
		}
		channel--;
	}
	
	void volumeUp() {
		if(volume>=100) {
			volume=1;
			return;
		}
		volume++;
	}
	
	void volumeDown() {
		if(volume<=1) {
			volume=99;
			return;
		}
		volume--;
	}

}//이는 Class0516_03 내용과 같음
