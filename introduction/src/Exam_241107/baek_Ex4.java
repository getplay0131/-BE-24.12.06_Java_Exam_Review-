//백준 - 조건문 - 사분면 고르기
package Exam_241107;

import java.util.Scanner;

public class baek_Ex4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int x = scan.nextInt();
    int y = scan.nextInt();

    if (x > 0 && y > 0) {
      System.out.println(1);
    } else if (x < 0 && y > 0) {
      System.out.println(2);
    } else if (x < 0 && y < 0) {
      System.out.println(3);
    } else {
      System.out.println(4);
    }
  }
}
