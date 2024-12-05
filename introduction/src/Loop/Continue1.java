package Loop;

public class Continue1 {
  public static void main(String[] args) {
    //    int i = 1;

    for (int i = 1; i <= 5; i++) {
      if (i == 3) {
        System.out.println("숫자 건너뜀");
        continue;
      }
      System.out.println("i = " + i);
    }
    //    while (i <= 5) {
    //      if (i == 3) {
    //        i++;
    //        continue;
    //      }
    //      System.out.println("i = " + i);
    //      i++;
    //    }
  }
}
