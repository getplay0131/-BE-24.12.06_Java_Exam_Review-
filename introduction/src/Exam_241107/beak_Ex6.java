//백준 - 조건문 - 오븐 시계

package Exam_241107;

import java.util.Scanner;

public class beak_Ex6 {
  public static void main(String[] args) {

//      시간 입력 받기
      Scanner scan = new Scanner(System.in);
      int A = scan.nextInt();
      int B = scan.nextInt();
      int C = scan.nextInt();
      B += C;
      if( B >= 60) {
        A += B / 60;
        B %= 60;
  }
        if (A >= 24) {
            A %= 24 ;
        }
    System.out.println(A +  " " + B);
}
}