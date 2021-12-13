import java.util.Scanner;
import java.io.IOException;

public class For008
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int n;
		int a, b;
		
		n = sc.nextInt();

		for (int i=1; i<=n; i++)
		{			
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.printf("Case #%d: %d + %d = %d\n", i, a, b, a+b);
		}
	}
}
