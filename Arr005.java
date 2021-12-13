//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Arr005
{
	public static void main(String[] args) throws IOException
	{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		// 변수 선언
		int n;				// 과목 수
		double m=0;			// 최대 점수
		double sum=0, avg;	// 합계, 평균

		// 과목 수 입력 받기
		n = sc.nextInt();

		// 배열 생성 및 입력
		double[] arr = new double[n];

		for (int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextDouble();
			if (arr[i]>m) // 최대 점수 입력
				m = arr[i];
		}

		// 점수 조작
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = (double)arr[i]/m*100;
			sum += arr[i];
		}

		// 평균 계산
		avg = sum / n;

		// 출력
		System.out.println(avg);
	}
}