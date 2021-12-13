import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class If004
{
	public static void main(String[] args) throws IOException
	{
		// ○ 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b;	//-- 입력 받은 두 값
		int res;	//-- 사분면의 결과

		// ○ 연산 및 처리
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());

		if(a>0 && b>0)
			res = 1;
		else if(a<0 && b>0)
			res = 2;
		else if(a<0 && b<0)
			res = 3;
		else
			res = 4;

		// ○ 결과 출력
		System.out.print(res);

	}
}