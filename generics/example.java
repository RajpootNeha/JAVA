class example
{

	public <E> void printArray(E []s)
	{
		for(E x:s)
		{
		System.out.println(x);
		}
	}
	public static void main(String args[])
	{
		example e1=new example();
		String countries[]=new String[]{"India","Pakistan","Nepal"};
		Integer numbers[]=new Integer[]{12,24,36,48};
		e1.printArray(countries);
		e1.printArray(numbers);
	}
}
