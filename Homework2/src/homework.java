import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("\n"
				+ "1. Намиране на перфектни числа\n"
				+ "2. Намиране на сума и средна стойност на интервал от числа\n"
				+ "0. Изход\n");
		
		do
		{
			System.out.print("Въведи число(0, 1 или 2): ");
			n = input.nextInt();
		}while(n != 1 && n != 2 && n != 0);
		double i, j;
		double a, b;
		int sum = 0;
		switch(n)
		{
			case 1:
				System.out.print("Въведете интервал, в който желаете да проверите за перфектни числа: ");
				
				
				a = input.nextDouble();
				b = input.nextDouble();
				
				for(i = a; i <= b; i++)
				{
					for(j = 1; j <= i/2; j++)
					{
						if(i % j == 0)
						{
							sum += j;
						}
					}
					if(sum == i)
					{
						System.out.print((int)i + " ");
						
					}
					sum = 0;
				}
				break;
			case 2:
				int counter = 0;
				System.out.print("Въведете интервал: ");
				a = input.nextDouble();
				b = input.nextDouble();
				
				double middle = (((b-a)+1)/2)+1;
				
				double num = 0;
				for(i = a; i <= b; i++)
				{
					sum += i;
					counter ++;
					if(middle % 2 == 0)
					{
						if(counter == middle)
						{
							num = (i + (i+1))/2;
							System.out.println("Средния елемент е(според статистиката): " + num);

						}
					}
					else
					{
						if(counter == (int)middle)
						{
							num = i;
							System.out.format("Средния елемент е(според статистиката): %d\n", (int)num);

						}
					}
					
				}
				System.out.println("Сумата е: " + sum);
				System.out.println("Средноариметрично: " + (sum /(b-a +1)));
				break;
			default:
				System.exit(0);
				
		
		}

	}

}
