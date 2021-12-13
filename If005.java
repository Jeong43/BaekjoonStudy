import java.util.Scanner;


public class If005
{
	public static void main(String[] args)
	{
		// ○ 변수 선언
		Scanner sc = new Scanner(System.in);
		int h, m;


		// ○ 연산 및 처리
		// 현재 알람 시간 입력
		System.out.print("시간, 분: ");
		h = sc.nextInt();
		m = sc.nextInt();
		// System.out.print(h + ":" + m);

		// 45분 빼기
		if (m>=45)
			m -= 45;
		else
		{
			m = m + (60 - 45);
			if (h==0)
				h=23;
			else
				h--;
		}


		// ○ 결과 출력
		System.out.println("새로운 알람 시간: " + h + ":" + m);
	}
}