import java.util.Scanner;

public class Lec2Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("ù��° ���ڸ� �Է��Ͻÿ�: ");
		num1=input.nextInt();
		
		System.out.print("�ι�° ���ڸ� �Է��Ͻÿ�: ");
		num2=input.nextInt();
		
		if(num1>num2){
			System.out.println(num1+" > "+num2);}	
		else if(num1<num2) {
			System.out.println(num1+" < "+num2);}	
		else {
			System.out.println(num1+" = "+num2);}	
		
		
	}
		
}


