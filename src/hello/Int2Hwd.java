package hello;

import java.util.Scanner;

public class Int2Hwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner input=new Scanner(System.in);
		
		int x;
		
				
		System.out.println("���ڸ� �Է��Ͻÿ�: ");
		x=input.nextInt();
		
		switch(x) {
			case 1:
				System.out.println("�ϳ�");
				break;
			case 2:
				System.out.println("��");
				break;
			default:
				System.out.println("����");
				break;
		
		}
		
		
	}

}
