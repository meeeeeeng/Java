public class Television {

		
		private int channel;
		private int volume;
		private boolean onOff;
		
		Television(int c,int v,boolean o){
			channel=c;
			
			if(v<0) {
				System.out.println("���� ����");	
			}
			else
				volume=v;
			
			onOff=o;
			
		}
		
		void print() {
				System.out.println("�ڷ����� ä��"+channel+"�̰� ������"+volume+"�Դϴ�");
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

