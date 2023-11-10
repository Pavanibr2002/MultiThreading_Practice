package multithreading;

public class mythread2 implements Runnable {
	public void run()
	{
		System.out.println("Now the thread is running");
	}
	public static void main(String args[])
	{
		Runnable r1=new mythread2();
		Thread th1=new Thread(r1,"My new Thread");
		th1.start();
		String str=th1.getName();
		System.out.println(str);
	}

}
