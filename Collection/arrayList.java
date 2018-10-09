import java.util.ArrayList;
import java.util.*;
class Student2 implements Comparable<Student2>{
	int age;
	String name;
	int marks;
	public Student2(String n,int m,int a)
	{
		name=n;
		marks=m;
		age=a;
	}
	public String toString()
	{
		return (name+" "+marks+" "+age);
	}
	public int compareTo(Student2 s)
	{
		System.out.println("values are "+age+" "+s.age);
		if(age == s.age)
		{
			return 0;
		}
		else if(age > s.age)
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
	}
}
/*class Sortbyroll implements Comparator<Student2> 
{ 
    public int compare(Student2 a, Student2 b) 
    { 
        return a.age - b.age; 
    } 
} */
 class arrayList_demo {

	public static void main(String[] args)
{
		ArrayList<Student2> ts=new ArrayList<Student2>();
		Student2 ob1=new Student2("rahul",78,15);
		Student2 ob2=new Student2("raj",85,16);
		Student2 ob3=new Student2("lagan",87,17);
		ts.add(ob1);
		ts.add(ob2);
		ts.add(ob3);
		Collections.sort(ts);//, new Sortbyroll());
		for (int i=0; i<ts.size(); i++) 
            System.out.println(ts.get(i));
	}

}
