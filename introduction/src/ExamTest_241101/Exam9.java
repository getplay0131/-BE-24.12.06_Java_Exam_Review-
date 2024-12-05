package ExamTest_241101;

public class Exam9 {
  public static void main(String[] args) {
    for (int i = 2; i <= 10; i++) {
      if (i != 10) {
      System.out.println(i + "단");
        for (int j = 1; j <= 10; j++) {
          if (j != 10) {
          System.out.println(i + " X " + j + " = " + i * j);
        } else {
            System.out.println(i + "단 끝");
            System.out.println();
            break;
          }
          }
      } else {
        System.out.println(" ** 구구단 종료 **");
        break;
      }
}
  }
}
