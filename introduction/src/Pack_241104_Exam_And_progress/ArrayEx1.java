package Pack_241104_Exam_And_progress;


// 오케이!!

public class ArrayEx1 {
    public static void main(String[] args) {
    int [] score = {90,80,70,60,50};

    int total = 0;
        for (int i = 0; i < score.length; i++) {
            total = total + score[i];
            if (i == score.length - 1) {
                double average= (double) total / score.length;

                System.out.println("점수 총합 : " + total);
                System.out.println("점수 평균 : " + average);
            }
        }

    }
}