package Pack_241104_Exam_And_progress;

public class ArreuRef1 {
    public static void main(String[] args) {
        int score = 100;
        int [] students;
        students = new int[5];

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;



        System.out.println("학생 1 점수 : " + students[0]);
        System.out.println("학생 2 점수 : " + students[1]);
        System.out.println("학생 3 점수 : " + students[2]);
        System.out.println("학생 4 점수 : " + students[3]);
        System.out.println("학생 5 점수 : " + students[4]);
        System.out.println(students);
//        int i = 10;
//        for (i = 0; i <= 9 ; i++) {
//            students[i] = score;
//            if (i == 3) {
//                score = 77;
//                System.out.println("학생 " + (i) + "점수 : " + score);
//            } else {
//            System.out.println("학생 " + (i+1) + "점수 : " + score );
//            }
//            score = score - 10;
//        }
    }
}
