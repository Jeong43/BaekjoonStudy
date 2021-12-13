import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//import java.util.Scanner;

public class Arr003
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		int a, b, c, t;
		

		// 숫자를 받아 넣고 곱함
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		c = Integer.parseInt(br.readLine());

		t = a * b * c;		// 10자리까지 수가 나올 수 있음
		//System.out.printf("t? : %d\n", t); //테스트

		// 각 자리 수를 넣어서 카운팅할 배열 선언
		int[] arr = new int[10];

		// t가 몇 자리 수인지 계산
		int tLenght = (int)(Math.log10(t)+1);

		// 각 자리의 숫자 확인
		for (int i=0; i<tLenght; i++)
		{			
			int temp =(int)(t % Math.pow(10, i+1) / Math.pow(10, i));
			arr[temp]++;
			//System.out.println(i + ": " + temp); //테스트
		}


		// 출력
		for (int i=0; i<10; i++)
		{
			System.out.println(arr[i]);
		}
	}
}