//백준 - 반복문 - 구구단

package Exam_241108;

import java.util.Scanner;

public class baek_Loop_Ex1 {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);

    int inputNum = Integer.parseInt(num.nextLine());

    for(int i = 1; i <= 9; i++) {
      System.out.println(inputNum + " * " + i + " = " + (inputNum*i));
    }
  }
}
