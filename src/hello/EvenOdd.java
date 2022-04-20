package hello;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		
		Scanner input = new Scanner(System.in);

		
		System.out.println("정수를 입력하시오 : ");
		x=input.nextInt();
		
		if ((x%2)==0)
			System.out.println("짝수입니다.");
		else
			System.out.println("홀수입니다.");
	}

}
