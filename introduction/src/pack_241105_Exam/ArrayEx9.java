package pack_241105_Exam;

import java.util.Scanner;

public class ArrayEx9 {
  public static void main(String[] args) {
    //    상품관리 프로그램 만들기
    //    필요한 기능
    //    1. 상품 등록 : 이름과 가격 입력받아 저장
    //    2. 상품 목룍 : 등록한 모든 상품 목록 출력

    //    첫 화면에서 선택지 3가지 제시[1. 상품 등록 ,2. 상품 목록, 3. 종료]
    //    상품 등록 선택시 상품 이름과 가격을 출력받아 배열에 저장
    //    상품 목록 선택시 배열에 저장된 모든 상품 출력
    //    종료 선택시 프로그램 종료

    //    상품은 최대 10개 까지 가능

    //    다음은 사용해야 하는 변수 및 구조이다:
    // Scanner scanner : 사용자 입력을 받기 위한 Scanner 객체
    // String[] productNames : 상품 이름을 저장할 String 배열
    // int[] productPrices : 상품 가격을 저장할 int 배열
    // int productCount : 현재 등록된 상품의 개수를 저장할 int 변수

//    1단계 스캐너 호출 및 배열 선언
    Scanner scan = new Scanner(System.in);
//상품 개수 체크
    int productCount = 0;
    int maxCount = 10;
//    상품명과 가격 입력 받기
    String [] productName = new String[maxCount];
    int [] productPrice = new int [maxCount];

    //    첫 화면 출력
    while (true) {
      System.out.print("1.상품 등록 |");
      System.out.print(" 2.상품 목록 |");
      System.out.println(" 3.종료");
      System.out.print("메뉴를 선택 하세요 : ");
      int choice = Integer.parseInt(scan.nextLine());
      //    상품 등록 로직
      if (choice == 1) {
        if (productCount >= maxCount) {
          System.out.println("더 이상 상품을 등록 할 수 없습니다.");
          continue;
        } else {
          System.out.print("상품 이름을 입력하세요 : ");
          productName[productCount] = scan.nextLine();
          System.out.print("상품 가격을 입력하세요 : ");
          productPrice[productCount] = Integer.parseInt(scan.nextLine());
          productCount++;
        }
      } else if(choice == 2){
        if (productName[0] == ""){
          System.out.println("등록된 상품이 없습니다.");
          continue;
        } else {
          for(int i = 0; i < productCount; i++) {
          System.out.println(productName[i] + ": " + productPrice[i] + " 원");
          }
        }
      } else if(choice == 3){
        System.out.println("프로그램 종료가 선택되어 프로그램을 종료합니다.");
        break;
      } else {
        System.out.println("기능을 선택해 주세요!");
        System.out.println(" ================== ");
        continue;
      }
    }
    }
}
