import java.util.Scanner;

public class Lec2Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int in=0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("�ݺ� Ƚ���� �Է��Ͻÿ�: ");
		in=input.nextInt();
		
		int i;
		double plma=1;
		double bunmo=1;
		double out=0;
		
		
		for(i=1;i<=in;i++) {
			out=out+(1/bunmo)*plma;	
			bunmo=bunmo+2;
			plma=plma*-1;
			
		}
			System.out.println("Pi: "+ (4*out));

	}

}
