package ExamTest_241101;

public class Exam2 {
  public static void main(String[] args) {
      int productPrice = 1000;
//      개선점 :
//      변수명에 일관성을 주면 좋겠습니다. productPrice와 discount보다는 둘 다 Price로 끝나게 하는 것이 좋습니다
      double discount = (productPrice * 0.1);
    //      개선점
      //      할인 계산 로직을 좀 더 단순화할 수 있습니다. 예를 들어:
    // int discountedPrice = productPrice - (int)(productPrice * 0.1);

    System.out.println("초기 가격 : " + productPrice + "원");
    System.out.println("할인된 가격 : " + (int)(productPrice-discount)+"원");
  }
}
