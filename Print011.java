import java.io.IOException;
import java.util.Scanner;

class Print011
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);

		int n1, n2;

		n1 = sc.nextInt();
		n2 = sc.nextInt();

		System.out.println(n1 * (n2 % 10));						//n3
		System.out.println(n1 * (n2 % 100 -	n2 % 10) / 10);		//n4
		System.out.println(n1 * (n2 % 1000 - n2 % 100) /100);	//n5
		System.out.println(n1 * n2);							//n6
	}
}