package hello;
import java.util.Scanner;


public class email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		String str;
		
	
		
	

		while (true) {
			System.out.print("���ڿ��� �Է��ϼ���> ");
			str = input.next();
			if (str.equals("quit") == true)
				break;
			if (str.matches("^www\\.(.+)")) {
				System.out.println(str + " �� 'www'�� �����մϴ�.");
			} else {
				System.out.println(str + " �� 'www'�� �������� �ʽ��ϴ�.");
			}
	}

	}}
