package ExamTest_241030;

public class LoopEx2 {
  public static void main(String[] args) {
    //    for 모범 답안
    //      for (int num = 2, count = 1; count <= 10; num += 2, count++) {
    //          System.out.println(num);
    //      }

    //    int num = 1;
    //    int count = 1;
    //    //      for
    //    for (int i = 0; ; i++) {
    //      num++;
    //      if (num % 2 == 0) {
    //        System.out.println(num);
    //        count++;
    //        if (count > 20) {
    //          break;
    //        }
    //      }
    //    }

    //      while > 최대한 간결하게
    int num = 2;
    int count = 1;
    //    while (count <= 10) {
    //      System.out.println(num);
    //      num += 2;
    //      count++;
    //    }

    while (true) {
      if (count <= 10) {
        System.out.println(num);
        num += 2;
        count++;
      } else {
        break;
      }
    }
  }
}
