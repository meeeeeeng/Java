/*
 * ����° �������α׷� 
 * @version 1.0 2022-03-10
 * @author ä����
 */
import java.util.Scanner; // scanner Ŭ���� ����

public class QuadraticEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		float b;
		float c;
		
		System.out.print("ù���� ���ڸ� �Է��Ͻÿ�: ");
		b=input.nextFloat();
		
		System.out.print("�ι��� ���ڸ� �Է��Ͻÿ�: ");
		c=input.nextFloat();
		
		
		double dResult= (-b+Math.sqrt(b*b-4*c))/2;
		System.out.println("result = "+dResult);
	}

}
