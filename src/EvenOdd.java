import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner input = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��Ͻÿ�: ");
		num=input.nextInt();
		
		if(num%2==0)
			System.out.println(num+" = ¦���̴�.");	
		else 
			System.out.println(num+" = ¦���� �ƴϴ�.");
		
		
	}

}
