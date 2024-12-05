package ExamTest_241101;

public class Exam8 {
  public static void main(String[] args) {
//      약수 구하기
//      n이라는 정수가 주어지면, 다른 정수를 반복문으로 증가시키며 나누어서
//      나머지가 0이 만들어지면 약수로 간주
//      해당 작업이 완료되면, 약수를 카운트 변수에 증가시킴
//      break, continue 활용하기
//      2차 작업 본
      int n =25; //입력받은 정수
      int count = 0; //약수 개수 카운트
      int i = 0; // 증가할 수
      int measure = 0; //약수
        System.out.print(n+"의 약수 :");
      for(i = 1; i <= n; i++) {
      if (n % i == 0) {
        count++;
        measure= i;
        if (i != n) {
    System.out.print(measure +",");
        } else {
          System.out.println(measure);
            break;
        }
        }
    }
    System.out.println("약수의 개수 : " + count + "개");
//      ai에게 개선 가이드 받음


//      1차 작업 본
      //      //      반복문 생성
////      앞쪽 숫자
//      for(i = 1; i <= n ; i++) {
////뒤쪽 숫자
//          for(j = i; j <= n ; j++) {
//          }
//              if (n % i == 0){
//        if (n % j == 0) {
//          count++;
//                  }
//      System.out.println(n + "의 약수" + i +","+ j);
//              }
////          아래는 오케이
//           System.out.println("약수의 개수" + count + "개");
//      }
  }
}

// ai 제안 부분
// int n = 12;
// int count = 0;
//
// System.out.print(n + "의 약수: ");
// for (int i = 1; i <= n; i++) {
//    if (n % i == 0) {
//        count++;
//        System.out.print(i);
//        if (i != n) {
//            System.out.print(", ");
//        }
//    }
// }
// System.out.println("\n약수의 개수: " + count + "개");
//
// break문은 필요하지 않습니다 (이미 i가 n이 되면 반복문이 종료됨)
// 변수명을 더 명확하게 지을 수 있습니다 (예: number, divisorCount)
