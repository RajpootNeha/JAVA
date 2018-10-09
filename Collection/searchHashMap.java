import java.util.*;

class Student 
{
//implements Comparable<Student2>{
	int age;
	String name;
	int marks;
	public Student(String n,int m,int a)
	{
		name=n;
		marks=m;
		age=a;
	}
	public String toString()
	{
		return (name+" "+marks+" "+age);
	}
}


class searchHashMap
{
	public static void main(String args[])
	{
		HashMap<Integer,Student> hm=new HashMap<Integer,Student>();
		Student ob1=new Student("Neha",78,20);
		Student ob2=new Student("Tanya",80,20);
		hm.put(1,ob1);
		hm.put(2,ob2);
		System.out.println("Enter key to search");
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		if(hm.containsKey(key))
		{
		System.out.println(hm.get(key));
		}
	}
}
