import java.util.*;
class SumCli
{
	public static void main(String args[])
	{
	int sum=0;
	if(args.length>0)
	{
	System.out.println("The Command line arguements are : ");
	//int num=Integer.parseInt(args);
	for(String val:args)
	{
		int num=Integer.parseInt(val);
	sum=sum+num;
	System.out.println(val);
	}
		System.out.println("Sum = "+sum);
	}
	else
	{
	System.out.println("No Command line arguement :");
	}
	}
}
//zscalar
