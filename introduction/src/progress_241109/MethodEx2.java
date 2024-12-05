package progress_241109;

public class MethodEx2 {
    public static void main(String[] args) {
    String message = " Hello, world! ";
    printMessage(message, 3);
    printMessage(message, 5);
    printMessage(message, 7);
    }

    public static void printMessage(String msg, int loop) {
        for (int i = 0; i < loop; i++) {
            System.out.println(msg);
        }
        System.out.println(" ================= ");
    }
    }
