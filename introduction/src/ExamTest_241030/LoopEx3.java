package ExamTest_241030;

public class LoopEx3 {
  public static void main(String[] args) {
    int sum = 0;
    int i = 1;
    int max = 3;
    // while
    //    while (i <= max) {
    //      sum += i;
    //      i++;
    //    }
    //    System.out.println("sum =" + sum);

    for (int j = 1; j <= max; j++) {
      sum += j;
    }
    System.out.println("sum = " + sum);
  }
}
