
public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car mjCar=new Car();
		
		mjCar.color="red";
		mjCar.gear=2;
		mjCar.speed=80;
	
		
		mjCar.changeGear();
		mjCar.speedUp();
		mjCar.speedDown();
		
		System.out.println(mjCar.toString());
		
		
		
		
		//mjCar.changGear();
		
		

	}

}
