package progress_241109;

public class Methodvalue1 {
    public static void main(String[] args) {
    int num1 = 5;
                System.out.println("1. changeNumber 호출 전, num1: " + num1); //num1 = 5
                changeNumber(num1);
                System.out.println("4. changeNumber 호출 전, num1: " + num1); // num1 = 5
            }

            public static void changeNumber(int num2){
                System.out.println("2. changeNumber 호출 전, num2: " + num2); //num2 = 5 num1 값을 복사하여 저장했기 때문에
                num2 = num2 * 2; // num2 = 10
                System.out.println("3. changeNumber 호출 전, num2: " + num2); //num2 = 10
//        결과 5 5 10 5
            }


    //        System.out.println("1. changeNumber 호출 전, num1: " + num1); //num1 = 5
//        num1 = changeNumber(num1);
//        System.out.println("4. changeNumber 호출 전, num1: " + num1); // num1 = 5
//    }
//
//    public static int changeNumber(int num2){
//        System.out.println("2. changeNumber 호출 전, num2: " + num2); //num2 = 5 num1 값을 복사하여 저장했기 때문에
//        num2 = num2 * 2; // num2 = 10
//        System.out.println("3. changeNumber 호출 전, num2: " + num2); //num2 = 10
//        return num2;
//        결과 5 5 10 5
    }
