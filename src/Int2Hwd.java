import java.util.Scanner;

public class Int2Hwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오: ");
		num=input.nextInt();
		
		
		switch(num)
		{ case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		case 3:
			System.out.println("셋");
			break;
		default:
			System.out.println("오류");
			break;
					
		}
		
		
	}

}
