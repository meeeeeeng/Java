package hello;

public class CarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 c1 = new Car1("S600", "white", 80); 	// ù ��° ������ ȣ��
        Car1 c2 = new Car1("E500", "blue", 20); 	// ù ��° ������ ȣ��
        //int n = Car1.numbers;	// ���� ���� (�ϳ��� ���� ����) 
        
        int n = Car1.getNumberOfCars();
        System.out.println("���ݱ��� ������ �ڵ��� �� = " + n);
	}

}
