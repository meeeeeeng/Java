package hello;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account obj=new Account();
		
		obj.setName("Tom"); //������
		obj.setBalance(100000);
		
		System.out.print(obj.getName()+obj.getBalance()); //������
		
	}

}
