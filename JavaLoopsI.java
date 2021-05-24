import java.util.*;

public class JavaLoopsI {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        for(int i = 1; i <= 10; i++) {
            int mul = 1;
            mul = N * i;
            System.out.println(N + " x " + i + " = " + mul);
        }
        scanner.close();
    }
}