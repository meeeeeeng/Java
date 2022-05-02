
public class midterm04 extends midterm05{
	
	
	private String model;
	private String make;
	private static int num=0;
	private int id;
	
	
	public midterm04(String model,	String make) {
		this.model=model;
		this.make=make;
		id=++num;
		System.out.println("자동차 1대 생산, 생산지 : "+make);
	
			
	}
	
	
	public midterm04(String make) {
		
		this.make=make;
		id=++num;
		System.out.println("자동차 1대 생산, 생산지 : "+make);
			
	}
			
			
	public static int getNumberofCars(){
		return num;
		
		
	}
	
	
	
	
	public static void ShowNumberofCars() {
		
		System.out.print("누적 생산량 : "+num);
	}
	

}
