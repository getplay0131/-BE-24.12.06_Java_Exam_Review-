//오늘도 역시 선생님 답안 참고 - 배열의 입력과 출력

package pack_241105_Exam;

import java.util.Scanner;

public class ArrayEx2 {
  public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      int [] nums = new int[5];

      System.out.println("5개의 정수를 입력해주세요 : ");

    for (int i = 0; i < nums.length; i++) {
        nums[i] = Integer.parseInt(scan.nextLine());
//        if (i <= 4) {
//      System.out.print(nums[i] + (i < nums.length - 1 ? ", " : " "));
//        }
    }
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i]);
      if (i != nums.length - 1) {
        System.out.print(", ");
      }
    }
   }
  }