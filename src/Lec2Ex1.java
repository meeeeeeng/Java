import java.util.Scanner;

public class Lec2Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하시오: ");
		num1=input.nextInt();
		
		System.out.print("두번째 숫자를 입력하시오: ");
		num2=input.nextInt();
		
		if(num1>num2){
			System.out.println(num1+" > "+num2);}	
		else if(num1<num2) {
			System.out.println(num1+" < "+num2);}	
		else {
			System.out.println(num1+" = "+num2);}	
		
		
	}
		
}


