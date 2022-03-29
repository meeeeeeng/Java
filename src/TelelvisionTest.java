
public class TelelvisionTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Television mytv = new Television();
		
		mytv.channel = 7;
		mytv.volume = 9;
		mytv.onOff = true;
		int ch = mytv.getChannel();
		
		System.out.println("현재 채널은 "+ch+"입니다.");
		
		mytv.print();
	
		
		
		Television urtv = new Television();
		
		urtv.channel = 9;
		urtv.volume = 12;
		urtv.onOff = true;
		
		
		urtv.print();
		
		Television obj = new Television();
		int sum = obj.add(2,3);
		System.out.println("현재 합은 "+sum+"입니다.");

		mytv.setChannel(11);
		
		int chh =mytv.getChannel();
		
		System.out.println("현재 채널은 "+chh+"입니다.");
		
		
	}

}
