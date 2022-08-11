package uni.fmi;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) 
	{
		Monster m1 = new Monster("Стоян", 5, 9, 1, 20);
		Monster m2 = new Monster("Тошко", 5, 12, 1.7, 60);
		Monster m3 = new Monster("M3", 5, 12, 1.7, 60);
		Monster m4 = new Monster("M4", 55, 12, 1.7, 60);
		Boss boss = new Boss(1000, 8, 1.7, 50);
		
		ArrayList<Monster> targets = new ArrayList<Monster>();
		targets.add(m3);
		targets.add(m2);
		targets.add(m1);
		targets.add(m4);
		
		m1.target = boss;
		m2.target = boss;
		m3.target = boss;
		m4.target = boss;
		boss.targets = targets;
		
		m1.start();
		m2.start();
		m3.start();
		boss.start();

	}

}
