
//n*n

#include<iostream>
using namespace std;
int main()
{
	int a[100];
	int n,i,j,max=0,small=999,c=0;
	cin>>n;
	for(i=0;i<n;i++)
	{
	cin>>a[i];
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
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
	}
	cout<<"small : "<<small<<endl;
	cout<<"Max : "<<max<<endl;
	cout<<"Diff : "<<max-small<<endl;
}

