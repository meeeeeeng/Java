package hello;

import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		int x;
		
				
		System.out.println("���� �Է��Ͻÿ�: ");
		x=input.nextInt();
		
		switch(x) {
			case 4:
			case 6:
			case 9:
			case 11:
				
				System.out.println("30��");
				break;
			case 2:
				System.out.println("28��");
				break;
				
			default:
				System.out.println("31��");
				break;
		
		}
		

	}

}
