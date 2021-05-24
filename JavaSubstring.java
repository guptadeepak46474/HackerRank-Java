import java.util.*;

public class JavaSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();
        System.out.println(str.substring(start, end));
    }
}