//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class while001
{
	public static void main(String[] args) throws IOException
	{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int a, b;

		do
		{
			a = sc.nextInt();
			b = sc.nextInt();
			
			if (!(a==0 && b==0))
				System.out.println(a+b);
		}
		while (!(a==0 && b==0));		
	}
}