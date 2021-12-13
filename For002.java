import java.util.Scanner;
import java.io.IOException;

public class For002
{
	public static void main(String[] arg) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int a, b;
		int n;
		
		n = sc.nextInt();

		for (int i=0; i<n; i++)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a + b);
		}

/*		for (int i=0; i<5; i++)
		{
			System.out.print(a[i] + b[i]);
		}
*/
	}
}
