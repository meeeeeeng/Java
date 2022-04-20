package hello;

import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		int x;
		
				
		System.out.println("월을 입력하시오: ");
		x=input.nextInt();
		
		switch(x) {
			case 4:
			case 6:
			case 9:
			case 11:
				
				System.out.println("30일");
				break;
			case 2:
				System.out.println("28일");
				break;
				
			default:
				System.out.println("31일");
				break;
		
		}
		

	}

}
