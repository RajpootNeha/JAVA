import java.util.*;
class hashMap
{
	public static void main(String args[])
	{
		HashMap<Integer,String>ob=new HashMap<Integer,String>();
		ob.put(1,"AB");
		ob.put(2,null);
		ob.put(3,"CD");
		//display output using object
		//System.out.println(ob);
		
		//display output using for loop
		
		/*for(Map.Entry m:ob.entrySet()){
			System.out.println(m.getKey());
			System.out.println(m.getValue());}*/
			
			//remove method
			
			if(ob.containsKey(4))
			{
				System.out.println("Yes");
			}
			
			ob.remove(2);
						//iterator method
			Set s=ob.entrySet();
			Iterator it=s.iterator();
			while(it.hasNext())
			{
				Map.Entry m=(Map.Entry)(it.next());
				System.out.print(m.getKey()+" ");
				System.out.print(" "+m.getValue());
			}
	}
}
