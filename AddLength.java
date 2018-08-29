import java.util.*;
import java.io.BufferedReader;
 import java.io.IOException;
  import java.io.InputStreamReader;
class AddLength
{
	public static void main(String args[])  throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String name;
	name=br.readLine();
	//System.out.println(name);
	int i=0;
	int length[];
	String[] words=name.split("\\s");
	for(String w:words)
	{
	//System.out.println(w);
	i++;
	}
		//System.out.println(i);
		int s=0;
		for(int j=0;j<i;j++)
		{s=s+words[j].length();
		
		}
		//System.out.println(sum);
		int sum=0;
	   int num = s;

    while (num != 0)
    {
        sum = sum + num % 10;
        num = num / 10;

    }




		System.out.println(sum);
		
	
	}
}
