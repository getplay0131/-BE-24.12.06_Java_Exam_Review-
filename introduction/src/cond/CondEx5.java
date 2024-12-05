package cond;

public class CondEx5 {
    public static void main(String[] args) {
        String grade = "C";

    switch (grade) {
        case "A" -> System.out.println("탁월한 성과입니다.");
        case "B" -> System.out.println("좋은 성과입니다");
        case "C" -> System.out.println("준수한 성과입니다.");
        case "D" -> System.out.println("향상이 필요합니다.");
        case "F" -> System.out.println("불합격입니다.");
        default -> System.out.println("잘못된 학점입니다.");
    }
    }


        //        if (grade.equals("A")) {
//            System.out.println("탁월한 성과입니다!");
//        } else if (grade.equals(("B"))) {
//            System.out.println("좋은 성과입니다!");
//
//        } else if (grade.equals("C")) {
//            System.out.println("준수한 성과입니다!");
//
//        } else if (grade.equals("D")) {
//            System.out.println("향상이 필요합니다!");
//
//        } else if (grade.equals("F")) {
//            System.out.println("불합격입니다!");
//
//        } else {
//            System.out.println("잘못된 학점입니다.");
//        }
//    }
}
