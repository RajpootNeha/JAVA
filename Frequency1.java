import java.util.*;
class Frequency1
{
	public static void main(String args[])
	{
	String str="aaabbccc",ans="";
	char ch;//=str.toCharArray();
	int n=str.length(),a,i,count;
	for(i=0;i<n;i++)
	{
	a=str.lastIndexOf(str.charAt(i));
	count=a-i+1;
	ch=str.charAt(i);
	ans+=ch+String.valueOf(count);
	i=a;
	}
	System.out.println(ans);
	}
}
