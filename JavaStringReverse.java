import java.util.*;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString().equals(str) ? "Yes" : "No");
    }
}