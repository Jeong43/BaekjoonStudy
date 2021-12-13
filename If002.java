import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class If002 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a;
		char grade;

		a = Integer.parseInt(br.readLine());

		if(a>=90)
			grade = 'A';
		else if(a>=80)
			grade = 'B';
		else if(a>=70)
			grade = 'C';
		else if(a>=60)
			grade = 'D';
		else
			grade = 'F';

		System.out.print(grade);
	}
}