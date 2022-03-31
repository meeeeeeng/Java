import java.util.Scanner;

public class Car {

	
		
		private int gear;
		private int speed;

		private int id;
		private static int numbers=0;
		private String model;
		private String color;
		
		
		public Car(String m,String c,int s) {
			model=m;
			color=c;
			speed=s;
			
			id=++numbers;
			
		}
		
		public static int getNumberOfCars(){
			return numbers;
			
		}
		
		
		void changeGear() {
			
			int in;
			Scanner input = new Scanner(System.in);
			System.out.println("원하는 기어 값을 입력하시오 :");
			in=input.nextInt();
			gear=in;
			
		}
		
		

		void speedUp() {
			speed= speed+1;
			
		}
		
		void speedDown() {
			speed= speed-1;
			
		}
		
		
		
	public String toString() {
		return "Car[color="+color+",speed="+speed+",gear="+gear+"]";
	}

}
