//프로그래머스 - 머쓱이보다 키 큰 사람
package pack_241106_Exams;

public class pro_Ex9 {
  public static void main(String[] args) {
      class Solution {
          public int solution(int[] array, int height) {
              int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                count++;
            }
        }
              return count;
          }
      }
  }
}
