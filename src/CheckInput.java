import java.util.Scanner;

public class CheckInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int mon;
		
		do {
			System.out.print("올바른 월을 입력하시오[1-12]");
			  mon = input.nextInt();
			
		} while(mon<1||mon>12);	
		
			}
	
			System.out.println("사용자가 입력한 월은 " + mon);
	}
	
