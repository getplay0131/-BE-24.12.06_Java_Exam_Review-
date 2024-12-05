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

package Exam_241114;

import cond.Switch1;

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
        if (inBookCount == 10) {
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

    //    개선 필요 사항:
    //
    // 반복 실행 구조 (while문)
    // 잘못된 메뉴 선택 처리
    // 종료 옵션 추가


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
        bookCurrentLoan(scan, bookLoanStat, bookTitle, bookAuthor, bookSince, inBookCount);
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
    //      이유: 메인의 배열들을 직접 수정하기 위해
    // 현재 문제: 메서드 안에서 새 배열을 만들어서 저장된 데이터가 사라짐
    // 리턴값을 boolean으로 변경: 등록 성공/실패를 알려주기 위해

    //      if (bookCount >= 10) {
    //    System.out.println("더 이상 등록할 수 없습니다");
    //    return false;
    // }
    //
    //// 제목 입력 받기
    //// 제목이 비어있는지 체크
    // if(inputTitle.equals("")) {
    //    return false;
    // }
    //
    //// 저자 입력 받기
    //// 저자가 비어있는지 체크
    //
    //// 연도 입력 받기
    //// 연도가 숫자인지 체크
    //// 연도가 1900 ~ 2024 사이인지 체크
    int bookLength = 10;
//    String[] bookTitleArr = new String[bookLength];
//    String[] bookAuthorArr = new String[bookLength];
//    int[] BookSince = new int [bookLength];
    int arrayCount = 10;
    boolean taskCompleted = false;

    while (bookCount < bookLength) {
    if (arrayCount == 0 || bookCount >= bookLength) {
    System.out.println("최대 등록 가능한 권수에 도달하여 등록이 불가합니다.");
    taskCompleted = false;
    }
        System.out.print("도서의 제목을 입력해주세요! : ");
         String inputBookTitle = buffer.readLine();
        if (inputBookTitle.equals("")) {
          System.out.println("도서의 올바른 제목을 입력해주세요!");
         taskCompleted = false;
        }

//        중복 여부 확인
        boolean isDuplicate = false;
        for(int i = 0; i < bookCount; i++) {
            if (bookTitle.equals(inputBookTitle)) {
                System.out.println("이미 등록된 도서입니다.");
                taskCompleted = false;
                isDuplicate = true; //중복 플래그 설정
                break; // 루프 탈출
            }
        }
        if (isDuplicate) {
            continue;
        }

          System.out.print("해당 도서의 저자를 입력해주세요! : ");
          String  inputBookAuthor = buffer.readLine();

          int bookSinceYear = 0;
//          boolean noneInputYear = false;
//          while(!noneInputYear) {
          System.out.print("해당 도서의 출판 연도를 입력해주세요! : ");
            String inputBookSince = buffer.readLine();

//            정규 표현식 사용하여 입력값 확인
            if (Integer.parseInt(inputBookSince) >= 0000 && Integer.parseInt(inputBookSince) <= 9999) {
                bookSinceYear = Integer.parseInt(inputBookSince);
//                noneInputYear = true;
            } else {
          System.out.println("유효하지 않은 연도입니다. 숫자를 입력해주세요.");
          taskCompleted = false;
          continue;
            }
//          }
          bookTitle[bookCount] = inputBookTitle;
          bookAuthor[bookCount] = inputBookAuthor;
          bookSince[bookCount] = bookSinceYear;
          arrayCount--;
          bookLoanStat[bookCount] = true;
          taskCompleted = true;
          if (inputBookTitle.isEmpty() && inputBookAuthor.isEmpty() && bookSinceYear == 0) {
              bookLoanStat[bookCount] = false;
              taskCompleted = false;
          } else {
              taskCompleted = false;
              break;
          }
    }
//    . 문제는 마지막에 resultArr을 사용하고 있지만, 이 배열을 메인 메서드로 전달할 필요가 없으므로, 해당 부분은 제거해도 됩니다.
//      String[] resultArr = {
//              bookTitle[bookCount - 1], bookAuthor[bookCount - 1], String.valueOf(bookSince[bookCount - 1]),
//              String.valueOf(bookLoanStat[bookCount - 1]), String.valueOf(Integer.parseInt(String.valueOf(bookCount)))
//
//      };
      return taskCompleted ;
  }

  public static void bookFind(
      BufferedReader buffer, String[] bookTitle, String[] bookAuthor, int bookcount)
      throws IOException {
      int bookLength = 10;
      boolean found = false;
      String[]  results = new String[bookcount];
      int resultCount = 0;
    System.out.print("검색하실 내용을 입력해주세요! : ");
    String searchText = buffer.readLine();
    for (int i = 0; i <= bookcount; i++) {
      if (searchText.contains(bookAuthor[i]) || searchText.contains(bookTitle[i])) {
            results[bookcount] = (i + 1) + ", " + bookTitle[i] + " - " + bookAuthor[i];
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

  public static void bookCurrentLoan(
      BufferedReader scan,
      boolean[] bookLoanStat,
      String[] bookTitle,
      String[] bookAuthor,
      int[] bookSince,
      int bookcount)
      throws IOException {
    //      // 1. 도서 정보 입력받기
    //// 2. 입력받은 도서가 존재하는지 확인
    // boolean bookExists = false;
    // int bookIndex = -1;  // 찾은 도서의 위치
    //
    //// 3. bookCount만큼 반복하면서 도서 찾기
    //// 4. 찾으면 bookExists = true와 bookIndex 저장
    //
    //// 5. 도서가 있을 때만 대출/반납 처리
    // if(bookExists) {
    //    // 대출시: bookLoanStat[bookIndex] = false
    //    // 반납시: bookLoanStat[bookIndex] = true
    // }
    //      현재 문제:
    //
    // bookIndex가 항상 1로 고정
    // 도서 찾기 로직이 불완전
    // 대출 상태 변경이 부정확
    //
    // 개선 방향:
    //
    // 정확한 도서 찾기 구현
    // 찾은 도서의 실제 인덱스 저장
    // 대출/반납 상태 정확히 관리
    //
    // 💡 힌트: bookIndex는 실제 찾은 도서의 위치여야 합니다. 도서를 찾을 때 equals()로 비교하세요.
    boolean bookExists = false;
      int bookIndex = -1;
      boolean found = false;
      String[]  results = new String[bookcount];
      System.out.print("반납과 대출중 어떤 작업을 하시겠어요?(반납 or 대출 입력) : ");
      String bookTaskInfo = scan.readLine();

    for (int i = 0; i < bookcount; i++) {
          if (bookTaskInfo.equals("반납")){
    System.out.print("도서의 제목을 입력해주세요! : ");
    String inputBookTitle = scan.readLine();

    System.out.print("해당 도서의 저자를 입력해주세요! : ");
    String inputBookAuthor = scan.readLine();

    System.out.print("해당 도서의 출판 연도를 입력해주세요! : ");
    String inputBookSince = scan.readLine();
          if (bookTitle[i].equals(inputBookTitle) || bookAuthor[i].equals(inputBookAuthor)) {
        System.out.println("반납이 완료되었습니다.");
       bookTitle[bookcount+1] = inputBookTitle;
       bookAuthor[bookcount+1] = inputBookAuthor;
       bookSince[bookcount+1] = Integer.parseInt(inputBookSince);
       bookLoanStat[bookcount+1] = true;
        bookIndex++;
        bookLoanStat[bookIndex] = true;
        found = true;
        continue;
    } else {
        System.out.println("도서 정보를 입력해주세요!");
        continue;
          }

          } else if(bookTaskInfo.equals("대출")){
              System.out.print("도서의 제목을 입력해주세요! : ");
              String inputBookTitle = scan.readLine();

              System.out.print("해당 도서의 저자를 입력해주세요! : ");
              String inputBookAuthor = scan.readLine();

              System.out.print("해당 도서의 출판 연도를 입력해주세요! : ");
              String inputBookSince = scan.readLine();
              if (bookTitle[i].equals(inputBookTitle) || bookAuthor[i].equals(inputBookAuthor)) {
                  System.out.println("대출이 완료되었습니다.");
                  bookTitle[i] = inputBookTitle;
                  bookAuthor[i] = inputBookAuthor;
                  bookSince[i] = Integer.parseInt(inputBookSince);
                  bookLoanStat[i] = false;
                  bookIndex++;
                  bookLoanStat[bookIndex] = false;
                  found = true;
                  continue;
          }
    }
        if (bookExists) {
            bookLoanStat[bookIndex] = true;
        } else {
            bookLoanStat[bookIndex] = false;
        }
  }
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
}
