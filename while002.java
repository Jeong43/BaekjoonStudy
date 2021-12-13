//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class while002
{
	public static void main(String[] args) throws IOException
	{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int a, b;

		while (sc.hasNext())
		{
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a+b);
		}
	}
}