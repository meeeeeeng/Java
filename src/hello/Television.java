package hello;

public class Television {

	

		int channel;
		int volume;
		boolean onOff;
		
		public Television(int c, int v, boolean o) {
			
			channel=3;
		}
		
		
		
		
	void print() {
		
		
		System.out.println("channel"+channel+"volume"+volume);
		
	}
	
	int getChannel() {
		
		return channel;
	}

	
	void setChannel(int ch) {
		
		channel=ch;
	}
}
