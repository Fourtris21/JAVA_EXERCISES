package uni.fmi;

import java.util.ArrayList;
import java.util.Random;

public class Boss extends Thread
{
	int hp;
	int attack;
	double attackSpeed;
	int massDamageChance;
	ArrayList<Monster> targets = new ArrayList<Monster>();
	
	Random random = new Random();
	
	public Boss(int hp, int attack, double attackSpeed, int massDamageChance)
	{
		super();
		this.hp = hp;
		this.attack = attack;
		this.attackSpeed = attackSpeed;
		this.massDamageChance = massDamageChance;
	}

	@Override
	public void run() 
	{
		while(hp > 0)
		{
			int num = random.nextInt(targets.size());
			Monster tempMonster = targets.get(num);
			while(hp > 0 && tempMonster.hp > 0)
			{
				if(random.nextInt(101) < massDamageChance) 
				{
					System.out.println("The Boss made critical to all monsters");
					for(int i = 0; i < targets.size(); i++)
					{
						targets.get(i).hp -= attack;
						
						if(targets.get(i).hp <= 0)
						{
							System.out.println(targets.get(i).name+" is dead hahaha");
							targets.remove(targets.get(i));
						}
					}
				}
				else 
				{
					tempMonster.hp -= attack;
					System.out.println("The Boss hit " + tempMonster.name + " and left him with " 
							+ tempMonster.hp + " hp.");
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
				System.out.println("Boss: CHEATEEEEEEER!!!!!!!!!!!");
				System.err.println(tempMonster.name + " is the winner!");
			}
			else 
			{
				System.out.println("Boss: YOU "+tempMonster.name+" ,ARE LOSEEEER!!!!");
				targets.remove(tempMonster);
			}
		}
	}
}
