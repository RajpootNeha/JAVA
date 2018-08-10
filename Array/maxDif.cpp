#include<iostream>
using namespace std;
int main() 
{ 
int n;
cin>>n;
for(i=0;i<n;i++;i++)
{
cin>>a[i];
}
 int max= -1;  
    int small = a[n-1];  
    for (int i = n-2; i >= 0; i--) 
    { 
        if (a[i] > small) 
            small = arr[i]; 
        else
        { 
            int diff = small- a[i]; 
            if (diff > max) 
            { 
                max = diff; 
            } 
        } 
    }
  cout<<max;
  return 0; 
