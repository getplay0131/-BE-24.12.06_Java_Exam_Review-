//프로그래머스 - 중복된 숫자 개수
package pack_241106_Exams;

public class pro_Ex8 {
  public static void main(String[] args) {
      class Solution {
          public int solution(int[] array, int n) {
              int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                count++;
            }
        }
              int answer = count;
              return answer;
          }
      }

  }
}
