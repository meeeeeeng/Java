
public class midterm04 extends midterm05{
	
	
	private String model;
	private String make;
	private static int num=0;
	private int id;
	
	
	public midterm04(String model,	String make) {
		this.model=model;
		this.make=make;
		id=++num;
		System.out.println("�ڵ��� 1�� ����, ������ : "+make);
	
			
	}
	
	
	public midterm04(String make) {
		
		this.make=make;
		id=++num;
		System.out.println("�ڵ��� 1�� ����, ������ : "+make);
			
	}
			
			
	public static int getNumberofCars(){
		return num;
		
		
	}
	
	
	
	
	public static void ShowNumberofCars() {
		
		System.out.print("���� ���귮 : "+num);
	}
	

}
