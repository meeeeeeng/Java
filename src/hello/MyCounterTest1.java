package hello;

public class MyCounterTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCounter1 my1=new MyCounter1();
		
		int x=10;
		
		my1.inc(x);
		
		System.out.println(x);//������ ����
		
		my1.inc1(my1);//�޼ҵ� ���ڸ� ���� �޼ҵ忡�� ���� �� ���� 
		
		System.out.println(my1.value);// ����
	}

}
