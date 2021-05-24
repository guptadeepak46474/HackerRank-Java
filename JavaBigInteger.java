import java.math.BigInteger;
import java.util.*;

public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        sc.close();
        BigInteger add = a.add(b);
        BigInteger multiply = a.multiply(b);
        System.out.println(add + "\n" + multiply);
    }
}