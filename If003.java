import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class If003 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(br.readLine());
		int res;

		if(year%4==0 && year%100!=0 || year%400==0)
			res = 1;
		else res = 0;

		System.out.print(res);
	}
}
