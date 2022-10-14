package Exam_22.exercise;

public class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOnOff() {     //this.isPowerOn = ! this.isPowerOn
		if(this.isPowerOn == true) {
			this.isPowerOn = false;
		}
		else {
			this.isPowerOn = true;
		}
	}
	void volumeUp() {
		if(this.volume < MAX_VOLUME) {
			this.volume = this.volume +1;
		}
	}
	void volumeDown() {
		if(this.volume > MIN_VOLUME) {
			this.volume = this.volume -1;
		}
	}
	void channelUp() {
		if(channel == MAX_CHANNEL) { //this.channel이 100보다 큰 경우도 있으니 좋은 코드는 아님.
			channel = MAX_CHANNEL;
		}
		else {
			channel++;
		}
	}
	void channelDown() {
		if(channel == MIN_CHANNEL) {
			channel = MIN_CHANNEL;
		}
		else {
			channel--;
		}
	}
}
