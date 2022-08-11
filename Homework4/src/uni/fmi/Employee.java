package uni.fmi;

public abstract class Employee extends Person
{
	private int id;
	private String date;
	
	public Employee(String name, int age, int id,  String date)
	{
		super(name, age);
		this.id = id;
		this.date = date;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", id: " + id + ", date: " + date;
	}
	
}
