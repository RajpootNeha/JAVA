import java.util.*;
import java.io.*;
class stack
{

	
	public static void main(String args[])
	{
	Stack<Float> s=new Stack<Float>();
	s.push(2.11f);
	s.push(4.21f);
	s.push(4.11f);
	s.push(1.11f);
	s.push(4.31f);
	float max=s.peek();
	float min=s.peek();
	//Iterator it=
	while(!s.empty())
	{
		if(s.peek() > max)
		{
			max=s.peek();
		}
		if(s.peek() < min)
		
		{
			min=s.peek();
		}
		s.pop();
	}
			//s.pop();
			
			System.out.println("Min : "+min);
			System.out.println("Max : "+max);
	}
}
