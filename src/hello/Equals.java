package hello;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car2 firstCar = new Car2("HMW520");
		Car2 secondCar = new Car2("HMW520");
		if (firstCar.equals(secondCar)) {
			System.out.println("동일한 종류의 자동차입니다.");
		} else {
			System.out.println("동일한 종류의 자동차가 아닙니다.");
		}
	}

}
