import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class For010
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;		
		n = Integer.parseInt(br.readLine());

		for (int i=0; i<n; i++)				//줄		1	2	3	4	5
		{									
			for (int j=n; j>i; j--)			
			{								//공백		4	3	2	1	0
				System.out.print(" ");
			}
			for (int j=0; j<=i; j++)		//별		1	2	3	4	5
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}