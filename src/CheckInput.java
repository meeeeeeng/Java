import java.util.Scanner;

public class CheckInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int mon;
		
		do {
			System.out.print("�ùٸ� ���� �Է��Ͻÿ�[1-12]");
			  mon = input.nextInt();
			
		} while(mon<1||mon>12);	
		
			}
	
			System.out.println("����ڰ� �Է��� ���� " + mon);
	}
	
