//n*n
import java.util.*;
class MaxDiff
{
	public static void main(String args[])throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n=br.read();
	int i,max=0,small=999,c=0,dif;
	int a[]=new int[20];
	for(i=0;i<n;i++)
	{
	a[i]=br.read();
	}
	for(i=0;i<n;i++)
	{
		
		if(small>a[i] )
		{
		small=a[i];
		c=i;
		}
		if(max<a[i] && c<i)
		{
		max=a[i];
		}
		}
		dif=max=small;
			System.out.println("Small : "+small+"\nMax : "+max+"\nDiff : "+dif);
	}

}
