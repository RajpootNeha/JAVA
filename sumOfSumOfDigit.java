import java.util.*;
import java.io.BufferedReader;
 import java.io.IOException;
  import java.io.InputStreamReader;
class sumOfSumOfDigit
{
	public static void main(String args[])  throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int number;

		number=Integer.parseInt(br.readLine());
		
		   int num = number;
		   int sum=0,t;
		   int count=0;
		   int arr[]=new int[100];
    while (num != 0)
    {
    	t=num%10;
    	arr[count]=sum+t;
        sum = sum + t;
        num = num / 10;
        count++;

    }
  //  System.out.println(count);
  int s=0;
		for(int i=0;i<count;i++)
		{
		//System.out.println(arr[i]);
		s=s+arr[i];
		}
		   System.out.println(s);
		
	}
}
