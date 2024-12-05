package scope;

public class Scope1 {
  public static void main(String[] args) {
    int m = 10; // 이 변수는 해당 블록 안에서만 생존한다.
    if (true) {
      int n = 20;
      //      정수 n 은 해당 if문 안에서만 생존가능
    }
    //    System.out.println("n = " + n + ", m =" + m); // if문 안에 n은 이 영역에서 없는 존재가 된다.
    System.out.println("m = " + m);
  }
}
