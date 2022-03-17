import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("월을 입력하시오: ");
		month=scan.nextInt();
		
		
		switch(month)
		{
		case 2:
			System.out.println("28일");	
			break;
				
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일");	
			break;
		default:
			System.out.println("31일");	
			break;
		
		}
		
		
	}

}
