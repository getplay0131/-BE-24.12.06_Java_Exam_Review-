package ExamTest_241029;

public class CondEx2 {
  public static void main(String[] args) {
    int distance = 1;
    String vehicle = "";
    if (distance <= 1) {
      vehicle = "도보";
    } else if (distance <= 10) {
      vehicle = "자전거";
    } else if (distance <= 100) {
      vehicle = "자동차";
    } else if (distance > 100) {
      vehicle = "비행기";
    }
    System.out.println("해당 거리를 이동하기 위한 추천 운송 수단은" + vehicle + " 입니다!");
  }
}
