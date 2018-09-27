import java.util.*;
class codeConvert
{
	public static boolean isVowel(char ch)
	{
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		
			return true;
		else
			return false;
		
		
	}
	
	public static String rotate(String str,int pos)
	{
		int l=str.length();
					String result=(str.substring(pos,l)+str.substring(0,pos)+"ay");
					return result;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str1;
		str1=sc.nextLine();int pos;
		int flag;
				//String[] str1 = str.split(""); 
				String[] str=str1.split(" ");
		for(int j=0;j<str.length;j++)
		{
			flag=0;
			if(isVowel(str[j].charAt(0)))
			{
			str[j]+="way";
			System.out.print(str[j]+" ");
			flag=1;
			}
			else
			{
				flag=0;
				for(int i=0;i<str[j].length();i++)
				{
					if(isVowel(str[j].charAt(i)))
					{
						pos=i;
						System.out.print(rotate(str[j],pos)+" ");
						flag=1;
						break;
					}
					
					//break;
					
				}
			}
			if(flag==0)
			{
			System.out.print(str[j]+"ay");
			}
		}
				

		
		
	}
}
