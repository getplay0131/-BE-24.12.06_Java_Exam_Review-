// 종합 문제: 도서관 관리 시스템
// 간단한 도서관 관리 시스템을 구현하세요.
// 요구사항:
//
// 도서 정보
//
// 제목, 저자, 출판연도, 대출상태
// 최대 10권까지 관리
//
//
// 기능 구현
//
// 도서 등록
// 도서 검색 (제목 또는 저자로)
// 도서 대출/반납
// 전체 도서 목록 출력
// 대출 중인 도서 목록 출력
//
//
//
// 제약조건:
//
// 배열만 사용 (ArrayList 등 컬렉션 사용 금지)
// 모든 기능은 메서드로 분리
// 입력값 유효성 검사 포함
// 메뉴 방식의 사용자 인터페이스 구현
//
// 추가 도전과제:
//
// 대출 기한 구현 (현재 날짜 기준 2주)
// 연체 도서 관리 기능
// 도서 예약 시스템

package Exam_241113;

import java.io.*;

public class ExLast {
  public static void main(String[] args) throws IOException {
    //    // 도서 정보
    ////
    //// 제목, 저자, 출판연도, 대출상태
    //// 최대 10권까지 관리

//    버퍼 리더 호출
    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

//    변수 및 배열 구역
    int maxLength = 10;
    String [] bookTitle = new String[maxLength];
    String [] outBookTitle = new String[maxLength];
    String [] bookAuthor = new String[maxLength];
    int [] bookSince = new int[maxLength];
    String [] bookLoanStat = new String[maxLength];
    int inBookCount = 0;
//   ====================================


    String[] bookRegistArray = bookRegist(scan);
    System.out.println("=========== 도서관 관리 시스템 =============");
    System.out.println("원하시는 기능을 선택해주세요! ");
    System.out.print("1. 도서 등록 "  + " 2. 도서 검색 (제목 또는 저자로)" + "3. 도서 대출 / 반납 " + "4. 전체 도서 목록 출력" + "5. 대출 중인 도서 목록 " +
            "출력");
    int choice = Integer.parseInt(scan.readLine());

//    도서 정보 저장 배열에 메서드 값 반환하여 저장
    for(int i = 0; i < maxLength; i++) {
      bookTitle[i] = String.valueOf(bookRegistArray[0]);
      bookAuthor[i] = String.valueOf(bookRegistArray[1]);
      bookSince[i] = Integer.parseInt(bookRegistArray[2]);
      bookLoanStat[i] = String.valueOf(bookRegistArray[3]);
    }

        if (choice == 1) {
//          도서 등록
      bookRegist(scan);
//      도서 검색
    } else if (choice == 2) {
      bookFind(scan, bookTitle,bookAuthor);
        } else if(choice == 3){
          inbookCurrentLoan(scan,bookLoanStat,bookTitle,bookAuthor,bookSince);
        } else if(choice == 4) {
          bookList(bookTitle);
    } else if(choice == 5){
    outCurrentBook(scan,bookLoanStat,bookTitle,bookAuthor,bookSince,outBookTitle);
    }
        else{

        }
  }

public static String[] bookRegist (BufferedReader buffer) throws IOException{
  System.out.print("도서의 제목을 입력해주세요! : ");
  String inputBookTitle = buffer.readLine();

  System.out.print("해당 도서의 저자를 입력해주세요! : ");
  String inputBookAuthor = buffer.readLine();

  System.out.print("해당 도서의 출판 연도를 입력해주세요! : ");
  String inputBookSince = buffer.readLine();

  System.out.print("해당 도서의 대출 상태를 입력해주세요! : ");
  String inputBookRegist = buffer.readLine();

  return new String[]{inputBookRegist, inputBookAuthor, inputBookSince, inputBookTitle};
}

    public static String [] bookFind (BufferedReader buffer, String[] bookTitle, String[] bookAuthor) throws  IOException{
    System.out.println("검색하실 내용을 입력해주세요! : ");
    String searchText = buffer.readLine();
    for(int i = 0;; i++) {
      if (bookTitle[i] == String.valueOf(searchText)) {
        return new String[]{bookTitle[i]};
      } else if(bookAuthor[i] == String.valueOf(searchText)){
        return new String[]{bookAuthor[i]};
      } else {
        System.out.println("입력하신 내용과 동일한 내용을 검색하지 못했습니다.");
    }
    }
  }

  public static void inbookCurrentLoan (BufferedReader scan,String[] bookLoanStat,  String[] bookTitle,
                                        String[] bookAuthor, int[] bookSince) throws IOException{
      System.out.print("도서의 제목을 입력해주세요! : ");
      String inputBookTitle = scan.readLine();

      System.out.print("해당 도서의 저자를 입력해주세요! : ");
      String inputBookAuthor = scan.readLine();

      System.out.print("해당 도서의 출판 연도를 입력해주세요! : ");
      int inputBookSince = Integer.parseInt(scan.readLine());

      for(int i = 0;; i++) {
        if (String.valueOf(inputBookTitle) != "" && String.valueOf(inputBookAuthor) != "" && String.valueOf(inputBookSince) != "") {
        bookTitle[i] = String.valueOf(inputBookTitle);
        bookAuthor[i] = String.valueOf(inputBookAuthor);
        bookSince[i] = inputBookSince;
        System.out.println("반납이 완료되었습니다.");
        continue;
        } else {
          System.out.println("도서 정보를 입력해주세요!");
          continue;
        }
      }
    }

  public static String outCurrentBook(BufferedReader scan,String[] bookLoanStat,  String[] bookTitle,
                                        String[] bookAuthor, int[] bookSince, String[] outBookList) throws IOException{

      System.out.print("도서의 제목을 입력해주세요! : ");
      String inputBookTitle = scan.readLine();

      System.out.print("해당 도서의 저자를 입력해주세요! : ");
      String inputBookAuthor = scan.readLine();

      System.out.print("해당 도서의 출판 연도를 입력해주세요! : ");
    int inputBookSince = Integer.parseInt(scan.readLine());

    String outBook = String.valueOf(outBookList);
    for(int i = 0;i < 1; i++) {
      if (String.valueOf(inputBookTitle) != "" && String.valueOf(inputBookAuthor) != "" && String.valueOf(inputBookSince) != "") {
        bookTitle[i] = String.valueOf(inputBookTitle);
        bookAuthor[i] = String.valueOf(inputBookAuthor);
        bookSince[i] = inputBookSince;
        System.out.println("대출이 완료되었습니다.");
      } else {
        System.out.println("도서 정보를 입력해주세요!");
      }
    }
    return outBook;
  }
public static void bookList (String [] booktitle) {
      System.out.println(" === 현재 보관중인 도서 목록 === ");
    for(int i = 0; i < booktitle.length; i++) {
      System.out.print(booktitle[i]);
    }
}

public static  void outBookList (String [] outBookTitle) {
    System.out.println(" === 현재 대출중인 도서 목록 === ");
    for (int i = 0; i < outBookTitle.length; i++) {
        System.out.print(outBookTitle[i]);
    }
}
  }




