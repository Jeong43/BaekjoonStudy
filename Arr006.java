import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//import java.util.Scanner;

public class Arr006
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);

		// 몇 문제인지 입력 받기
		int n = Integer.parseInt(br.readLine());

		// 답안과 점수를 담을 배열 선언
		String[] answer = new String[n];
		int[] score = new int[n];

		// 답안 및 점수 입력
		for (int i=0; i<n; i++)
		{
			// 답안 입력
			answer[i] = br.readLine();

			// 점수 입력
			score[i] = 0;
			int cnt = 0; // 입력될 점수
			
			for (int j=0; j<answer[i].length(); j++)
			{
				if (answer[i].charAt(j) == 'O')
					score[i] += ++cnt;
				else 
					cnt = 0;
			}				
		}

		// 점수 출력
		for (int i=0; i<n; i++)
			System.out.println(score[i]);
	}
}