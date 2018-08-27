import java.util.*;
class Stack
{
	public int arr[],arr1[];
	public int top,size,len,top1;
	public Stack(int n)
	{
		size=n;
		len=0;
		arr=new int[size];
		arr1=new int[size];
		top=-1;
		top1=-1;
	}
	public boolean isEmpty()
	{
	return top==-1;
	}
	public int push(int i,int n)
	{
   if (top >= (n-1))
    {
        System.out.println("Stack Overflow");
    }
    else
    {
        arr[++top] = i;
    }
    return top;

	}
	
public int pop()
{
    if (top ==-1)
    {
        System.out.println("Stack Underflow");
        return 0;
    }
    else
    {
        int x = arr[top--];
        return x;
    }
}



	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n,num,i;
	n=sc.nextInt();
	Stack s=new Stack(n);
		queue q=new queue(n);
	for(i=0;i<n;i++)
	{
	num=sc.nextInt();
	s.push(num,n);
	}
	System.out.println("***********************");
	
	for(i=0;i<n;i++)
	{
	int x=s.pop();
	System.out.println(x);//s.pop());
	q.push(x,n);
	}
	
	System.out.println("************************");
	//s.print();
	for(i=0;i<n;i++)
	{
	System.out.println(q.pop());
	}
	
	}
}
