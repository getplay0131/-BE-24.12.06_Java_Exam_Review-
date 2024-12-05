//백준 - 반복문 - 코딩은 체육과목입니다.

package Exam_241108;

import java.util.Scanner;

public class baek_Loop_Ex5 {
  public static void main(String[] args) {
//      int 는 기본 출력
//      long int 는 4바이트 => long = 4
//      입력 받은 숫자 / 4 => 몫 * 4 바이트
//      몫 1개 = long

      Scanner scan = new Scanner(System.in);
      int inputNum = scan.nextInt();

      int longByte = 4;
      int longCount = 0;
      String str = "long";
      if (inputNum >= 4) {
          longCount = inputNum / longByte;
      for(int i = 1; i <= longCount; i++) {
          System.out.print(str + " ");
      }
          System.out.print("int");
      }

  }
}
