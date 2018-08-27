import java.util.*;
class Stack
{
	public int arr[];
	public int top,size,len;
	public Stack(int n)
	{
		size=n;
		len=0;
		arr=new int[size];
		top=-1;
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




public void print()
{
	for(int i=0;i<top;i++)
	{
System.out.println(arr[i]);
	}
}
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n,num,i;
	n=sc.nextInt();
	Stack s=new Stack(n);
	for(i=0;i<n;i++)
	{
	num=sc.nextInt();
	s.push(num,n);
	}
	System.out.println("***********************");
	
	System.out.println(s.pop());
	System.out.println("************************");
	s.print();
	
	}
}

/*



#include<iostream>
using namespace std;
 
#define MAX 1000
 
class Stack
{
    int top;
    int top1;
public:
    int a[MAX]; 
 
    Stack() 
     { top = -1; }
    int push(int x);
    int pop();
    int peek();
    int print();

};
 
int Stack::push(int x)
{
    if (top >= (MAX-1))
    {
        cout << "Stack Overflow";
       // return false;
    }
    else
    {
        a[++top] = x;
       // return true;
    }
    return top;
}
 
int Stack::pop()
{
    if (top ==-1)
    {
        cout << "Stack Underflow";
        return 0;
    }
    else
    {
        int x = a[top--];
        return x;
    }
}

int Stack::peek()
{
cout<<a[top];
}
int Stack::print()
{
	for(int i=0;i<top;i++)
	{
	cout<<a[i]<<endl;
	}
}
 

int main()
{
     Stack s;
     int n,num,i;
     cin>>n;
     for(i=0;i<n;i++)
     {
     cin>>num;
     s.push(num);
 	}
 	cout<<"Elements in the stack are :"<<endl;
 	s.print();
 
    cout<<endl << s.pop() << " Popped from stack\n";
	cout<<"Last element of stack is  ";
 	s.peek();
 	cout<<"\nAfter deleting last 2 element of stack "<<endl;
 	s.print();
    return 0;
}
*/
