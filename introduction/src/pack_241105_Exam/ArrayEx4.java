//완료 - 합계와 평균

package pack_241105_Exam;

import java.util.Scanner;

public class ArrayEx4 {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int[] nums = new int[5];
        int sum = 0;
        double ave = 0;
      System.out.println("5개의 정수를 입력해주세요 : ");

      for (int i = 0; i < nums.length; i++) {
          nums[i] = Integer.parseInt(scan.nextLine());
      }

    for (int i = 0; i < nums.length; i++) {
          sum += nums[i];
          ave = sum/nums.length;
      }
      System.out.println("입력한 정수의 합계 : " + sum);
      System.out.println("입력한 정수의 평균 : " + ave);
  }
}
