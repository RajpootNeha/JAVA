import java.util.*;
import java.io.BufferedReader;
 import java.io.IOException;
  import java.io.InputStreamReader;

class Fibo{  
public static void main(String args[])  throws IOException
{    
 int n1=0,n2=1,n3,i; 
 
 		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int a=Integer.parseInt(br.readLine());   
 System.out.print(n1+" "+n2);  
    
 for(i=2;i<a;++i)   
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
  
}}
