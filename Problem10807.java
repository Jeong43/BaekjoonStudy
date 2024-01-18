import java.util.Scanner;

public class Problem10807 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int count = 0; count < n; count++) {
      arr[count] = sc.nextInt();
    }

    int v = sc.nextInt();
    int result = 0;
    for (int num : arr) {
      if (num == v) {
        result++;
      }
    }

    System.out.println(result);
  }
}
