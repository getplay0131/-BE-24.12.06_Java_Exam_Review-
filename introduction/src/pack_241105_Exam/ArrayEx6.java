// - 가장 작은 수와 큰 수 찾기
//ai 이용 개선 => 다소 이해에 어려움


package pack_241105_Exam;

import java.util.Scanner;

public class ArrayEx6 {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
    while (true) {
      int count = 0;
      System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
      count = Integer.parseInt(scan.nextLine());

      int[] nums = new int[count];
      System.out.println(count + " 개의 정수를 입력해주세요 : ");

      nums[0] = Integer.parseInt(scan.nextLine());
      int min = nums[0];
      int max = nums[0];

      for (int i = 1; i < nums.length; i++) {
        nums[i] = Integer.parseInt(scan.nextLine());
        min = Math.min(nums[i], min);
        max = Math.max(nums[i], max);
      }
      System.out.println("가장 작은 정수 : " + min);
      System.out.println("가장 큰 정수 : " + max);
      }
  }
}
