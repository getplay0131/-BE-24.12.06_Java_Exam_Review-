package Progress_241107;

import java.util.Scanner;

public class MethodReturn2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    while (true) {
      System.out.print("안녕하세요! 귀하의 나이를 알려주세요! : ");
      int age = scan.nextInt();
      isAgeCheck(age);
    }
  }

    public static void isAgeCheck(int age ) {
      if (age >= 18) {
         System.out.println("안녕하세요! 방문해 주셔서 감사합니다.");
          return ;
      } else {
      System.out.println("죄송하지만, 미성년자는 출입이 불가합니다. 돌아가주세요.");
      return ;

      }
    }
}
