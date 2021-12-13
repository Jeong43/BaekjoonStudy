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

		int c, n;		// ���̽� ��, �� ���̽����� �л� ��
		double[] arr;	// �� ���̽����� ���ǿ� �����ϴ� �ο� �ۼ�Ʈ ��Ƶα�

		c = sc.nextInt();
		arr = new double[c];

		for (int i=0; i<c; i++)			// ���̽� �ݺ�
		{
			int[] temp;					// �� ������ �Է¹��� �迭
			int totTemp=0;				// ���̽� ���� ����
			double avgTemp;				// ���̽� ���� ���
			int cnt=0;					// ��� �̻��� ����� ��

			n = sc.nextInt();

			temp = new int[n];


			// ���� �Է�
			for (int j=0; j<n; j++)				
			{	
				temp[j] = sc.nextInt();
				totTemp += temp[j];	
			}

			// ���
			avgTemp = (double)totTemp / n;	
			

			// ��� �̻��� ��� ����
			for (int j=0; j<n; j++)				
			{
				if (temp[j]>avgTemp)
					cnt++;
			}


			// ��� �̻��� ����� ��з�
			arr[i] = (double) cnt / n * 100;	
		}


		// ���
		for (int i=0; i<c; i++)
			System.out.printf("%.3f%%\n", arr[i]);		
	}
}