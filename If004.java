import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class If004
{
	public static void main(String[] args) throws IOException
	{
		// �� �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b;	//-- �Է� ���� �� ��
		int res;	//-- ��и��� ���

		// �� ���� �� ó��
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

		// �� ��� ���
		System.out.print(res);

	}
}