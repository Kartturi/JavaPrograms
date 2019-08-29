import java.util.ArrayList;

public class Main {

    public static String Primes(int lst) {
        String result = "";
        for (int fac = 2; fac <= lst; ++fac) {
            int count;
            for (count = 0; lst % fac == 0; ++count) {

                lst /= fac;
            }
            if (count > 0) {
                System.out.println(fac);
                System.out.println(count);
                result += "(" + fac + (count > 1 ? "**" + count : "") + ")";
            }
        }
        return result;
   }

    public static void main(String[] args) {


        System.out.println(Primes(1200));
    }
}
