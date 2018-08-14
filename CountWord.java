import java.util.*;
import java.io.File;
public class CountWord
{
	public static void main(String args[])throws Exception
	{
	File file=new File("abc.txt");
	Scanner s=new Scanner(file);
	int word=0;
	while(s.hasNextLine())
	{
		String line=s.nextLine();
		word+=line.split(" ").length;
	}
	System.out.println(word);
	}
}
