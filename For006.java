import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class For006
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		n = Integer.parseInt(br.readLine());

		// n : 5

		// i : 5 4 3 2 1
		for (int i=n; i>=1; i--)
			System.out.println(i);
	}
}
