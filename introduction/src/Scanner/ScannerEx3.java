package Scanner;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        문제 - 음식점 주문
//사용자로부터 음식의 이름( foodName ), 가격( foodPrice ), 그리고 수량( foodQuantity )을 입력받아, 주문 한 음식의 총 가격을 계산하고 출력하는 프로그램을 작성하세요.
//음식의 총 가격을 계산하세요. 총 가격은 각 음식의 가격( foodPrice )과 수량( foodQuantity )을 곱한 값이 며, 이를 totalPrice 라는 이름의 변수에 저장하세요.
//주문 정보와 총 가격을 출력하세요. 출력 형태는 "[음식 이름] [수량]개를 주문하셨습니다. 총 가격은 [총 가격]원 입니다." 이어야 합니다.

                System.out.println("어서오십시오!");
            while (true) {
                System.out.print("필요하신게 있으시면, 언제든지 호출 이라고 입력해주세요 :) :");
                String call = scan.nextLine();
                if (call.equals("호출")) {
                    System.out.print("무엇을 도와드릴까요? :");
                    String service = scan.nextLine();
                    if (service.equals("주문")) {
                        System.out.print("무슨 메뉴를 드릴까요?");
                        String foodName = scan.nextLine();
                        System.out.print("메뉴의 가격을 확인하겠습니다. 얼마인가요?");
                        int foodPrice = scan.nextInt();
                        System.out.print("몇 개 주문 하시겠습니까? ");
                        int foodQuantity = scan.nextInt();
                        scan.nextLine();
                        System.out.println("주문하신 상품은 " + foodName + " 이고, 가격은" + foodPrice + " 이며, 수량은 " + foodQuantity +
                                "입니다!" +
                                " 준비되는 되로 제공해드리겠습니다.");
                        int totalPrice = foodPrice * foodQuantity;
                        System.out.println("결제하실 금액은 " + totalPrice + "입니다. ");
                    }
                    if (service.equals("계산")) {
                        System.out.println("이용해 주셔서 감사드립니다.");
                        break;
                    }
                }
            }
            }
            }