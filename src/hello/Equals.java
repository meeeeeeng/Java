package hello;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car2 firstCar = new Car2("HMW520");
		Car2 secondCar = new Car2("HMW520");
		if (firstCar.equals(secondCar)) {
			System.out.println("������ ������ �ڵ����Դϴ�.");
		} else {
			System.out.println("������ ������ �ڵ����� �ƴմϴ�.");
		}
	}

}
