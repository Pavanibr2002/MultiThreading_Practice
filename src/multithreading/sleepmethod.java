package multithreading;

public class sleepmethod extends Thread{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(i);
			}
		}
	}
		public static void main(String args[])
		{
			sleepmethod s1=new sleepmethod();
			sleepmethod s2=new sleepmethod();
			s1.start();
			s2.start();
		}
	}


