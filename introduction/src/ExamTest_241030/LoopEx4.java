package ExamTest_241030;

public class LoopEx4 {
  public static void main(String[] args) {

    //      while 방식 구구단
    int i = 1;
    int j = 1;
    while (i <= 9) {
      while (j <= 9) {
        System.out.println(i + "*" + j + " = " + i * j);
        j++;
        if (j > 9) {
          j = 1;
          i++;
          if (i > 9) {
            break;
          }
        }
      }
    }

    //      for 문
    //    for (int i = 1; i <= 9; i++) {
    //      for (int j = 1; j <= 9; j++) {
    //        System.out.println(i + "*" + j + " = " + i * j);
    //      }
    //    }
  }
}
