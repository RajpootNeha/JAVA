import java.util.*;
import java.io.BufferedReader;
 import java.io.IOException;
  import java.io.InputStreamReader;
class FiboWithRecur
{
	static int[] arr;
	static int val;
public static void array1(int a)
	{
	arr=new int[a+1];
	//Fibo(a);
		System.out.println(Fibo(a));
		
	}
	 public static int Fibo(int n)
	{
	if(n<2)
	return n;
	else if(arr[n]!=0)
	return arr[n];
	else
		val= Fibo(n-1)+Fibo(n-2);
		arr[n]=val;
	return val;

	
	}
	
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i;
	int a=Integer.parseInt(br.readLine());
	FiboWithRecu f=new FiboWithRecu();
	array1(a);

	//System.out.println(Fibo(a));
	

	
	}
}
