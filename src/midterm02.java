import java.util.*;

public class midterm02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input=new Scanner(System.in);
			
			
			
			int num=0;
			int i = 0;
			
			System.out.print("���� ������ �Է��Ͻÿ�: ");
			num=input.nextInt();
			
			
				if(num!=0&&num>0) {
					System.out.println(num+"�� ����� ������ �����ϴ�.");
					
					for(i=1;i<=num;i++)
					{
						if(num%i == 0)
						{
							System.out.print(i);
							System.out.print(" ");
						}
							
					}
				}	
				else {	
						System.out.println("���� ������ �ƴմϴ�.");
						
				}
				
			
	}

}
