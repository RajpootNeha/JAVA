class GeneriClass<T>
{
	T i;
	public void add(T i)
	{
		this.i=i;
	}
	public T get()
	{
	return i;
	}
}

class example
{
	public static void main(String args[])
	{
		GeneriClass<Integer> m1=new GeneriClass<Integer>();
		GeneriClass<String> m2=new GeneriClass<String>();
		
		Integer k=new Integer(5);
		m1.add(k);
		m2.add("Neha");
		System.out.println("m1 = "+m1.get()+"\nm2 = "+m2.get());
	}
}
