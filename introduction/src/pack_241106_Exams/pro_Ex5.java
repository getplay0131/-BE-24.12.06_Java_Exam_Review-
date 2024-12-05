//프로그래머스 - 짝수 홀수 개수

package pack_241106_Exams;

public class pro_Ex5 {
  public static void main(String[] args) {
      class Solution {
          public int[] solution(int[] num_list) {
              int evenCount = 0;
              int oddCount = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }
        }
        int[] answer = new int[]{evenCount,oddCount};
              return answer;
          }
      }
  }
}

// class Solution {
//    public int[] solution(int[] num_list) {
//        int[] answer = new int[2];
//
//        for(int i = 0; i < num_list.length; i++)
//            answer[num_list[i] % 2]++;
//
//        return answer;
//    }
// }
