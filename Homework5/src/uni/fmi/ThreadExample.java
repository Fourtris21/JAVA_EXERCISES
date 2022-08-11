package uni.fmi;

public class ThreadExample extends Thread
{
	int countNumber;
	String name;
	
	public ThreadExample(int countNumber, String name)
	{
		this.countNumber = countNumber;
		this.name = name;
	}

	@Override
	public void run() 
	{
		for(int i = 0; i < countNumber; i++) 
		{
			System.out.println(name + ":" + i);
		}
	}
}
