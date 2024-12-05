package ExamTest_241029;

public class CondEx3 {
  public static void main(String[] args) {
    int dollar = 5;

    if (dollar < 0) {
      System.out.println("잘못된 금액입니다! 금액을 입력해주세요!");
    } else if (dollar == 0) {
      System.out.println("환전할 금액이 없습니다!");
    } else {
      System.out.println("환전 금액은 " + (dollar * 1300) + " 원 입니다!");
    }
  }
}
