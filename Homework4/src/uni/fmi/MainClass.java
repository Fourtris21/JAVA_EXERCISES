package uni.fmi;

public class MainClass 
{

	public static void main(String[] args) 
	{
		Student s1 = new Student("Velizar", 17, "94374803", "SE");
		Staff st1 = new Staff("Stoqn", 40, 234, "01-09-2003", "sekretar");
		Faculty fac1 = new Faculty("Ralica", 38, 22, "08-05-2004", "docent");
		
		System.out.println(s1.toString());
		System.out.println(st1.toString());
		System.out.println(fac1.toString());
		
	}

}
