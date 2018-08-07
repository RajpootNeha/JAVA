
    import java.io.*;  
    public class Buffer1{    
    public static void main(String args[])throws Exception{             
   
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));           
         String name="";    
         while(!name.equals("stop")){    
          System.out.println("Enter data: ");    
          name=br.readLine();    
          System.out.println("data is: "+name);    
         }              
         
        }    
        }  
