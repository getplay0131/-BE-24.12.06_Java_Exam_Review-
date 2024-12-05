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
//24.11.16 진행 필요 내역 : 도서 검색 일부 검색 불가, 초기 선택지 메뉴 무한 반복 문제

package Exam_241115;

import java.io.*;

public class ExLast_Improvement_FeedbackAI {
  public static void main(String[] args) throws IOException {
    //    // 도서 정보
    ////
    //// 제목, 저자, 출판연도, 대출상태
    //// 최대 10권까지 관리

    //    버퍼 리더 호출
    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    //    배열 초기화 및 데이터 구조:
    //
    //
    // 현재: String [] bookTitle = {};
    // 문제점:
    //
    // 크기가 0인 배열이라 데이터 저장 불가
    // 관련 데이터(제목,저자,연도)가 별도 배열로 분리되어 관리가 어려움
    //
    //
    // 개선 방향:
    //
    // maxLength를 사용해 배열 초기화 필요
    // 도서 정보를 하나의 단위로 관리할 구조 고려
    //    변수 및 배열 구역
    int maxLength = 10;
    String[] bookTitle = new String[maxLength];
    String[] outBookTitle = new String[maxLength];
    String[] bookAuthor = new String[maxLength];
    int[] bookSince = new int[maxLength];
    boolean [] bookLoanStat = new boolean[maxLength];
    int inBookCount = 0;
    //   ====================================

    while (true) {
    System.out.println("=========== 도서관 관리 시스템 =============");
    System.out.println("원하시는 기능을 선택해주세요! ");
        if (inBookCount == maxLength) {
            System.out.println("안내 : 현재 등록된 도서과 10권이므로 추가 등록은 불가합니다.");
            System.out.print(
                     " 2. 도서 검색 (제목 또는 저자로)"
                            + "3. 도서 대출 / 반납 "
                            + "\n"
                            + "4. 전체 도서 목록 출력"
                            + "5. 대출 중인 "
                            + "도서 목록 "
                            + "출력"
                            + " 0. 시스템 종료 : ");
        } else {
    System.out.print(
        "1. 도서 등록 "
            + " 2. 도서 검색 (제목 또는 저자로)"
            + "3. 도서 대출 / 반납 "
            + "\n"
            + "4. 전체 도서 목록 출력"
            + "5. 대출 중인 "
            + "도서 목록 "
            + "출력"
            + " 0. 시스템 종료 : ");
        }
    int choice = Integer.parseInt(String.valueOf(scan.readLine()));

switch(choice) {
    case 1 -> {
        boolean registResult = bookRegist(scan, bookTitle, bookAuthor, bookSince,bookLoanStat,inBookCount);
        if (registResult == true) {
            for(int i = 0; i < inBookCount; i++) {
              System.out.println((i+1) + ", " + bookTitle[i] + " - " + bookAuthor[i] + " - " + bookSince[i]);
            }
            inBookCount++;
        }
        break;
    }
    case 2 ->  {
        bookFind(scan, bookTitle, bookAuthor, inBookCount);
        break;
    }
    case 3 -> {
        System.out.print("대출 또는 반납 중 어떤 작업을 하시겠어요?(대출 or 반납 입력) : ");
        String taskChoice = scan.readLine();
        if (taskChoice.equals("대출")) {
        bookLoan(scan, bookTitle, bookAuthor, bookSince, bookLoanStat, inBookCount );
        } else if(taskChoice.equals("반납")){
        }
            bookReturn(scan, bookTitle,bookAuthor, bookSince,bookLoanStat, inBookCount);
        break;
    }
     case 4-> {
//         bookList(bookTitle, inBookCount, bookAuthor, bookSince, bookLoanStat);
         break;
     }
     case 5-> {
//         outCurrentBook(scan, bookLoanStat, bookTitle, bookAuthor, bookSince, outBookTitle);
         break;
     }
     case 0 -> {
         System.out.println("시스템 종료를 선택하시어, 시스템이 종료됩니다.");
          break;
     }
    default -> {
        System.out.println("기능을 선택해주세요!");
          break;
    }
        }
    }



  }

  public static boolean bookRegist(BufferedReader buffer, String [] bookTitle, String[] bookAuthor, int[] bookSince,
   boolean[] bookLoanStat, int bookCount                                ) throws IOException {
    int bookLength = 10;
    int arrayCount = 10;
    boolean taskCompleted = false;
          int bookSinceYear = 0;
            String[] bookInfoReturn = new String[3];

    while (bookCount < bookLength) {
            System.out.print("도서 등록을 진행할까요? (yes or no) : ");
            String choice = buffer.readLine();
            if (choice.equals("yes")){
    if (arrayCount == 0 || bookCount >= bookLength) {
    System.out.println("최대 등록 가능한 권수에 도달하여 등록이 불가합니다.");
    return taskCompleted;
    }

            String[]bookInfoReturns = inputBookInfo(buffer);
            bookInfoReturn[0] =  bookInfoReturns[0];
            bookInfoReturn[1] =  bookInfoReturns[1];
            bookInfoReturn[2] =  bookInfoReturns[2];
        for(int i = 0; i < bookCount; i++) {

//        중복 여부 확인
        boolean isDuplicate = false;
        for(int k = 0; k < bookCount; k++) {
            if (bookTitle.equals(bookInfoReturn[0])) {
                System.out.println("이미 등록된 도서입니다.");
                isDuplicate = true; //중복 플래그 설정
                break; // 루프 탈출
            }
        }
        if (isDuplicate) {
            continue;
        }

          bookTitle[bookCount] =  bookInfoReturn[0];
          bookAuthor[bookCount] = bookInfoReturn[1];
          bookSince[bookCount] = bookSinceYear;
        bookCount++;
          arrayCount--;
          bookLoanStat[bookCount] = true;
          taskCompleted = true;

          if ( bookInfoReturn[0].isEmpty() && bookInfoReturn[1].isEmpty() && bookSinceYear == 0) {
              bookLoanStat[bookCount] = false;
              return taskCompleted;
          }
        }
            } else if (choice.equals("no")){
                return taskCompleted;
    }
            }
      return taskCompleted ;
  }

  public static void bookFind(
      BufferedReader buffer, String[] bookTitle, String[] bookAuthor, int bookcount)
      throws IOException {
      int bookLength = 10;
      boolean found = false;
      int resultCount = 0;
      String[]  results = new String[bookcount];
    System.out.print("검색하실 내용을 입력해주세요! : ");
    String searchText = buffer.readLine();
    for (int i = 0; i < bookcount; i++) {
    if (searchText.isEmpty()) {
        System.out.println("내용을 입력해주세요!");
        continue;
    }

      if (bookTitle[i] != null && bookTitle[i].contains(searchText) ||
              bookAuthor[i] != null && bookAuthor[i].contains(searchText)) {
            results[resultCount] = (resultCount + 1) + ", " + bookTitle[i] + " - " + bookAuthor[i];
            resultCount++;
        found = true;
      }
    }
    if (found) {
      System.out.print("검색 결과 : ");
      for(int i = 0; i < resultCount; i++) {
      System.out.print(results[i]);
      }
    } else {
        System.out.println("입력하신 내용과 동일한 내용을 검색하지 못했습니다.");
    }
  }

    public static boolean bookReturn(BufferedReader scan, String[] bookTitle, String[] bookAuthor, int[] bookSince,
                                  boolean[] bookLoanStat , int bookCount) throws IOException {

        int bookIndex = 0;
        boolean found = false;
        String[]  results = new String[bookCount];
        String[] bookInfoReturn = new String[3];

        for (int i = 0; i < bookCount; i++) {
                String[]bookInfoReturns = inputBookInfo(scan);
                bookInfoReturn[0] =  bookInfoReturns[0];
                bookInfoReturn[1] =  bookInfoReturns[1];
                bookInfoReturn[2] =  bookInfoReturns[2];
        if (bookTitle[i].equals(bookInfoReturn[0]) || bookAuthor[i].equals(bookInfoReturn[1])) {
            System.out.println("대출이 완료되었습니다.");
            bookTitle[i] = bookInfoReturn[0];
            bookAuthor[i] = bookInfoReturn[1];
            bookSince[i] = Integer.parseInt(bookInfoReturn[2]);
            bookLoanStat[i] = false;
            bookIndex--;
            bookLoanStat[bookIndex] = false;
            found = true;
            continue;
        }

        }
        if (found) {
            bookLoanStat[bookIndex] = true;
        } else {
            bookLoanStat[bookIndex] = false;
        }

        return found;
    }


public static boolean bookLoan(BufferedReader scan, String[] bookTitle, String[] bookAuthor, int[] bookSince,
                                boolean[] bookLoanStat , int bookCount) throws IOException {

    boolean bookExists = false;
    int bookIndex = -1;
    boolean found = false;
    String[]  results = new String[bookCount];
    String[] bookInfoReturn = new String[3];

    for (int i = 0; i < bookCount; i++) {
            String[]bookInfoReturns = inputBookInfo(scan);
            bookInfoReturn[0] =  bookInfoReturns[0];
            bookInfoReturn[1] =  bookInfoReturns[1];
            bookInfoReturn[2] =  bookInfoReturns[2];
            if (bookTitle[i].equals(bookInfoReturn[0]) || bookAuthor[i].equals(bookInfoReturn[1])) {
                bookTitle[bookCount] = bookInfoReturn[0];
                bookAuthor[bookCount] = bookInfoReturn[1];
                bookSince[bookCount] = Integer.parseInt(bookInfoReturn[2]);
                bookLoanStat[bookCount] = true;
                bookIndex++;
                bookLoanStat[bookIndex] = true;
                found = true;
                System.out.println("반납이 완료되었습니다.");
                continue;
            }
      }
    if (bookExists) {
        bookLoanStat[bookIndex] = true;
    } else {
        bookLoanStat[bookIndex] = false;
    }
    return bookExists;
}

  public static void bookList(
      String[] booktitle,
      int bookcount,
      String[] bookAuthor,
      int[] bookSince,
      boolean [] bookLoanStat) {
    System.out.println(" === 현재 보관중인 도서 목록 === ");
    if (bookcount == 0) {
      System.out.println("등록된 도서가 없습니다.");
    } else {
      for (int i = 0; i < bookcount; i++) {
        System.out.print(booktitle[i] + " ,");
        System.out.print(bookAuthor[i] + " ,");
        System.out.print(bookSince[i] + " ,");
        if (bookLoanStat[i] == true) {
          System.out.print("대출 가능");
        } else {
          System.out.print("대출 불가");
        }
      }
    }
  }

  public static void outBookList(String[] outBookTitle) {
    System.out.println(" === 현재 대출중인 도서 목록 === ");
    for (int i = 0; i < outBookTitle.length; i++) {
      System.out.print(outBookTitle[i]);
    }
  }

public static String [] inputBookInfo (BufferedReader scan) throws IOException {
while (true){
    System.out.print("도서의 제목을 입력해주세요! : ");
    String inputBookTitle = scan.readLine();

    if (inputBookTitle.equals("")) {
        System.out.println("도서의 올바른 제목을 입력해주세요!");
         continue;
    }

            System.out.print("해당 도서의 저자를 입력해주세요! : ");
            String inputBookAuthor = scan.readLine();

            System.out.print("해당 도서의 출판 연도를 입력해주세요! : ");
            String inputBookSince = scan.readLine();

            if (inputBookSince.length() != 4 || !inputBookSince.matches("\\d+")) {
                System.out.println("유효하지 않은 연도입니다. 숫자를 입력해주세요.");
                continue;
            }

            int inputYear = Integer.parseInt((inputBookSince));
     //            정규 표현식 사용하여 입력값 확인
     if ( inputYear < 1000 || inputYear > 9999) {
         System.out.println("유효하지 않은 연도입니다. 1000에서 9999 사이의 숫자를 입력해주세요.");
         continue;
     }
            String [] result = {inputBookTitle,inputBookAuthor,inputBookSince};
    return result;
}
  }
}
