//Implementing Runnable Interface
class t1 implements Runnable
{
	public void run()
	{
		System.out.println("Thread t1");
	}
	public static void main(String args[])
	{
		t1 obj1=new t1();
		Thread t=new Thread(obj1);
		t.start();
	}
}
