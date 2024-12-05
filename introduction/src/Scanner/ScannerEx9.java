package Scanner;

import java.util.Scanner;

public class ScannerEx9 {
    public static void main(String[] args) {
//사용자로부터 상품 정보(상품명, 가격, 수량)를 입력받고, 이들의 총 가격을 출력하는 프로그램을 작성하세요. 사 용자는 여러 상품을 추가하고 결제할 수 있으며, 프로그램을 언제든지 종료할 수 있습니다.
//사용자에게 다음 세 가지 옵션을 제공해야 합니다: 1: 상품 입력, 2: 결제, 3: 프로그램 종료. 옵션은 정수로 입력받 으며, 옵션을 저장하는 변수의 이름은 option 이어야 합니다.
//상품 입력 옵션을 선택하면, 사용자에게 상품명과 가격, 수량을 입력받으세요.
//결제 옵션을 선택하면, 총 비용을 출력하고 총 비용을 0 으로 초기화하세요. (사용자가 총 비용을 확인하고, 결제 를 완료했다고 가정합니다. 따라서 다음 사용자를 위해 총 비용을 다시 0 으로 초기화 해야합니다.)
//프로그램 종료 옵션을 선택하면, "프로그램을 종료합니다."라는 메시지를 출력하고 프로그램을 종료하세요. 위의 세 가지 옵션 외에 다른 값을 입력하면, "올바른 옵션을 선택해주세요."라는 메시지를 출력하세요.

//        실행 결과 예시
//        1: 상품 입력, 2: 결제, 3: 프로그램 종료
//1
//상품명을 입력하세요: 스프링
//상품의 가격을 입력하세요: 30000
//구매 수량을 입력하세요: 1
//상품명:스프링 가격:30000 수량:1 합계:30000

        
//        1차 개선 변수명 수정 및 총 가격 결제시 초기화 진행 및 잘못된 옵션선택시 재선택 요청
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int totalCost = 0;
        while (true) {
//        상품정보 = 상품명, 가격, 수량 입력받기
            System.out.println("1: 상품 입력 ");
            System.out.println("2: 결제. ");
            System.out.println("3: 프로그램 종료");
            int option = Integer.parseInt(scan.nextLine());

            if (option == 1) {
                System.out.println("1번 상품 입력을 선택하셨습니다.");
                System.out.print("상품명을 입력하세요 : ");
                String product = scan.nextLine();
                System.out.print("상품의 가격을 입력하세요: ");
                int price = Integer.parseInt(scan.nextLine());
                System.out.print("수량을 입력하세요: ");
                int quantity = Integer.parseInt(scan.nextLine());
                sum = price * quantity;
                System.out.println("상품명 : " + product + " 가격 : " + price + " 합계 : " + sum + "원");
                totalCost += sum;
                System.out.println(" ===== 상품 입력이 종료 되었습니다. =====");
            } else if (option == 2) {
                System.out.println("2번 결제를 선택하셨습니다.");
                System.out.println("총 비용 : " + totalCost + "원");
                totalCost = 0;
                System.out.println(" ===== 결제가 완료 되었습니다. =====");

            } else if (option == 3) {
                System.out.println("3번 프로그램 종료를 선택하셨습니다.");
                System.out.println(" ===== 프로그램 종료가 선택되어 프로그램을 종료합니다. =====");
                break;
            } else {
                System.out.println("올바른 기능을 선택하여 주세요!");
                System.out.println("기능 선택 화면으로 돌아갑니다.");
                System.out.println("==========================");
            }
        }
    }
}