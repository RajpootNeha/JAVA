import java.util.*;
import java.io.BufferedReader;
 import java.io.IOException;
   import java.io.InputStreamReader;
class Address
{
	private String street;
	private String city;
	private int pincode;
	private String country;
	Address(String street,String city,int pincode,String country)
	{
	this.street=street;
	this.city=city;
	this.pincode=pincode;
	this.country=country;
	}
	public void displayAddress()
	{
	/*cout<<"street : "<<street<<endl<<"city : "<<city<<endl<<"pincode : "<<pincode<<endl<<"country : "<<country<<endl;*/
	
	System.out.println("street : "+street+"\ncity : "+city+"\npincode : "+pincode+"\ncountry : "+country);
	}
}
class Customer
{
	public String customerName;
	public String customerEmail;
	public String customerType;
	public Address customerAddress;
	//Address ad=new Address();
	Customer(String customerName,String customerEmail,String customerType,Address address)
	{
	this.customerName=customerName;
	this.customerEmail=customerEmail;
	this.customerType=customerType;
	customerAddress=address;;
	}
	public void displayDetails()
	{
	/*cout<<endl<<"Name : "<<customerName<<endl<<"E-mail : "<<customerEmail<<endl<<"Type : "<<customerType<<endl;*/
	System.out.println("Name : "+customerName+"\nE-mail : "+customerEmail+"\nType : "+customerType);
	customerAddress.displayAddress();
	}
}
class testCustomer
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name,Email,type,street,city,country;
		Address address;
		int pincode;
		System.out.println("Enter the Customer Details : ");
		System.out.println("Enter the name : ");
		name=br.readLine();
		System.out.println("Enter the email : ");
		Email=br.readLine();
		System.out.println("Enter the type : ");
		type=br.readLine();
		System.out.println("Enter the Customer Address :");
		System.out.println("Enter the street ");
		street=br.readLine();
		System.out.println("Enter the city ");
		city=br.readLine();
		System.out.println("Enter the pincode ");
		pincode=Integer.parseInt(br.readLine());
		System.out.println("Enter the country ");
		country=br.readLine();
		Address ad=new Address(street,city,pincode,country);
		Customer c=new Customer(name,Email,type,ad);
		c.displayDetails();
		
		
	}
}





