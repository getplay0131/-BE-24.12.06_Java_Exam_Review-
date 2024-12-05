//백준 - 시험 성적

package Exam_241107;

import java.util.Scanner;

public class baek_Ex2 {
  public static void main(String[] args) {
//      점수 입력 받기
      Scanner scan = new Scanner(System.in);

      int score = scan.nextInt();

      if (score >= 90) {
      System.out.println("A");
      } else if(score >= 80){
      System.out.println("B");
      } else if(score>= 70){
      System.out.println("C");
      } else if(score>= 60){
      System.out.println("D");
      } else {
      System.out.println("F");
      }


  }
}
