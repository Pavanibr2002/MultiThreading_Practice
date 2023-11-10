package multithreading;

public class mythread1 {
	public static void main(String args[])
	{
		Thread t=new Thread("My first thread");
		t.start(); //start method moves the thread to the active state
		String str=t.getName(); //getting the thread name by invoking the getName() method
		System.out.println(str);
	}

}
