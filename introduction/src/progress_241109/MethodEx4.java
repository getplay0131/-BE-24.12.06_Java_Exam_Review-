package progress_241109;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
    // 선택을 입력 받기
            int currentMoney = 0;
        while (true) {
            Scanner scan = new Scanner(System.in);
            int choiceNum = 0;
            System.out.println(" ========================================= ");
            System.out.println("1. 입금  | 2. 출금  | 3. 잔액 확인  | 4. 종료");
            System.out.println(" ========================================= ");
            System.out.print("선택 : ");
            int choice = Integer.parseInt(scan.nextLine());

            int inMoney ;
        if (choice == 1) {
            System.out.print("입금액을 입력하세요 : ");
            inMoney = scan.nextInt();
            currentMoney = inPrice(currentMoney,inMoney );
            continue;
        } else if (choice == 2) {
            System.out.print("출금액을 입력하세요 : ");
            int outPrice = scan.nextInt();
            currentMoney = outPrice(currentMoney, outPrice);
        } else if (choice == 3) {
            System.out.println("현재 잔액 : " + currentMoney + "원");
        } else if (choice == 4) {
            System.out.println("시스템을 종료합니다");
            break;
        } else {
            System.out.println("기능을 선택해 주세요!");
            continue;
        }
        }
    }

    public static int inPrice(int currentPrice, int inprice){
        currentPrice += inprice;
        System.out.println(inprice + "원을 입금하였습니다. 현재 잔액 : " + currentPrice + "원");
        return currentPrice;
    }

    public static int outPrice(int currentPrice, int outprice) {
        if (currentPrice >= outprice) {
            currentPrice -= outprice;
            System.out.println(outprice + "원을 출금하였습니다. 현재 잔액 : " + currentPrice + "원");
//        return currentPrice;
        } else {
            System.out.println(outprice + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return currentPrice;
    }
}