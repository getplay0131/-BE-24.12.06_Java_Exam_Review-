//백준 - 조건문 - 두수 비교하기
package Exam_241107;

import java.util.Scanner;

public class beak_Ex1 {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      int A = scan.nextInt();
      int B = scan.nextInt();

    if (A > B) {
      System.out.println(" > ");
      } else if(A < B){
      System.out.println(" < ");
      } else {
      System.out.println(" == ");
    }

  }
}
