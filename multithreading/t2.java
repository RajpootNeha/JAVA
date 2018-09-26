//Extending Thread Class
class t2 extends Thread
{
	public void run()
	
	{
	System.out.println("Thread t2");
	
	}
	
	public static void main(String args[])
	{
		t2 obj1=new t2();
		obj1.start();
	}
}
