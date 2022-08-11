package uni.fmi;

import java.util.Random;

public class Monster extends Thread
{
	String name;
	int hp;
	int dmg;
	double attackSpeed;
	int criticalChange;
    Boss target;	
	
	Random random = new Random();
	
	public Monster(String name, int hp, int dmg, double attackSpeed, int criticalChange) 
	{
		super();
		this.name = name;
		this.hp = hp;
		this.dmg = dmg;
		this.attackSpeed = attackSpeed;
		this.criticalChange = criticalChange;
	}

	@Override
	public void run() 
	{
		while( hp > 0 && target.hp > 0) 
		{
			
			if(random.nextInt(101) < criticalChange) {
				target.hp -= dmg * 2;
				
				System.out.println(name + " made critical to the Boss and left him with " 
						+ target.hp + " hp.");
			}
			else
			{
				target.hp -= dmg;
				System.out.println(name + " hit the boss and left him with " 
						+ target.hp + " hp.");
			}
			
			try 
			{
				sleep((long) (1000 / attackSpeed));				
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		
		if(hp < 0) 
		{
			System.out.println(name + ": CHEATEEEEEEER!!!!!!!!!!!");
			
			System.err.println("The Boss is the winner!");
		}
		else 
		{
			System.out.println(name + ": LOSEEEER!!!!");
		}
	}
}
