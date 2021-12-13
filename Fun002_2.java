public class Fun002_2
{
	public static void main(String[] args) 
	{
		boolean[] check = new boolean[10000+1];	// 1~10000

		for (int i=1; i<10001; i++)
		{
			int n = d(i);

			if (n <= 10000)
				check[n] = true;
		}

		for (int i=1; i<10001; i++)
		{
			if (!check[i])
				System.out.println(i);
		}
	}


	static int d(int number)
	{
		int sum = number;

		while(number != 0)
		{
			sum = sum + (number % 10);
			number = number/10;
		}

		return sum;
	}
}

