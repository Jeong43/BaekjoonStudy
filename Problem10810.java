import java.util.Scanner;

public class Problem10810 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    int[] result = new int[n];

    for (int count = 0; count < m; count++) {
      int i = sc.nextInt();
      int j = sc.nextInt();
      int k = sc.nextInt();

      for (int startBox = i; startBox <= j; startBox++) {
        result[startBox - 1] = k;
      }
    }

    printBox(result);
  }

  private static void printBox(int[] box) {
    for (int item : box) {
      System.out.print(item + " ");
    }
  }
}
