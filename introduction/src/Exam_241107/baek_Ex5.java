//백준 - 조건문 - 알람 시계
//ai 도움 받음

package Exam_241107;

import java.util.Scanner;

public class baek_Ex5 {
  public static void main(String[] args) {
//      24시간 표현 사용
//      만약 시간이 45분 미만이라면 앞에 시간에서 1이 차감된다.
//
      Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int M = scan.nextInt();

        if (M < 45) {
            M += 60;
            H -= 1;
        }
            M -= 45;
        if (H < 0) {
            H = 23;
      }
    System.out.println(H + " " + M);
  }
}
