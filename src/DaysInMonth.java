import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է��Ͻÿ�: ");
		month=scan.nextInt();
		
		
		switch(month)
		{
		case 2:
			System.out.println("28��");	
			break;
				
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30��");	
			break;
		default:
			System.out.println("31��");	
			break;
		
		}
		
		
	}

}
