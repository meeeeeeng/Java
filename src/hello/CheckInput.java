package hello;

import java.util.Scanner;

public class CheckInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input=new Scanner(System.in);
		
		int month;
		
				
		System.out.println("���� �Է��Ͻÿ�: ");
		month=input.nextInt();
		
			do{		
				System.out.println("���� �Է��Ͻÿ�: ");
				month=input.nextInt();
			}while(month<=1||month>=12);		
			
			System.out.println("�Է��� ���� "+month);
	}
	
	

}
