import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//import java.util.Scanner;

public class while003
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(br.readLine());	//--�Է� ��
		int temp;		// -����� ���� ����		
		int cnt=0;		//-����Ŭ�� ����

		temp = n;
		do
		{
			temp = (temp%10*10) + ((temp/10 + temp%10)%10);
			cnt++;
		}
		while (n!=temp);

		System.out.println(cnt);
	}
}

/*
0���� ũ�ų� ����, 99���� �۰ų� ���� ������ �־��� �� ������ ���� ������ �� �� �ִ�. 
���� �־��� ���� 10���� �۴ٸ� �տ� 0�� �ٿ� �� �ڸ� ���� �����, 

�� �ڸ��� ���ڸ� ���Ѵ�.					=> (temp/10 + temp%10)

�� ����, �־��� ���� ���� ������ �ڸ� ����	=> (temp%10)
�տ��� ���� ���� ���� ������ �ڸ� ����		=> ((temp/10 + temp%10)%10)
�̾� ���̸�									=> (temp%10)*10 + ((temp/10 + temp%10)%10)
���ο� ���� ���� �� �ִ�. 

���� ���� ����.

26���� �����Ѵ�. 2+6 = 8�̴�. ���ο� ���� 68�̴�. 
6+8 = 14�̴�. ���ο� ���� 84�̴�. 8+4 = 12�̴�. ���ο� ���� 42�̴�. 4+2 = 6�̴�. 
���ο� ���� 26�̴�.

���� ���� 4������ ���� ���� ���ƿ� �� �ִ�. ���� 26�� ����Ŭ�� ���̴� 4�̴�.

N�� �־����� ��, N�� ����Ŭ�� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/