package cond;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 5 ;
        int discount = 0;

        if (price >= 10000) {
            discount += 1000;
            System.out.println("상품 가격이 " + price+ "원 이기에 " + discount + "만큼 할인이 추가되었습니다!");

        } else if(age <= 10) {
            discount += 1000;

            System.out.println("고객님의 나이가 " + age + "이시기에 " + discount + "만큼 할인이 추가되었습니다!");

        } else {
            System.out.println("할인 적용이 없습니다. 다음 기회에 할인 받아 보세요!");
        }
        System.out.println("총 "+ discount + "할인이 적용되었습니다!");
    }
}
