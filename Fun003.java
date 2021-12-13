import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;

public class Fun003
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;			//-- 작거나 같은 값을 입력 받을 변수
		int result = 0;	//-- 한수의 개수 누적합
		
		n = Integer.parseInt(br.readLine());


		// 증가하는 한수
		for (int i=1; i<10; i++)		// 시작하는 수
		{
			int sum = i;	//-- 이번에 만들 수
			
			for (int y=1; y<10; y++)	// 등차수열에서 증가하는 수
			{	
				for (int z=1; (i+y*z)<10; z++)
				{
					sum = sum*10 + (y*z);

					System.out.println("sum: " + sum);

					if (sum <= n)
						result++;
					else
						break;
				}
			}	
		}




/*		// 감소하는 한수
		for (int i=1; i<10; i++)
		{
			int sum = i;	//-- 이번에 만들 수

			for (int y=1; (i+y)<10; y++)
			{				
				sum += (i+y) * (int)Math.pow(10, y);

				if (sum <= n)
					result++;
				else 
					break;
			}				
		}
*/
		System.out.println(result);
	}
}
