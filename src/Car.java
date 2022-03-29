import java.util.Scanner;

public class Car {

	
		String color;
		int gear;
		int speed;

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
