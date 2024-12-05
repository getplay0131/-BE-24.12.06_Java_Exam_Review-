package ExamTest_241030;

public class CondEx2 {
  public static void main(String[] args) {
    int distance = 17;

    if (distance <= 1) {
      System.out.println("걸어가");
    } else if (distance <= 10) {
      System.out.println("따릉이");
    } else if (distance <= 100) {
      System.out.println("택시");
    } else {
      System.out.println("뱅기");
    }
  }
}
