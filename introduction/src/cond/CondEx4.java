package cond;

public class CondEx4 {
    public static void main(String[] args) {
        double rating = 7;

        if (rating <= 9 ) {
            System.out.println("추천 : 어바웃타임 ");
        } if (rating <= 8) {
            System.out.println("추천 : 토이 스토리 ");

        } if (rating <= 7 ){
            System.out.println("추천 : 고질라 ");

        }
    }
}

//else if와 if 사용 상황 판단하기