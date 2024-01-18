import java.util.Scanner;

public class Problem10811 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] basket = new int[n];
    for (int i = 0; i < n; i++) {
      basket[i] = i + 1;
    }

    int m = sc.nextInt();
    for (int i = 0; i < m; i++) {
      int startBasketNumber = sc.nextInt();
      int endBasketNumber = sc.nextInt();
      reverseBasket(basket, startBasketNumber - 1, endBasketNumber - 1);
    }

    sc.close();

    printBasket(basket);
  }

  private static void reverseBasket(int[] basket, int startArrayNumber, int endArrayNumber) {
    while (startArrayNumber < endArrayNumber) {
      // XOR swap to swap elements without using a temporary variable
      basket[startArrayNumber] ^= basket[endArrayNumber];
      basket[endArrayNumber] ^= basket[startArrayNumber];
      basket[startArrayNumber] ^= basket[endArrayNumber];

      startArrayNumber++;
      endArrayNumber--;
    }
  }

  private static void printBasket(int[] basket) {
    for (int item : basket) {
      System.out.print(item + " ");
    }
  }
}
