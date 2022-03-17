import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner input = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오: ");
		num=input.nextInt();
		
		if(num%2==0)
			System.out.println(num+" = 짝수이다.");	
		else 
			System.out.println(num+" = 짝수가 아니다.");
		
		
	}

}
