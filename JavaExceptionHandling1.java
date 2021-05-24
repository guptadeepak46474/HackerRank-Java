import java.util.Scanner;
class MyCalculator1 {

    public long power(int a, int b) throws Exception {
        if(a == 0 && b == 0) {
            throw new Exception("n and p should not be zero.");
        }
        if(a < 0 || b < 0) {
            throw new Exception("n or p should not be negative.");
        }
        return (int) Math.pow(a, b);
    }
}

public class JavaExceptionHandling1 {
    public static final MyCalculator1 my_calculator = new MyCalculator1();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}