import java.util.Scanner;

public class Lec4Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String in;
		Scanner input = new Scanner(System.in);
		//System.out.println("���ڿ��� �Է��ϼ��� > ");
		//in=input.nextLine();
		
		
		String w="www";
		
		
		while(true) {
			System.out.println("���ڿ��� �Է��ϼ��� > ");
			in=input.nextLine();
			boolean out=w.equals(in);
				if(false=="quit".equals(in)) {
					
												
						if(out==false) {
							System.out.println(in+"�� "+w+"�� �������� �ʽ��ϴ�.");
							continue;
						}
						if(out==true) {
							System.out.println(in+"�� "+w+"�� �����մϴ�.");
							continue;
							
						}
		   }
				if(true=="quit".equals(in))	{
					
					System.out.println("���α׷� ����");
					break;
				}
				
		
	}
		
		
		
}	
		
}

