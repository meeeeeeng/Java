/*
 * 세번째 예제프로그램 
 * @version 1.0 2022-03-10
 * @author 채민지
 */
import java.util.Scanner; // scanner 클래스 포함

public class QuadraticEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		float b;
		float c;
		
		System.out.print("첫번쨰 숫자를 입력하시오: ");
		b=input.nextFloat();
		
		System.out.print("두번쨰 숫자를 입력하시오: ");
		c=input.nextFloat();
		
		
		double dResult= (-b+Math.sqrt(b*b-4*c))/2;
		System.out.println("result = "+dResult);
	}

}
