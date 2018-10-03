import java.util.*;
class mat
{
	public static void main(String args[])
	{
	char[][] a = {
      {'a','b','c','d','e'}, 
      {'f','g','h','i','j'}, 
      {'k','l','m','n','o'},
      {'p','q','r','s','t'},
      {'u','v','w','x','y'} 
		};
	//	System.out.println(a[2][2]);
	/*int m=2;
	int n=2;
	a[m][n]='z';
	a[m+1][n]='z';
	a[m-1][n]='z';
	a[m][n+1]='z';
	a[m][n-1]='z';
	*/
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			if(i==j)
			{
			a[i][j]='z';
			}
			else
			{
			a[i][j]='#';
			}
		}
		//System.out.println();
	}
	
	int m=2;
	int n=2;
	a[m][n]='z';
	a[m+1][n]='z';
	a[m-1][n]='z';
	a[m][n+1]='z';
	a[m][n-1]='z';
	
	
	
	int l=a.length;
	for(int i=0;i<a.length;i++)
	{
	a[i][l-i-1]='z';
	}
	
	
	
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			System.out.print(" "+a[i][j]);
		}
		System.out.println();
	}
		
	}
}
