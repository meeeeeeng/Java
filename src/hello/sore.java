package hello;
import java.util.Scanner;

public class sore {
	public static void main(String[] args) {
	
	
	Scanner input=new Scanner(System.in);
	
	int x;
	
	
	
	
	System.out.println("������ �Է��Ͻÿ�: ");
	x=input.nextInt();
	
	if(x>=90)
		System.out.println("A");
	else if(90<x&&x>=80)
		System.out.println("B");
	
	else if(80<x&&x>=70)
		System.out.println("C");
	
	else
		System.out.println("����");
	
	
	
	
	}

}
