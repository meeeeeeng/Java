import java.util.Scanner; // scanner 클래스 포함

public class Add2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x;
		int y;
		int sum;
		
		System.out.print("첫번쨰 숫자를 입력하시오: ");
		x=input.nextInt();
		
		System.out.print("두번쨰 숫자를 입력하시오: ");
		y=input.nextInt();
		
		sum=x+y;
		
		System.out.println(sum);
	
	}

}
