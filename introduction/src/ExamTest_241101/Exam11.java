package ExamTest_241101;

public class Exam11 {
  public static void main(String[] args) {
//      3개의 정수 입력 받기
//      평균을 실수로 출력
      int input1 = 8;
      int input2 = 7;
      int input3 = 15;

      double ave = (double) (input1 + input2 + input3) / 3;

      System.out.println("정수 평균 : " + (int)ave);
      System.out.println("실수 평균 : " + ave);
  }
}
