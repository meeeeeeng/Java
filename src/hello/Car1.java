package hello;

public class Car1 {

	 private String model;
     private String color;
     private int speed;

      // �ڵ����� �ø��� ��ȣ
     private int id;
     private static int numbers = 0;

     public Car1(String m, String c, int s) {
           model = m;
           color = c;
           speed = s;
            // �ڵ����� ������ �����ϰ� id�� �����Ѵ�. 
           id = ++numbers;
     }
  
	
     public static int getNumberOfCars() {
    	 
    	 return numbers;
     }      
           
}
     
     
