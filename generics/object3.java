import java.util.*;

class Gen<T>
{
	T ob;
	Gen(T ob)
	{
	this.ob=ob;
	}
	
	public void show()
	{
		System.out.println("The type of obj :"+ob.getClass().getName());
	}
	
	
	public T getob()
	{
	return ob;
	}
}
class object3
{
	public static void main(String args[])
	{
	Gen <String> g1=new Gen<String>("maahi");
		g1.show();//the type of obj:Java.long.String
		System.out.println(g1.getob());//maahi
	}
}
