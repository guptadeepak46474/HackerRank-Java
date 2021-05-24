import java.util.Scanner;

public class JavaStaticInitializerBlock {
    static Scanner scan = new Scanner(System.in);
    static int a = scan.nextInt();
    static int b = scan.nextInt();
    static boolean flag = true;
    static {
        try {
            if(a <= 0 || b <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        if(flag)
            System.out.println((a*b));
    }
}