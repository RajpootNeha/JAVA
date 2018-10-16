import java.util.*;
class priorityQue
{
	public static void main(String argc[])
	{
		PriorityQueue<Integer>queue=new PriorityQueue<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(5);
		queue.add(6);

		Iterator itr=queue.iterator();
	System.out.println("iterating the queue elements:");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//remove element
		queue.remove();
		
		
		System.out.println("After removing 1 elements:");
		Iterator itr1=queue.iterator();

		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}

	}
}
