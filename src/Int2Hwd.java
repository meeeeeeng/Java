import java.util.Scanner;

public class Int2Hwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��Ͻÿ�: ");
		num=input.nextInt();
		
		
		switch(num)
		{ case 1:
			System.out.println("�ϳ�");
			break;
		case 2:
			System.out.println("��");
			break;
		case 3:
			System.out.println("��");
			break;
		default:
			System.out.println("����");
			break;
					
		}
		
		
	}

}