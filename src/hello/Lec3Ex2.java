package hello;

import java.util.Scanner;

public class Lec3Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
		Scanner input=new Scanner(System.in);
		
		
		
				
		System.out.println("���� ������ �Է��Ͻÿ�: ");
		x=input.nextInt();
		
		for(int i=1;i<=x;i++) {
			
			if(x%i==0) {
				System.out.println(i);
				}
			
		}
		
	

		
	}

}
