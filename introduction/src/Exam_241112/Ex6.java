// 6. 메서드 연습
// 문제 6-1: 계산기 메서드
// 사칙연산을 수행하는 메서드들을 작성하세요.
//
// 덧셈, 뺄셈, 곱셈, 나눗셈 각각 구현
// 나눗셈은 소수점 둘째 자리까지 출력
// 메서드 오버로딩 사용: 정수버전, 실수버전

//추후 재작성 필요

package Exam_241112;

import javax.imageio.IIOException;
import java.io.*;

public class Ex6 {
  public static void main(String[] args) throws IOException {
    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));


    while(true){

    //    1단계 : 숫자 입력 받기
    System.out.print("사칙연산 작업을 수행할 두 개의 숫자를 입력해주세요!(yes 입력시 시작)(exit 입력시 프로그램 종료) : ");
    String inputNum = scan.readLine();
    if (inputNum.equals("exit")) {
     writer.write("프로그램을 종료합니다.");
    } else{
    String[] numArray = inputNum.split(" ");
    int a = Integer.parseInt(numArray[0]);
    int b = Integer.parseInt(numArray[1]);
    if (numArray.length == 0 ) {
      writer.write(" 숫자를 입력해주세요!");
      writer.flush();
      continue;
    } else {
          System.out.println("무슨 작업을 수행할까요?");
          System.out.print("1.덧셈, 2.뺄셈, 3.곱셈, 4.나눗셈");
          int choice = Integer.parseInt(scan.readLine());

          switch (choice){
            case 1 :
              double addResult = add(a, b);
              writer.write("덧셈 결과 : " + addResult + "\n");
              break;
            case 2 :
              int subResult = sub(a, b);
              writer.write("뺄셈 결과 : " + subResult + "\n");
              break;
            case 3 :
              int mulResult = mul(a, b);
              writer.write("곱셈 결과 : " + mulResult + "\n");
              break;
            case 4 :
              if (b == 0) {
                writer.write("나눗셈 작업을 수행 할 수 없습니다." + "\n");
              } else {
              double divResult = div(a, b);
              writer.write("나눗셈 결과 : " + String.format("%.2f", divResult)  + "\n");
              break;
              }
            default:
              writer.write("올바른 기능을 선택해 주세요!" + "\n");
          }
          writer.flush();
    }
    writer.close();
    }





    }
  }

  public static int add(int a, int b) {
    int sum = a + b ;
    return sum;
  }

  public static double add(double a, double b) {
    double sum = a + b ;
    return sum;
  }

  public static int sub(int a, int b) {
    int sub = a - b ;
    return sub;
  }


  public static int mul(int a, int b) {
    int mul = a * b ;
    return mul;
  }

  public static double div(double a, double b) {
    double div = a / b ;
    return div;
  }
}
