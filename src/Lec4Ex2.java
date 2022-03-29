import java.util.Scanner;

public class Lec4Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String in;
		Scanner input = new Scanner(System.in);
		//System.out.println("문자열을 입력하세오 > ");
		//in=input.nextLine();
		
		
		String w="www";
		
		
		while(true) {
			System.out.println("문자열을 입력하세오 > ");
			in=input.nextLine();
			boolean out=w.equals(in);
				if(false=="quit".equals(in)) {
					
												
						if(out==false) {
							System.out.println(in+"은 "+w+"로 시작하지 않습니다.");
							continue;
						}
						if(out==true) {
							System.out.println(in+"은 "+w+"로 시작합니다.");
							continue;
							
						}
		   }
				if(true=="quit".equals(in))	{
					
					System.out.println("프로그램 종료");
					break;
				}
				
		
	}
		
		
		
}	
		
}

