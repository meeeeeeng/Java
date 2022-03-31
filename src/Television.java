public class Television {

		
		private int channel;
		private int volume;
		private boolean onOff;
		
		Television(int c,int v,boolean o){
			channel=c;
			
			if(v<0) {
				System.out.println("범위 오류");	
			}
			else
				volume=v;
			
			onOff=o;
			
		}
		
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

