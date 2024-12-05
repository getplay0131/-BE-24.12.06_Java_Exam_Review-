//출력 반복문 조건 변경으로 해결 - 배열과 역순 출력

package pack_241105_Exam;

import java.util.Scanner;

public class ArrayEx3 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int[] nums = new int[5];

    System.out.println("5개의 정수를 입력해주세요 : ");

    for (int i = 0; i < nums.length; i++) {
      nums[i] = Integer.parseInt(scan.nextLine());
      }

      System.out.println("입력한 정수가 역순으로 출력됩니다!");
      for (int i = 4; i >= 0; i--) {
        System.out.print(nums[i]);
        if (i != 0) {
          System.out.print(", ");
        }
    }
  }
  }