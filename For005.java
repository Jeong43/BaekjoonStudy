import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class For005
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;

		n = Integer.parseInt(br.readLine());

		for (int i=1; i<=n; i++)
		{
			System.out.println(i);
		}
	}
}