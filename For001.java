import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class For001
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;

		n = Integer.parseInt(br.readLine());

		for (int i=1; i<=9; i++)
		{
			System.out.printf("%d * %d = %d\n", n, i, n*i);
		}
	}
}