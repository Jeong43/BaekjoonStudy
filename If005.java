import java.util.Scanner;


public class If005
{
	public static void main(String[] args)
	{
		// �� ���� ����
		Scanner sc = new Scanner(System.in);
		int h, m;


		// �� ���� �� ó��
		// ���� �˶� �ð� �Է�
		System.out.print("�ð�, ��: ");
		h = sc.nextInt();
		m = sc.nextInt();
		// System.out.print(h + ":" + m);

		// 45�� ����
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


		// �� ��� ���
		System.out.println("���ο� �˶� �ð�: " + h + ":" + m);
	}
}