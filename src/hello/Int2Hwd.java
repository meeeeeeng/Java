package hello;

import java.util.Scanner;

public class Int2Hwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner input=new Scanner(System.in);
		
		int x;
		
				
		System.out.println("숫자를 입력하시오: ");
		x=input.nextInt();
		
		switch(x) {
			case 1:
				System.out.println("하나");
				break;
			case 2:
				System.out.println("둘");
				break;
			default:
				System.out.println("오류");
				break;
		
		}
		
		
	}

}
