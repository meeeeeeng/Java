import java.util.Scanner;

public class Lec3Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int num=0;
		int i = 0;
		
		System.out.print("���� ������ �Է��Ͻÿ�: ");
		num=input.nextInt();
		System.out.print(num+"���: ");
		
		for(i=1;i<=num;i++)
		{
			if(num%i == 0)
			{
				System.out.print(i);
				System.out.print(" ");
			}
				
		}
		
		
	}

}
