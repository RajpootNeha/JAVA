import java.util.*;
import java.io.BufferedReader;
 import java.io.IOException;
  import java.io.InputStreamReader;
class Buffer
{
	public static void main(String args[])  throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int a=Integer.parseInt(br.readLine());
	int b=Integer.parseInt(br.readLine());
	int c=a+b;
	System.out.println("Addition of a and b is : "+c);
	}
}
