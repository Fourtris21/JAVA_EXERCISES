package uni.fmi;

public class Staff extends Employee
{
	private String position;
	public Staff(String name, int age, int id, String date, String position)
	{
		super(name, age, id, date);
		this.position = position;
	}
	@Override
	public String toString() {
		return super.toString() + ", position: " + position;
	}
}
