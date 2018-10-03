import java.util.*;
class xyz
{
	public static void main(String args[])
	{
	ArrayList<Integer> ob=new ArrayList<Integer>();

		ob.add(150);
		ob.add(100);
		ob.add(180);
		
		ob.add(40);
		//set and get
		ob.set(2,55);
		System.out.println(ob.get(2));
	//	ob.remove(2);
	//indexOf
	int i=ob.indexOf(40);
	System.out.println("Index of 40 : "+i);
	//contains
	if(ob.contains(10))
	{
		System.out.println("present");
	}
	//size
	System.out.println("Size : "+ob.size());
	//sort
	Collections.sort(ob);
	//reverse
		Collections.sort(ob,Collections.reverseOrder());
		Iterator it=ob.iterator();
		while(it.hasNext())
		{
			Integer k=(Integer)it.next();
			System.out.println(k);
		}
		

	
	}
}
