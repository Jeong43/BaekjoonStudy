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
		

		// ���ڸ� �޾� �ְ� ����
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		c = Integer.parseInt(br.readLine());

		t = a * b * c;		// 10�ڸ����� ���� ���� �� ����
		//System.out.printf("t? : %d\n", t); //�׽�Ʈ

		// �� �ڸ� ���� �־ ī������ �迭 ����
		int[] arr = new int[10];

		// t�� �� �ڸ� ������ ���
		int tLenght = (int)(Math.log10(t)+1);

		// �� �ڸ��� ���� Ȯ��
		for (int i=0; i<tLenght; i++)
		{			
			int temp =(int)(t % Math.pow(10, i+1) / Math.pow(10, i));
			arr[temp]++;
			//System.out.println(i + ": " + temp); //�׽�Ʈ
		}


		// ���
		for (int i=0; i<10; i++)
		{
			System.out.println(arr[i]);
		}
	}
}