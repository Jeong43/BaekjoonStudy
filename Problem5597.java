import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem5597 {

  public static void main(String[] args) {
    final int COUNT_OF_STUDENT = 30;
    final int COUNT_OF_SUBMISSION_STUDENT = 28;

    Scanner sc = new Scanner(System.in);

    Set<Integer> students = new HashSet<>();
    for (int i = 1; i <= COUNT_OF_STUDENT; i++) {
      students.add(i);
    }

    for (int i = 0; i < COUNT_OF_SUBMISSION_STUDENT; i++) {
      students.remove((Integer) sc.nextInt());
    }

    Integer[] studentsArray = students.toArray(new Integer[0]);
    Arrays.sort(studentsArray);

    for (Integer student : studentsArray) {
      System.out.println(student);
    }
  }
}
