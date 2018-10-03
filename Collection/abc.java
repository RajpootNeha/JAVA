import java.util.*;
class abc
{
	public static void main(String args[])
	{
	ArrayList<String> ob=new ArrayList<String>();
	//List<String> ob=new ArrayList<String>();
		//ArrayList<Integer> ob=new ArrayList<Integer>();
		ob.add("Neha");
		ob.add("Navjot");
		ob.add(1,"Tanya");
		//System.out.println(ob);
		//for(Integer k :ob)
		//System.out.println(k);
				ob.add("Neelesh");
				//ob.remove(2); //removed navjot (index no )
				ob.remove("Tanya");
		Iterator it=ob.iterator();
		while(it.hasNext())
		{
			String k=(String)it.next();
			System.out.println(k);
		}
		

	
	}
}
