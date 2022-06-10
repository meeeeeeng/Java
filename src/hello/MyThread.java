package hello;

class MyThread implements Runnable{
	public void run(){
		for(int i = 10;i>=0;i--)
			System.out.print(i+"");
					
	}}

class MyTest{
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new MyThread());
		t.start();

	}

}
