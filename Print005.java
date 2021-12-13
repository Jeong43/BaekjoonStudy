import java.io.IOException;
import java.util.Scanner;

class Print005
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);

		int A, B, C;

		A = sc.nextInt();
		B = sc.nextInt();
        C = sc.nextInt();

		System.out.println((A+B)%C);
        System.out.println(((A%C)+(B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C)*(B%C))%C);
	}
}