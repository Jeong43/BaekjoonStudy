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
		
		// ���� ����
		int n;				// ���� ��
		double m=0;			// �ִ� ����
		double sum=0, avg;	// �հ�, ���

		// ���� �� �Է� �ޱ�
		n = sc.nextInt();

		// �迭 ���� �� �Է�
		double[] arr = new double[n];

		for (int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextDouble();
			if (arr[i]>m) // �ִ� ���� �Է�
				m = arr[i];
		}

		// ���� ����
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = (double)arr[i]/m*100;
			sum += arr[i];
		}

		// ��� ���
		avg = sum / n;

		// ���
		System.out.println(avg);
	}
}