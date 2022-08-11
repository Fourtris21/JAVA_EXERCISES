package uni.fmi;

public class Student extends Person
{
	
	private String fakNumber;
	private String specialnost;
	
	public Student(String name, int age, String fakNumber, String specialnost)
	{
		super (name, age);
		this.fakNumber = fakNumber;
		this.specialnost = specialnost;
	}

	@Override
	public String toString() {
		return super.toString() + " fakNumber: " + fakNumber + ", specialnost: " + specialnost;
	}
	
}
