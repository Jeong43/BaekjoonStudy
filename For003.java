import java.util.Scanner;
import java.io.IOException;

public class For003
{
	public static void main(String[] arg) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int a;
		int sum=0;
		
		a = sc.nextInt();

		for (int i=0; i<=a; i++)
		{
			sum += i;
		}

		System.out.println(sum);
	}
}