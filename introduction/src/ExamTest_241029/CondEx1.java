package ExamTest_241029;

public class CondEx1 {
  public static void main(String[] args) {
    int score = 78;
    String grade = "";
    if (score >= 90) {
      grade = "A";
    } else if (score >= 80) {
      grade = "B";
    } else if (score >= 70) {
      grade = "C";
    } else if (score >= 60) {
      grade = "D";
    } else {
      grade = "F";
    }
    System.out.println("입력하신 점수의 학점은 " + grade + " 입니다!");
  }
}
