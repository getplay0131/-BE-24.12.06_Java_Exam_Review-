package variable;

public class Var8 {
    public static void main(String[] args) {
        byte a = 127 ; //-128 ~ 127
        short b = 32767 ; //32768 ~ 32767
        int c =2147483647; //약 20억

        long d = 9223372036854775807L;

        //실수
        float e = 10.0f;
        double f = 10.0;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
