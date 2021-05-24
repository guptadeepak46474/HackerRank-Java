import java.util.*;

public class JavaPrimalityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextBigInteger().isProbablePrime(100) ? "prime" : "not prime");
        sc.close();
    }
}