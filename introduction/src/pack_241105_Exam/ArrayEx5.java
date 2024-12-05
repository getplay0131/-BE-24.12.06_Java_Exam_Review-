//완료 - 합계와 평균2

package pack_241105_Exam;

import java.util.Scanner;

public class ArrayEx5 {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int count = 0;
    System.out.print("입력받을 숫자의 개수를 입력하세요 : " );
      count = Integer.parseInt(scan.nextLine());

      int[] nums = new int[count];
        int sum = 0;
        double ave = 0;
      System.out.println( count +" 개의 정수를 입력해주세요 : ");

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
