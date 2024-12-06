package Exam_241206.bank.domain;

public class AccountManager {
    private Account[] accounts = new Account[10]; // 최대 10개 계좌 관리
    private int accountCount = 0;

    public void addAccount(Account account) {
        // 배열에 계좌 추가
//        for (int i = 0; i < accountCount; i++) {
//            accounts[accountCount] = account;
//        }
        // 고려해야 할 것들:
// 1. 배열에 추가할 때는 반복문이 필요없음 (왜냐하면 한번에 하나씩만 추가하니까)
// 2. accountCount는 현재 저장된 계좌의 개수이자, 다음 계좌가 저장될 위치
// 3. 배열이 꽉 찼는지 체크 필요 (accounts.length와 비교)

//        =========================
        // 1. 계좌가 추가되었다는 성공 메시지도 있으면 좋음
// 2. 이미 동일한 계좌가 있는지 체크하는 로직도 고려
// 3. accountCount 증가 전에 account null 체크하는게 더 안전
        if (accountCount >= accounts.length) {
            System.out.println("등록 가능한 최대 계좌 개수에 도달하였습니다.");
            return;
        }
            if (accounts[accountCount] != account) {
        accounts[accountCount] = account;
        if (account != null) {
        accountCount++;
            System.out.println("계좌 추가가 성공하였습니다.");
            }
        }
    }

    public Account findAccount(String accountNumber) {
        // 계좌번호로 계좌 찾기
//        Account inputAccount = new Account(accountNumber, 0);
//        if (accountNumber != null) {
//            for (int i = 0; i < accounts.length; i++) {
//        if (accountNumber.equals(accounts[i])) {
//            System.out.println("검색하신 내용과 일치하는 계좌번호를 찾았습니다. " + accounts[i]);
//        }
//            }
//        }
//        return inputAccount;

        // 주의할 점들:
// 1. 계좌번호(String)와 Account 객체는 다른 타입이므로 직접 비교 불가
// 2. 새로운 Account 객체를 만들 필요 없음
// 3. null 체크 필요
// 4. 계좌번호 비교시 equals() 메서드 사용해야 함
// 5. 찾지 못했을 때의 처리도 고려 >> 모르겠음

//        ==========================


        if (accountNumber != null) {
               String okMsg = "검색하신 내용과 일치하는 계좌번호를 찾았습니다. ";
               String failMsg = "검색 내용과 일치하는 내용을 찾을 수 없습니다.";
            for (int i = 0; i < accounts.length; i++) {
            if (String.valueOf(accountNumber).equals(accounts[i])) {
                System.out.println(okMsg + accounts[i]);
            } else if (String.valueOf(accountNumber).isEmpty()) {

                System.out.println(failMsg);
            }
            }
        }
    }
}