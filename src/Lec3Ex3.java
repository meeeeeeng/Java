
import java.util.Scanner;

public class Lec3Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int num=100;
		int i=0;
		int count = 0;
		
		//System.out.print("���� ������ �Է��Ͻÿ�: ");
		//num=input.nextInt();
		System.out.print(num+"�Ҽ�: ");
		
		for(i=1;i<=num;i++)
		{
			if(i/2<=1&&i/3<=1){
				if(i/5<=1&&i/7<=1) {
					if(Math.sqrt(i)<=i) {
				    System.out.print(i);
					System.out.print(" ");
					}
				}
			}
				
		}
		
		
	}}


