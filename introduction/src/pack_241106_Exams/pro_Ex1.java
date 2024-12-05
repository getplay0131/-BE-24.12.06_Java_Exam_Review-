//배열의 평균 값

package pack_241106_Exams;

public class pro_Ex1 {
  public static void main(String[] args) {
      class Solution {
          public double solution(int[] numbers) {
              int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }

        double ave = 0;
        ave = (double)total / numbers.length;
              return ave;
          }
      }
  }
}

//arrays.stream 방식 => 많이 쓰이고 있다고 함
//return Arrays.stream(numbers).average().orElse(0);
