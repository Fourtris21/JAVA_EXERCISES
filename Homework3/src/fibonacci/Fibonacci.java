package fibonacci;

import java.util.Scanner;

public class Fibonacci 
{
	public static int[] Fib1(int n)
	{
		int[] result = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			if(i == 0 || i == 1)
			{
				result[i] = 1;
			}
			else
			{
				result[i] = result[i-1] + result[i-2];
			}
		}
		return result;
	}
	
	
	public static int Fib2(int n)
	{
		if(n <= 2 )
		{
			return 1;
		}
		 return Fib2(n-1) + Fib2(n-2);
	}
	
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Колко числа на Фибоначи да ви покажа? ");
		int nums = input.nextInt();
		System.out.print("Фибоначи(F)/For loop(L): ");
		char answ = input.next().charAt(0);
		
		if(answ == 'F')
		{
			for(int i = 1; i <= nums; i++ )
			{
				System.out.print(Fib2(i) + " ");
			}
		}
		else if(answ == 'L')
		{
			int[] fibonacci = Fib1(nums);
			for(int i = 0; i < fibonacci.length; i++)
			{
				System.out.print(fibonacci[i] + " ");
			}
		}
	}
}
