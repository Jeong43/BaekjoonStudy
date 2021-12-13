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

		// �� �������� �Է� �ޱ�
		int n = Integer.parseInt(br.readLine());

		// ��Ȱ� ������ ���� �迭 ����
		String[] answer = new String[n];
		int[] score = new int[n];

		// ��� �� ���� �Է�
		for (int i=0; i<n; i++)
		{
			// ��� �Է�
			answer[i] = br.readLine();

			// ���� �Է�
			score[i] = 0;
			int cnt = 0; // �Էµ� ����
			
			for (int j=0; j<answer[i].length(); j++)
			{
				if (answer[i].charAt(j) == 'O')
					score[i] += ++cnt;
				else 
					cnt = 0;
			}				
		}

		// ���� ���
		for (int i=0; i<n; i++)
			System.out.println(score[i]);
	}
}