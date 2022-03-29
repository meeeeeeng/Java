public class Television {

		
		int channel;
		int volume;
		boolean onOff;
		
		
		void print() {
				System.out.println("텔레비전 채널"+channel+"이고 볼륨은"+volume+"입니다");
			}
		
		int getChannel() {
			return channel;
		}
		
		int add(int x, int y) {
			return x+y;
			
		}
		
		
		void setChannel(int ch){
			channel=ch;
			
		}
		
		
}

