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

		// �迭 ����
		int[] arr = new int[42];

		// �迭 �Է�
		for (int i=0; i<10; i++)
		{
			int temp = Integer.parseInt(br.readLine())%42; // �Է¹��� ���� 42�� ���� ������
			arr[temp]++;		// �ش� �������� ���� Ƚ���� ī����
		}
		
		// ������ ���� ����
		int cnt=0;
		for (int i=0; i<42; i++)
		{
			if (arr[i]!=0)
				cnt++;
		}

		// ���� �ٸ� �������� ���� ���
		System.out.println(cnt);		
	}
}