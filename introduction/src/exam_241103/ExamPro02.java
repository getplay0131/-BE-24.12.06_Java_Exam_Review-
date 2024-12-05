package exam_241103;

public class ExamPro02 {
    public static void main(String[] args) {
//문제 설명
//어떤 세균은 1시간에 두배만큼 증식한다고 합니다. 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.
//
//제한사항
//1 ≤ n ≤ 10
//1 ≤ t ≤ 15

        class Solution {
            public int solution(int n, int t) {
//                    n == 세균 / t == 시간
                    double answer = (int)(n*(Math.pow(2,t)));
                    return (int)answer;
//                    answer = (int)(n*(Math.pow(2,t)));
            }
        }


    }
}