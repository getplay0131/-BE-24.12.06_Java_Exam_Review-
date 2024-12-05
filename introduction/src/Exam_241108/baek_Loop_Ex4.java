//백준 - 반복문 - 영수증

package Exam_241108;

import java.util.Scanner;

public class baek_Loop_Ex4 {
  public static void main(String[] args) {
//      물건의 가격과 개수를 구하자 => 물건당 가격이 => 모인게 총 금액
//    영수증 금액 = X
//    물건의 종류 = N
//    물건 가격 = a
//    물건 개수 = b
    Scanner scan = new Scanner(System.in);

    int X = scan.nextInt();
    int N = scan.nextInt();
    int []totalPrice = new int[N]; // 총 금액
    int sum = 0;
    for(int i = 0; i < N; i++) {
    int a = scan.nextInt();
    int b = scan.nextInt();
      totalPrice[i] = a*b;
      sum += totalPrice[i];
    }

    if (sum == X) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
