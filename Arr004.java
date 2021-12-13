import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//import java.util.Scanner;

public class Arr004
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);

		// 배열 생성
		int[] arr = new int[42];

		// 배열 입력
		for (int i=0; i<10; i++)
		{
			int temp = Integer.parseInt(br.readLine())%42; // 입력받은 수를 42로 나눈 나머지
			arr[temp]++;		// 해당 나머지가 나온 횟수를 카운팅
		}
		
		// 나머지 갯수 세기
		int cnt=0;
		for (int i=0; i<42; i++)
		{
			if (arr[i]!=0)
				cnt++;
		}

		// 각기 다른 나머지의 갯수 출력
		System.out.println(cnt);		
	}
}