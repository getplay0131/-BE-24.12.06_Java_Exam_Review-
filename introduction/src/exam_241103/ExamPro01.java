package exam_241103;

public class ExamPro01 {
    public static void main(String[] args) {
//        정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
        class Solution {
            public int solution(int n) {
                            int sum = 0;
                if (n > 0 && n <= 1000) {
                    for (int i = 1; i <= n; i++) {
                        if (i % 2 == 0) {
                            sum+=i;
                        }
                    }
                }

                int answer = 0;
                answer = sum;
                return answer;
            }
        }
    }
}