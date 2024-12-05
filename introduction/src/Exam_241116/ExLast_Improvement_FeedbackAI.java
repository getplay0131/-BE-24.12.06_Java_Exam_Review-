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

//정말 좋은 학습 계획이네요! 👍 김영한님의 자바 기본 편을 통해 배울 수 있는 개념들과 도전과제 연결점을 정리해드릴게요:
//
//### 1. 날짜와 시간 다루기 (대출 기한 구현) 📅
//```java
//// 학습 포인트
//1. java.time 패키지 활용
//- LocalDate, LocalDateTime 클래스
//- 날짜 간 기간 계산
//- 날짜 비교 연산
//```
//- 대출일로부터 2주 계산
//- 현재 날짜와 반납예정일 비교
//
//### 2. 객체 지향 프로그래밍 (연체 도서 관리) 🎯
//```java
//// 학습 포인트
//1. 클래스와 객체
//2. 상속
//3. 인터페이스
//4. 열거형(enum)으로 도서 상태 관리
//```
//적용 예시:
//- Book 클래스 만들기
//- 대출/반납 상태를 enum으로 관리
//- 연체 관리 기능을 별도 클래스로 구현
//
//### 3. 예외 처리 (도서 예약 시스템) ⚡
//```java
//// 학습 포인트
//1. try-catch 사용법
//2. 사용자 정의 예외
//3. 예외 처리 활용
//```
//적용 방안:
//- 이미 예약된 도서 처리
//- 대출 불가능한 상황 처리
//- 잘못된 입력 처리
//
//### 학습 진행 순서 제안 📚
//
//1단계: 기본기 다지기
//- 객체 지향 개념 학습
//- 날짜/시간 API 이해
//- 예외 처리 방법 학습
//
//2단계: 기존 코드 개선
//- Book 클래스 설계
//- enum으로 상태 관리
//- 예외 처리 적용
//
//3단계: 도전과제 구현
//- 대출 기한 기능
//- 연체 관리 시스템
//- 예약 기능
//
//이렇게 단계적으로 접근하면 코드도 깔끔해지고 실력도 늘 것 같아요! 😊
//각 단계마다 작은 목표를 세워서 하나씩 달성해나가면 좋을 것 같습니다.

package Exam_241116;
//24.11.16 진행 필요 내역 : 도서 검색 일부 검색 불가, 초기 선택지 메뉴 무한 반복 문제 >> 해결
//현재 문제 있는 기능 : 대출 및 반납 : 무한 루프 문제, 북 인덱스 문제(1권 등록하여 북 카운트가 1일 경우 대출하면 인덱스가 -1로 감소 됨] / 4번 전체 도서 목록 출력 기능 활성화 안됨 >> 완료



import java.io.*;

public class ExLast_Improvement_FeedbackAI {
  public static void main(String[] args) throws IOException {

    //    버퍼 리더 호출
    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));


    //    변수 및 배열 구역
    int maxLength = 10;
    String[] bookTitle = new String[maxLength];
    String[] outBookTitle = new String[maxLength];
    String[] bookAuthor = new String[maxLength];
    int[] bookSince = new int[maxLength];
    boolean [] bookLoanStat = new boolean[maxLength];
    int inBookCount = 0;
    //   ====================================

        boolean isRunning = true;
    while (isRunning) {
    System.out.println("=========== 도서관 관리 시스템 =============");
    System.out.println("원하시는 기능을 선택해주세요! ");
        if (inBookCount == maxLength) {
            System.out.println("안내 : 현재 등록된 도서가 10권이므로 추가 등록은 불가합니다.");
            InfoMessage(2);
        } else {
            InfoMessage(1);
        }
    int choice = Integer.parseInt(String.valueOf(scan.readLine()));

switch(choice) {
    case 1 -> {
        boolean registResult = bookRegist(scan, bookTitle, bookAuthor, bookSince,bookLoanStat,inBookCount);
        if (registResult == true) {
            for(int i = 0; i < inBookCount; i++) {
              System.out.println(printBookInfo(i,bookTitle[i],bookAuthor[i],bookSince[i],bookLoanStat[i]));
            }
            inBookCount++;
        }
        break;
    }
    case 2 ->  {
        bookFind(scan,bookTitle, bookAuthor, inBookCount,bookSince ,bookLoanStat);
        writer.flush();
        break;
    }
    case 3 -> {
        System.out.print("대출 또는 반납 중 어떤 작업을 하시겠어요?(대출 or 반납 입력) : ");
        String taskChoice = scan.readLine();
        if (taskChoice.equals("대출")) {
        bookLoan(scan, bookTitle, bookAuthor, bookSince, bookLoanStat, inBookCount, outBookTitle );
        } else if(taskChoice.equals("반납")){
            bookReturn(scan, bookTitle,bookAuthor, bookSince,bookLoanStat, inBookCount);
        } else {
            errorMessage("답변");
            continue;
        }
        break;
    }
     case 4-> {
         bookList(bookTitle, inBookCount, bookAuthor, bookSince, bookLoanStat);
         break;
     }
     case 5-> {
        for(int i = 0; i < inBookCount; i++) {
//            public static void outBookList(String[] outBookTitle,
//                                 int bookcount,
//                                 String[] bookAuthor,
//                                 int[] bookSince,
//                                 boolean [] bookLoanStat
         outBookList(outBookTitle, inBookCount, bookAuthor, bookSince, bookLoanStat);
        }
         break;
     }
     case 0 -> {
         System.out.println("시스템 종료를 선택하시어, 시스템이 종료됩니다.");
         isRunning = false;
          break;
     }
    default -> {
        System.out.println("기능을 선택해주세요!");
          break;
    }
        }
    }
    writer.close();
  }

  public static boolean bookRegist(BufferedReader buffer, String [] bookTitle, String[] bookAuthor, int[] bookSince,
   boolean[] bookLoanStat, int bookCount                                ) throws IOException {
    int bookLength = 10;
//    int arrayCount = 10;
    boolean taskCompleted = false;
          int bookSinceYear = 0;
            String[] bookInfoReturn = new String[3];

    while (taskCompleted == false) {
            System.out.print("도서 등록을 진행할까요? (yes or no) : ");
            String choice = buffer.readLine();
            if (choice.equals("yes")){
    if (bookCount >= bookLength) {
    System.out.println("최대 등록 가능한 권수에 도달하여 등록이 불가합니다.");
    return taskCompleted;
    }

            String[]bookInfoReturns = inputBookInfo(buffer);
    String title = bookInfoReturns[0];
    String author = bookInfoReturns[1];
    int since = Integer.parseInt(bookInfoReturns[2]);


//        중복 여부 확인
        boolean isDuplicate = false;
        for(int k = 0; k < bookCount; k++) {
            if (bookTitle[k].equals(bookInfoReturn[0])) {
                errorMessage("도서");
                isDuplicate = true; //중복 플래그 설정
                break; // 루프 탈출
            }
        }
        if (isDuplicate) {
            continue;
        }
          if ( title.isEmpty() && author.isEmpty() && since == 0) {
              bookLoanStat[bookCount-1] = false;
              return taskCompleted;
          }
        bookTitle[bookCount] = title;
        bookAuthor[bookCount] = author;
        bookSince[bookCount] = since;
        bookLoanStat[bookCount] = true;
        bookCount++;
          taskCompleted = true;
            } else if (choice.equals("no")){
                return taskCompleted;
    }
            }
      return taskCompleted ;
  }

  public static void bookFind(
      BufferedReader buffer, String[] bookTitle, String[] bookAuthor, int bookcount,int [] bookSince,
      boolean [] bookLoanStat)
      throws IOException {
      int bookLength = 10;
      boolean found = false;
      int resultCount = 0;
      String[]  results = new String[bookcount];
    System.out.print("검색하실 내용을 입력해주세요! : ");
    String searchText = buffer.readLine();
    for (int i = 0; i < bookcount; i++) {
    if (searchText.isEmpty()) {
        errorMessage("내용");
        continue;
    }

      if ((bookTitle[i] != null && bookAuthor[i] != null) && ((bookTitle[i].contains(searchText.toUpperCase()) || bookAuthor[i].contains(searchText.toUpperCase()))) || (bookTitle[i].contains(searchText.toLowerCase()) || bookAuthor[i].contains(searchText.toLowerCase()))) {
            results[resultCount] = printBookInfo(resultCount,bookTitle[i],bookAuthor[i], bookSince[i],
                    bookLoanStat[i] );
            resultCount++;
        found = true;
      }
    }
    if (found) {
      System.out.print("검색 결과 : ");
      for(int i = 0; i < resultCount; i++) {
      System.out.println(results[i]);
      }
    } else {
        errorMessage("내용");
    }
  }

    public static boolean bookReturn(BufferedReader scan, String[] bookTitle, String[] bookAuthor, int[] bookSince,
                                  boolean[] bookLoanStat , int bookCount) throws IOException {
        boolean found = false;
        String[]  results = new String[bookCount];
        String[] bookInfoReturn = new String[3];
        String[]bookInfoReturns = inputBookInfo(scan);
        String title =  bookInfoReturns[0];
        String author =  bookInfoReturns[1];
        String since =  bookInfoReturns[2];

        for (int i = 0; i < bookCount; i++) {
        if (bookTitle[i].equals(title) || bookAuthor[i].equals(author)) {
            if (!bookLoanStat[i]) {
                System.out.println("해당 도서는 이미 반납 되었습니다.");
                return false;
            }
            bookLoanStat[i] = true;
            System.out.println("반납이 완료되었습니다.");
            found = true;
            break;
        } if(!found) {
            errorMessageLoan("반납");
        }
        }
        return found;
    }


public static boolean bookLoan(BufferedReader scan, String[] bookTitle, String[] bookAuthor, int[] bookSince,
                                boolean[] bookLoanStat , int bookCount, String[] outBookTitie) throws IOException {
    boolean found = false;
    String[]  results = new String[bookCount];
    String[] bookInfoReturn = new String[3];
    String[]bookInfoReturns = inputBookInfo(scan);
    String title =  bookInfoReturns[0];
    String author =  bookInfoReturns[1];

    for (int i = 0; i < bookCount; i++) {
        if (bookTitle[i].equals(title) || bookAuthor[i].equals(author)) {
            if (bookLoanStat[i]) {
            bookLoanStat[i] = false;;
            outBookTitie[i] = title;
            System.out.println("대출이 완료되었습니다.");
            found = true;

            } else {
                System.out.println("해당 도서는 이미 대출 되었습니다.");
                return false;
            }
            break;
        } if(!found) {
            errorMessageLoan("대출");
            continue;
        }
    }
    return found;
}

  public static void bookList(
      String[] booktitle,
      int bookcount,
      String[] bookAuthor,
      int[] bookSince,
      boolean [] bookLoanStat) {
    System.out.println(" === 현재 보관중인 도서 목록 === ");
    if (bookcount == 0) {
      errorMessage("도서");
    } else {
      for (int i = 0; i < bookcount; i++) {
        System.out.print(printBookInfo(i,booktitle[i],bookAuthor[i], bookSince[i], bookLoanStat[i]));
        System.out.println();
        if (bookLoanStat[i] == true) {
          System.out.println("대출 가능");
        } else {
            errorMessageLoan("대출");
            break;
        }
      }
    }
  }

  public static void outBookList(String[] outBookTitle,
                                 int bookcount,
                                 String[] bookAuthor,
                                 int[] bookSince,
                                 boolean [] bookLoanStat) {
    System.out.println(" === 현재 대출중인 도서 목록 === ");
    boolean hasOutBook = false;
    for (int i = 0; i < outBookTitle.length; i++) {
        if (outBookTitle[i] != null) {
      System.out.println(printBookInfo(bookcount,
              outBookTitle[i],
              bookAuthor[i],
              bookSince[i],
              bookLoanStat[i]));
      hasOutBook =true;
        }
    }
    if (!hasOutBook) {
        System.out.println("현재 대출 중인 도서가 없습니다.");
    }
        System.out.println(" ============대출 도서 목록 출력 종료===============");
  }

public static String [] inputBookInfo (BufferedReader scan) throws IOException {
while (true){
    System.out.print("도서의 제목을 입력해주세요! : ");
    String inputBookTitle = scan.readLine();

    if (inputBookTitle.equals("")) {
        errorMessage("도서");
         continue;
    }

            System.out.print("해당 도서의 저자를 입력해주세요! : ");
            String inputBookAuthor = scan.readLine();

            System.out.print("해당 도서의 출판 연도를 입력해주세요! : ");
            String inputBookSince = scan.readLine();

            if (inputBookSince.length() != 4 || !inputBookSince.matches("\\d+")) {
                errorMessage("연도");
                continue;
            }

            int inputYear = Integer.parseInt((inputBookSince));
     //            정규 표현식 사용하여 입력값 확인
     if ( inputYear < 1000 || inputYear > 9999) {
         errorMessage("연도");

         continue;
     }
            String [] result = {inputBookTitle,inputBookAuthor,inputBookSince};
    return result;
}
  }
    public static void errorMessage (String messageText) {
        System.out.println("유효하지 않은 " + messageText+ " 입니다. 유효한 " + messageText+" 을(를) 입력해주세요.");
    }
    public static void errorMessageLoan (String messageText) {
        System.out.println(messageText+ " 에 실패하였습니다. " + messageText +  " 을(를) 다시 시도해주세요.");
    }

    public static void InfoMessage(int choiceMessage) {
        String message = null;
        if (choiceMessage == 1) {
           message = " 1. 도서 등록 "
              + "\n" +  " 2. 도서 검색 (제목 또는 저자로) "
              + "\n" +  " 3. 도서 대출 / 반납 "
              + "\n" +  " 4. 전체 도서 목록 "
              + "\n" +  " 5. 대출 중인 도서 목록 "
              + "\n" +  " 0. 시스템 종료 : ";
           System.out.print(message);
        } else if (choiceMessage == 2 ){
            message = " 2. 도서 검색 (제목 또는 저자로) "
              + "\n"+ " 3. 도서 대출 / 반납 "
              + "\n"+ " 4. 전체 도서 목록 출력 "
              + "\n"+ " 5. 대출 중인 도서 목록 출력 "
              + "\n"+ " 0. 시스템 종료 : ";
            System.out.print(message);
        }
    }

public static  String printBookInfo(int bookCount, String bookTitle, String bookAuthor, int bookSince,
                                    boolean bookLoanStat){
  String printBookInfo =   "도서 순서 : " + (bookCount + 1) + " 번 책장 | 도서 제목 : " + bookTitle + " | 저자 : " + bookAuthor +
            " | 출판 연도 : " + bookSince + " | 대출 상태 : " + (bookLoanStat ? "대출 가능" : "대출 중") + " | ";
return printBookInfo;
  }

}
