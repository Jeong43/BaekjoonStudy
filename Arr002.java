import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//import java.util.Scanner;

public class Arr002
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		int max, maxIndex;

		// ���
		for (int i=0; i<9; i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
		}

		// ��
		max = arr[0];
		maxIndex = 0;
		
		for (int i=1; i<arr.length; i++)
		{
			if (max<arr[i])
			{
				max = arr[i];
				maxIndex = i;
			}
		}

		// ���
		System.out.println(max);
		System.out.println(maxIndex+1);
	}
}