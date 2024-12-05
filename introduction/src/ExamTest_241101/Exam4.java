package ExamTest_241101;

public class Exam4 {
  public static void main(String[] args) {
    int language = 80;
    int english = 75;
    int math = 55;
//    개선점
//      평균 계산 시 정확한 결과를 위해 double 사용을 고려해볼 수 있습니다
    int ave = (language + english + math) / 3;
    //    개선점 :
    //      평균이 80점 이상이라는 조건도 포함해야 합니다:
    //
    // javaCopyboolean result = (ave >= 80) && (language >= 60 && english >= 60 && math >= 60);
    boolean result = (language >= 60 && english >= 60 && math >= 60);
    System.out.println("평균점수 :" + ave + "점");
    System.out.println("합격여부 :" + result);

}
}