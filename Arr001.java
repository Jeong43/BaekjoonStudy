//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Arr001
{
	public static void main(String[] args) throws IOException
	{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		int min, max;

		// 담기
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}

		// 비교
		min = max = arr[0];
		
		for (int i=0; i<arr.length; i++)
		{
			if (min>arr[i])
				min = arr[i];
			if (max<arr[i])
				max = arr[i];
		}

		// 출력
		System.out.print(min + " " + max + "\n");
	}
}