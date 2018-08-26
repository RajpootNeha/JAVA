import java.util.*;
import java.io.BufferedReader;
 import java.io.IOException;
  import java.io.InputStreamReader;
public class Contact
{
	public String name;
	public String email;
	public String phoneNumber;
}
 class ContactsManager
{
	Contact []myFriends;
	int FriendCount;
	ContactsManager()
	{
	this.FriendCount=0;
	this.myFriends=new Contact[500];
	}
	void addContact(Contact contact)
	{
		myFriends[FriendCount]=contact;
		FriendCount++;
	}
	public Contact searchContact(String searchName)
	{
		int i;
		for(i=0;i<FriendCount;i++)
		{
			if(myFriends[i].name.equals(searchName))
			{
				return myFriends[i];
			}
		}
		return null;
	}
	
	
	
	
}
class test
{
  public static void main(String [] args){
   ContactsManager myContactsManager = new ContactsManager();
   Contact friendJames = new Contact();
   friendJames.name = "Shweta";
   friendJames.phoneNumber = "0012223333";
   myContactsManager.addContact(friendJames);
   Contact friendCezanne = new Contact();
   friendCezanne.name = "Cezanne";
   friendCezanne.phoneNumber = "987654321";
   myContactsManager.addContact(friendCezanne);
   Contact friendJessica = new Contact();
   friendJessica.name = "Jessica";
   friendJessica.phoneNumber = "5554440001";
   myContactsManager.addContact(friendJessica);
   Contact result = myContactsManager.searchContact("Jessica");
   System.out.println(result.phoneNumber);

}
}
