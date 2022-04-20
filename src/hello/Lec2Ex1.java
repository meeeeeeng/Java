package hello;

import java.util.Scanner;

public class Lec2Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x,y;
		
		System.out.println("첫번째 숫자를 입력하시오 : ");
		x=input.nextInt();
		System.out.println("두번째 숫자를 입력하시오 : ");
		y=input.nextInt();
		
		if(x>y)
			System.out.println(x+"가(이) 더 크다.");
		else
			System.out.println(y+"가 더 크다.");
	}

}
