import java.util.*;
class link
{
	public static void main(String args[])
	{
	LinkedList<String> ob=new LinkedList<String>();
	//ob.add("Navjot");
	ob.add("Neha");
		ob.add("navjot");
	//ob.addFirst("Tanya");
	//ob.addLast("Navjot");
	//ob.addLast("Navjot");
	//ob.addLast("Navjot");
	ob.add("tanya");
	ob.add("navjot");
	ob.add("navjot");
	System.out.println(ob);
	
	
	//IndexOf()
	System.out.println(ob.indexOf("Neha"));
	System.out.println(ob.lastIndexOf("Tanya"));
	
	//remove()
	//ob.remove("navjot");
	ob.removeFirstOccurrence("Navjot");
	//ob.removeLastOccurrence("Neha");
	//ob.remove(2);
	//ob.removeFirst();
	//ob.removeLast();
	System.out.println(ob);
	
	
	//get()
	System.out.println(ob.getFirst());
	System.out.println(ob.getLast());
	}
}
