class Dn
{
	boolean[] arr = new boolean[10000+1];		// 초기화 값: false	


	void d(int n)
	{
		int num = n + n/1000 + n/100 + n/10 + n%10;
		if (num > 10000)
			return;

		if (arr[num] == true)
			return;
		else 
		{
			arr[num] = true;
			d(num);
		}
	}

	void check()
	{
		for (int i=1; i<10000; i++)
		{	
			System.out.println("i : " + i);
			d(i);
		}
	}

	void print()
	{
		for (int i=1; i<10000; i++)
		{
			if (arr[i] == false)
				System.out.println(i);
		}
	}
}

public class Fun002
{
	public static void main(String[] args) 
	{
		Dn ob = new Dn();
		ob.check();
		ob.print();
	}
}