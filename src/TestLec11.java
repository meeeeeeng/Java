import java.io.IOException;

public class TestLec11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
			try{System.out.println(readString());
			}
			catch(IOException e){
				System.out.println("���� �߻�");
				}
	}
	public static String readString() throws IOException {
		
		byte[] buf=new byte[100];
		System.out.println("���ڿ��� �Է��Ͻÿ�: ");
		throw IOException; 
		//System.in.read(buf);
		return new String(buf);
		
		
	}

}
