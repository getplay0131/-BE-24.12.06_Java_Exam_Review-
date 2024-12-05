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

package Exam_241117;
//24.11.16 진행 필요 내역 : 도서 검색 일부 검색 불가, 초기 선택지 메뉴 무한 반복 문제 >> 해결
//현재 문제 있는 기능 : 대출 및 반납 : 무한 루프 문제, 북 인덱스 문제(1권 등록하여 북 카운트가 1일 경우 대출하면 인덱스가 -1로 감소 됨] / 4번 전체 도서 목록 출력 기능 활성화 안됨 >> 완료



import java.io.*;

public class Sec01_Exam_Comment_Study {
  public static void main(String[] args) throws IOException {

    //    버퍼 리더 및 라이터 호출
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

//      무한 루프 관리 변수 설정
        boolean isRunning = true;
//        사용자가 종료를 선택하면 값이 변경되며 무한 루프를 벗어남
    while (isRunning) {
    System.out.println("=========== 도서관 관리 시스템 =============");
    System.out.println("원하시는 기능을 선택해주세요! ");
//    저장된 도서가 10권에 도달시 추가 등록 불가 안내
        if (inBookCount == maxLength-1) {
            System.out.println("안내 : 현재 등록된 도서가 10권이므로 추가 등록은 불가합니다.");
//            초기 안내 메세지에 인자를 전달하여 도서 등록 메뉴 제외 안내
            InfoMessage(2);
        } else {
//            기본 안내 메시지 연결
            InfoMessage(1);
        }
//        사용자의 입력을 받음
    int choice = Integer.parseInt(String.valueOf(scan.readLine()));

switch(choice) {
    case 1 -> {
//        도서 등록 메서드를 호출하여 결과값으로 반환될 값을 불리언 타입으로 받아 해당 값 여부에 따라 동작 설정
        boolean registResult = bookRegist(scan, bookTitle, bookAuthor, bookSince,bookLoanStat,inBookCount);
        if (registResult == true) {
            for(int i = 0; i < inBookCount; i++) {
//                도서 정보 출력 메서드에 인자를 전달하여 해당 도서 정보를 출력한다.
              System.out.println(printBookInfo(i,bookTitle[i],bookAuthor[i],bookSince[i],bookLoanStat[i]));
            }
//            도서 등록이 되었으므로 도서 권 수를 증가시킨다.
            inBookCount++;
        }
        break;
    }
    case 2 ->  {
//        도서 검색 메서드를 호출하여 인자를 전달하고, 내용을 비워 출력한다.
        bookFind(scan,bookTitle, bookAuthor, inBookCount,bookSince ,bookLoanStat);
        writer.flush();
        break;
    }
//
    case 3 -> {
//        수행 작업 입력 받아서 해당 메서드로 호출한다.
        System.out.print("대출 또는 반납 중 어떤 작업을 하시겠어요?(대출 or 반납 입력) : ");
        String taskChoice = scan.readLine();
        if (taskChoice.equals("대출")) {
        bookLoan(scan, bookTitle, bookAuthor, bookSince, bookLoanStat, inBookCount, outBookTitle );
        } else if(taskChoice.equals("반납")){
            bookReturn(scan, bookTitle,bookAuthor, bookSince,bookLoanStat, inBookCount);
        } else {
//            잘못된 값 입력시 에러 메시지 출력
            errorMessage("답변");
            continue;
        }
        break;
    }
     case 4-> {
//        도서 목록 출력 메서드 호출 및 인자 전달
         bookList(bookTitle, inBookCount, bookAuthor, bookSince, bookLoanStat);
         break;
     }
     case 5-> {
//        대출 중인 도서 목록 출력 메소드 호출 및 인자 전달
        for(int i = 0; i < inBookCount; i++) {
         outBookList(outBookTitle, inBookCount, bookAuthor, bookSince, bookLoanStat);
        }
         break;
     }
//     프로그램 종료 선택시 루프 조건 값 변경 및 메시지 출력
     case 0 -> {
         System.out.println("시스템 종료를 선택하시어, 시스템이 종료됩니다.");
         isRunning = false;
          break;
     }
    default -> {
//        다른 값 입력시 메시지 출력
        System.out.println("기능을 선택해주세요!");
          break;
    }
        }
    }
//    라이터를 종료시킨다.
    writer.close();
  }

//  도서 등록 메서드
  public static boolean bookRegist(BufferedReader buffer, String [] bookTitle, String[] bookAuthor, int[] bookSince,
   boolean[] bookLoanStat, int bookCount                                ) throws IOException {
//    최대 도서 등록 권수 설정
      int bookLength = 10;
//    int arrayCount = 10;
//      메소드 수행 작업 판단 여부를 위한 변수 설정
    boolean taskCompleted = false;
          int bookSinceYear = 0;
//          도서 등록 메시지의 값을 리턴 받기 위해 배열 선언
            String[] bookInfoReturn = new String[3];

//            수행 작업이 정상적으로 수행이 안되면 다시 진행을 한다.
    while (taskCompleted == false) {
            System.out.print("도서 등록을 진행할까요? (yes or no) : ");
            String choice = buffer.readLine();
            if (choice.equals("yes")){
//                등록된 도서가 최대 등록 권수 이상이면 작업 수행 여부를 반환후 메소드 종료
    if (bookCount >= bookLength) {
    System.out.println("최대 등록 가능한 권수에 도달하여 등록이 불가합니다.");
    return taskCompleted;
    }

//    도서 정보를 입력받는 메서드의 반환값을 저장하기 위해 배열 선언
            String[]bookInfoReturns = inputBookInfo(buffer);
//    값 값을 변수에 저장한다.
    String title = bookInfoReturns[0];
    String author = bookInfoReturns[1];
    int since = Integer.parseInt(bookInfoReturns[2]);


//        중복 여부 확인
        boolean isDuplicate = false;
        for(int k = 0; k < bookCount; k++) {
//            도서의 제목 중 입력받은 값 이 있으면 중복으로 처리하여 등록 작업을 중지시킨다.
            if (bookTitle[k].equals(bookInfoReturn[0])) {
                errorMessage("도서");
                isDuplicate = true; //중복 플래그 설정
                break; // 루프 탈출
            }
        }
//        중복 여부에 대해 참이면 다시 처음으로 돌아가 다시 작업을 수행한다.
        if (isDuplicate) {
            continue;
        }
//        값이 비거나 입력 연도가 0이면 도서 대출 여부에 대해 불가를 설정하고 작업 수행 여부를 반환한다.
          if ( title.isEmpty() && author.isEmpty() && since == 0) {
              bookLoanStat[bookCount-1] = false;
              return taskCompleted;
          }

          //도서 정보를 각 배열에 저장하고, 대출 여부도 대출 가능 여부로 설정 후 등록된 도서 수를 증가시키고 작업 수행 여부를 가능으로 설정한다.
        bookTitle[bookCount] = title;
        bookAuthor[bookCount] = author;
        bookSince[bookCount] = since;
        bookLoanStat[bookCount] = true;
        bookCount++;
          taskCompleted = true;
//          만약 작업 여부에 관해 답변이 no일 경우에 값을 반환하고 메서드를 종료한다.
            } else if (choice.equals("no")){
                return taskCompleted;
    }
            }
      return taskCompleted ;
  }

//  도서 검색 메서드
  public static void bookFind(
      BufferedReader buffer, String[] bookTitle, String[] bookAuthor, int bookcount,int [] bookSince,
      boolean [] bookLoanStat)
      throws IOException {
//      도서 검색 결과를 저장할 배열 선언 후 검색 결과를 카운트 할 변수를 선언한다.
//      도서 등록 메서드의 작업 수행여부를 판단할 변수처럼 수행 작업을 판단할 변수를 선언한다.
      int bookLength = 10;
      boolean found = false;
      int resultCount = 0;
      String[]  results = new String[bookcount];
    System.out.print("검색하실 내용을 입력해주세요! : ");
    String searchText = buffer.readLine();
    for (int i = 0; i < bookcount; i++) {
//        값이 비어 있다면 에러 메시지 출력
    if (searchText.isEmpty()) {
        errorMessage("내용");
        continue;
    }

//    만약 도서 정보가 값이 있고, 해당 값이 검색 문자를 대문자 혹은 소문자로 변환한 값과 일부라도 일치하면 해당 값을 결과 배열에 결과 개수의 카운트 개수만큼 인덱스로 지정하여 결과를 저장한다.
      if ((bookTitle[i] != null && bookAuthor[i] != null) && ((bookTitle[i].contains(searchText.toUpperCase()) || bookAuthor[i].contains(searchText.toUpperCase()))) || (bookTitle[i].contains(searchText.toLowerCase()) || bookAuthor[i].contains(searchText.toLowerCase()))) {
            results[resultCount] = printBookInfo(resultCount,bookTitle[i],bookAuthor[i], bookSince[i],
                    bookLoanStat[i] );
//            결과를 담을 개수를 증가시킨다.
            resultCount++;
//            검색 결과를 참으로 설정한다.
        found = true;
      }
    }
//    정보를 찾으면 해당 정보를 출력한다.
    if (found) {
      System.out.print("검색 결과 : ");
      for(int i = 0; i < resultCount; i++) {
      System.out.println(results[i]);
      }
    } else {
        errorMessage("내용");
    }
  }

//  도서 반납 메소드
    public static boolean bookReturn(BufferedReader scan, String[] bookTitle, String[] bookAuthor, int[] bookSince,
                                  boolean[] bookLoanStat , int bookCount) throws IOException {
//      작업에 사용할 배열 및 변수를 설정한다.
        boolean found = false;
        String[]  results = new String[bookCount];
        String[] bookInfoReturn = new String[3];
        String[]bookInfoReturns = inputBookInfo(scan);
        String title =  bookInfoReturns[0];
        String author =  bookInfoReturns[1];
        String since =  bookInfoReturns[2];

//        입력값과 기존의 값을 비교 후 일치한다면, 이미 반납 작업이 진행된 것이므로 메시지를 출력후 리턴을 사용하여 메소드를 종료한다
        for (int i = 0; i < bookCount; i++) {
        if (bookTitle[i].equals(title) || bookAuthor[i].equals(author)) {
//            만약 반납 상태가 이미 반납 되었다면 메시지 출력 후 메소드를 종료한다.
            if (!bookLoanStat[i]) {
                System.out.println("해당 도서는 이미 반납 되었습니다.");
                return false;
            }

//           기존 도서 정보를 반납으로 설정 후 메시지를 출력하고, 검색 여부에대해 참으로 값을 설정 후 반복을 중지한다.
            bookLoanStat[i] = true;
            System.out.println("반납이 완료되었습니다.");
            found = true;
            break;
//            만약 검색 여부가 거짓이라면, 에러 메시지 출력한다.
        } if(!found) {
            errorMessageLoan("반납");
        }
        }
        return found;
    }


//    도서 대출 메서드
public static boolean bookLoan(BufferedReader scan, String[] bookTitle, String[] bookAuthor, int[] bookSince,
                                boolean[] bookLoanStat , int bookCount, String[] outBookTitie) throws IOException {
//      기본 배열 및 변수 설정
    boolean found = false;
    String[]  results = new String[bookCount];
    String[] bookInfoReturn = new String[3];
    String[]bookInfoReturns = inputBookInfo(scan);
    String title =  bookInfoReturns[0];
    String author =  bookInfoReturns[1];

//  반복문 이용하여 있는 도서 정보에 입력 받은 값이 있다면
    for (int i = 0; i < bookCount; i++) {
        if (bookTitle[i].equals(title) || bookAuthor[i].equals(author)) {
//            만약 대출 가능 여부가 가능이면
            if (bookLoanStat[i]) {
//                대출 가능 여부를 불가로 설정한다.
            bookLoanStat[i] = false;;
//            대출 도서 목록에 입력받은 도서를 추가한다.
            outBookTitie[i] = title;
            System.out.println("대출이 완료되었습니다.");
//            검색 여부에 관해 참으로 설정한다.
            found = true;
            } else {
//                민약 대출 가능 여부가 불가면 메시지 출력후 메서드를 종료한다.
                System.out.println("해당 도서는 이미 대출 되었습니다.");
                return false;
            }
            break;
//            만약 검색 여부가 거짓이면 메시지를 출력한다.
        } if(!found) {
            errorMessageLoan("대출");
            continue;
        }
    }
    return found;
}

//도서 목록 출력 메서드
  public static void bookList(
      String[] booktitle,
      int bookcount,
      String[] bookAuthor,
      int[] bookSince,
      boolean [] bookLoanStat) {
    System.out.println(" === 현재 보관중인 도서 목록 === ");
//    만약도서 등록 권수가 0권이라면
    if (bookcount == 0) {
//        메시지 출력
      errorMessage("도서");
    } else {
//        반복문 이용 도서 정보를 출력한다.
      for (int i = 0; i < bookcount; i++) {
//          도서 정보 출력 메서드를 호출하여 인자를 전달하여 출력하고 다음 줄을 공백으로 하여 가독성을 향상시킨다.
        System.out.print(printBookInfo(i,booktitle[i],bookAuthor[i], bookSince[i], bookLoanStat[i]));
        System.out.println();
//        만약 대출 가능 여부가 가능이라면 메시지를 출력하고, 아니라면 에러메시지 출력
        if (bookLoanStat[i] == true) {
          System.out.println("대출 가능");
        } else {
            errorMessageLoan("대출");
            break;
        }
      }
    }
  }

//  대출 도서 목록 출력
  public static void outBookList(String[] outBookTitle,
                                 int bookcount,
                                 String[] bookAuthor,
                                 int[] bookSince,
                                 boolean [] bookLoanStat) {
    System.out.println(" === 현재 대출중인 도서 목록 === ");
//    해당 도서가 대출 여부인지를 확인한다.
    boolean hasOutBook = false;
//    반복문을 이용 대출 도서 목록의 길미만큼 반복 작업한다.
    for (int i = 0; i < outBookTitle.length; i++) {
//        대출중인 도서 목록이 값이 없는 것만 추력하기 위해 조건문을 사용하여
        if (outBookTitle[i] != null) {
//            도서 정보 출력 메서드에 값을 전달하여 출력하고, 도서에 대출여부에 관해 대출인걸로 세팅한다.
      System.out.println(printBookInfo(bookcount,
              outBookTitle[i],
              bookAuthor[i],
              bookSince[i],
              bookLoanStat[i]));
      hasOutBook =true;
        }
    }
//    대출 여부가 거짓이면 메시지를 출력하여 안내한다.
    if (!hasOutBook) {
        System.out.println("현재 대출 중인 도서가 없습니다.");
    }
        System.out.println(" ============대출 도서 목록 출력 종료===============");
  }

//  도서 정보를 입력받을 메소드 설정
public static String [] inputBookInfo (BufferedReader scan) throws IOException {
while (true){
    System.out.print("도서의 제목을 입력해주세요! : ");
    String inputBookTitle = scan.readLine();

//    만약 도서 제목을 입력받는게 공백이면 안내 메시지를 띄운다
    if (inputBookTitle.equals("")) {
        errorMessage("도서");
         continue;
    }

//    정보 입력받아 변수에 저장
            System.out.print("해당 도서의 저자를 입력해주세요! : ");
            String inputBookAuthor = scan.readLine();

            System.out.print("해당 도서의 출판 연도를 입력해주세요! : ");
            String inputBookSince = scan.readLine();

//            조건문을 사용하여 받은 연도가 4자리가 아니거나 숫자가 아니면 에러 메시지를 출력한다.
            if (inputBookSince.length() != 4 || !inputBookSince.matches("\\d+")) {
                errorMessage("연도");
                continue;
            }

//            입력받은 값을 숫자형 값으로 바꾸어서 변수에 저장한다.
            int inputYear = Integer.parseInt((inputBookSince));
     //            정수형 값이 해당 값을 벗어나면 에러메시지를 출력한다.
     if ( inputYear < 1000 || inputYear > 9999) {
         errorMessage("연도");

         continue;
     }
//     스트링형 변수를 선언하여 해당 값에 변경한 값을 저장하여 반환한다.
            String [] result = {inputBookTitle,inputBookAuthor,inputBookSince};
    return result;
}
  }
//  에러메시지 메소드
    public static void errorMessage (String messageText) {
        System.out.println("유효하지 않은 " + messageText+ " 입니다. 유효한 " + messageText+" 을(를) 입력해주세요.");
    }

//    대출용 오류 메시지 메서드 선언
    public static void errorMessageLoan (String messageText) {
        System.out.println(messageText+ " 에 실패하였습니다. " + messageText +  " 을(를) 다시 시도해주세요.");
    }

//    초기 안내용 메시지 출력
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

//    도서 정보 출력 메서드
public static  String printBookInfo(int bookCount, String bookTitle, String bookAuthor, int bookSince,
                                    boolean bookLoanStat){
  String printBookInfo =   "도서 순서 : " + (bookCount + 1) + " 번 책장 | 도서 제목 : " + bookTitle + " | 저자 : " + bookAuthor +
            " | 출판 연도 : " + bookSince + " | 대출 상태 : " + (bookLoanStat ? "대출 가능" : "대출 중") + " | ";
return printBookInfo;
  }

}
