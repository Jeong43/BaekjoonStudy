//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Arr007
{
	public static void main(String[] args) throws IOException
	{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		int c, n;		// 케이스 수, 각 케이스마다 학생 수
		double[] arr;	// 각 케이스에서 조건에 부합하는 인원 퍼센트 담아두기

		c = sc.nextInt();
		arr = new double[c];

		for (int i=0; i<c; i++)			// 케이스 반복
		{
			int[] temp;					// 각 점수를 입력받을 배열
			int totTemp=0;				// 케이스 별로 총점
			double avgTemp;				// 케이스 별로 평균
			int cnt=0;					// 평균 이상인 사람의 수

			n = sc.nextInt();

			temp = new int[n];


			// 점수 입력
			for (int j=0; j<n; j++)				
			{	
				temp[j] = sc.nextInt();
				totTemp += temp[j];	
			}

			// 평균
			avgTemp = (double)totTemp / n;	
			

			// 평균 이상인 사람 세기
			for (int j=0; j<n; j++)				
			{
				if (temp[j]>avgTemp)
					cnt++;
			}


			// 평균 이상인 사람의 백분률
			arr[i] = (double) cnt / n * 100;	
		}


		// 출력
		for (int i=0; i<c; i++)
			System.out.printf("%.3f%%\n", arr[i]);		
	}
}