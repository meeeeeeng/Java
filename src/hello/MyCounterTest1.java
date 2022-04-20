package hello;

public class MyCounterTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCounter1 my1=new MyCounter1();
		
		int x=10;
		
		my1.inc(x);
		
		System.out.println(x);//변하지 않음
		
		my1.inc1(my1);//메소드 인자를 통해 메소드에게 들어가서 값 변경 
		
		System.out.println(my1.value);// 변함
	}

}
