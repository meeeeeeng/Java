package hello;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		
		Scanner input = new Scanner(System.in);

		
		System.out.println("������ �Է��Ͻÿ� : ");
		x=input.nextInt();
		
		if ((x%2)==0)
			System.out.println("¦���Դϴ�.");
		else
			System.out.println("Ȧ���Դϴ�.");
	}

}
