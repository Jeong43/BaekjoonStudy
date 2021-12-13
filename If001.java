//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class If001
{
	public static void main(String[] args) throws IOException
	{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		a = sc.nextInt();
		b = sc.nextInt();

		if(a>b)
			System.out.print(">");
		else if(a<b)
			System.out.print("<");
		else
			System.out.print("==");		
	}
}