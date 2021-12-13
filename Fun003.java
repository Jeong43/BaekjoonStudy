import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;

public class Fun003
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;			//-- �۰ų� ���� ���� �Է� ���� ����
		int result = 0;	//-- �Ѽ��� ���� ������
		
		n = Integer.parseInt(br.readLine());


		// �����ϴ� �Ѽ�
		for (int i=1; i<10; i++)		// �����ϴ� ��
		{
			int sum = i;	//-- �̹��� ���� ��
			
			for (int y=1; y<10; y++)	// ������������ �����ϴ� ��
			{	
				for (int z=1; (i+y*z)<10; z++)
				{
					sum = sum*10 + (y*z);

					System.out.println("sum: " + sum);

					if (sum <= n)
						result++;
					else
						break;
				}
			}	
		}




/*		// �����ϴ� �Ѽ�
		for (int i=1; i<10; i++)
		{
			int sum = i;	//-- �̹��� ���� ��

			for (int y=1; (i+y)<10; y++)
			{				
				sum += (i+y) * (int)Math.pow(10, y);

				if (sum <= n)
					result++;
				else 
					break;
			}				
		}
*/
		System.out.println(result);
	}
}
