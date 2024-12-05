// 선생님 답안 참고- 가장 작은 수와 큰 수 찾기

package pack_241105_Exam;

import java.util.Scanner;

public class ArrayEx6_2 {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
    while (true) {
      int count = 0;
      System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
      count = Integer.parseInt(scan.nextLine());

      int[] nums = new int[count];
      System.out.println(count + " 개의 정수를 입력해주세요 : ");

      int min, max ;

      for (int i = 0; i < nums.length; i++) { // 두번째 숫자부터 비교
        nums[i] = Integer.parseInt(scan.nextLine());
      }
      min = max = nums[0]; // 우측으로부터 대입 된다.
      for (int i = 1; i < nums.length; i++) {
        if (min > nums[i]) {
          min = nums[i];
        }
        if (max < nums[i]) {
          max = nums[i];
        }
      }

      System.out.println("가장 작은 정수 : " + min);
      System.out.println("가장 큰 정수 : " + max);
      }
  }
}
