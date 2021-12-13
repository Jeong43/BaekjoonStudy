//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class For011
{
	public static void main(String[] args) throws IOException
	{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int n, x;		
		n = sc.nextInt();
		x = sc.nextInt();

		int[] a = new int[n];

		for (int i=0; i<n; i++)
		{									
			a[i] = sc.nextInt();
		}

		for (int i=0; i<n; i++)
		{
			if(a[i]<x)
				System.out.print(a[i] + " ");
		}
	}
}