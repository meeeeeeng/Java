package hello;

import java.util.Scanner;

public class Lec2Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x,y;
		
		System.out.println("ù��° ���ڸ� �Է��Ͻÿ� : ");
		x=input.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��Ͻÿ� : ");
		y=input.nextInt();
		
		if(x>y)
			System.out.println(x+"��(��) �� ũ��.");
		else
			System.out.println(y+"�� �� ũ��.");
	}

}
