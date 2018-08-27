import java.util.*;
class queue
{
public int arr[],arr1[];
	public int top,size,len,top1;
	public queue(int n)
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

	

public void push(int i,int n)
	{
   if (top1 >= (n-1))
    {
        System.out.println("Stack Overflow");
    }
    else
    {
        arr1[++top1] = i;
    }
    //return top1;

	}
	
	
	
public int pop()
{
    if (top1 ==-1)
    {
        System.out.println("Stack Underflow");
        return 0;
    }
    else
    {
        int x = arr1[top1--];
        return x;
    }
}

}
