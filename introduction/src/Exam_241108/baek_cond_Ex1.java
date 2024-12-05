//백준 - 조건문 - 주사위 3개

package Exam_241108;

import java.util.Scanner;

public class baek_cond_Ex1 {
  public static void main(String[] args) {
    // 스캐너 호출
    Scanner scan = new Scanner(System.in);
    // 3개의 주사위 값 입력 받기
    int dice1 = scan.nextInt();
    int dice2 = scan.nextInt();
    int dice3 = scan.nextInt();
    // 주사위 3개의 값이 동일시 조건 :  10000원 + 눈의 값 * 1000원
    if (dice3 == dice2 && dice2 == dice1 ) {
      System.out.println(10000 + (dice2 * 1000));
    // 주사위 2개의 값이 동일시 : 1000 + 눈의 값 * 100원
    } else if (dice3 == dice2 || dice3 == dice1 || dice2 == dice1) {
//        System.out.println(1000 + (dice3 * 100));
        if (dice2 == dice1) {
            System.out.println(1000 + (dice2 * 100));
    }
        if (dice3 == dice1) {
            System.out.println(1000 + (dice3 * 100));
        }
        if (dice3 == dice2) {
            System.out.println(1000 + (dice3 * 100));
        }
    } else {
//  모두 값이 다를 경우 : 가장 큰눈 * 100
      int max1 = Math.max(dice3,dice2);
    int resultMax = Math.max(max1,dice1);
    System.out.println(resultMax * 100);
    }
  }
}