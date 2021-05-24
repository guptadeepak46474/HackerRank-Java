import java.util.*;

interface Check {
    boolean test(int x);
}

public class JavaLambdaExpressions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Check isOdd = (x) -> {
            if(x % 2 == 1)
                return true;
            else
                return false;
        };
        Check isPrime = (x) -> {
            boolean flag = true;
            for(int i = 2; i < x; i++) {
                if(x % i == 0)
                    flag = false;
            }
            return flag;
        };
        Check isPalindrome = (x) -> {
            int temp = x, sum = 0, rem;
            while(x != 0) {
                rem = x % 10;
                sum = sum * 10 + rem;
                x /= 10;
            }
            if(sum == temp)
                return true;
            else
                return false;
        };

        while(n-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == 1) {
                if(isOdd.test(b))
                    System.out.println("ODD");
                else
                    System.out.println("EVEN");
            } else if (a == 2) {
                if(isPrime.test(b))
                    System.out.println("PRIME");
                else
                    System.out.println("COMPOSITE");
            } else if(a == 3) {
                if(isPalindrome.test(b))
                    System.out.println("PALINDROME");
                else
                    System.out.println("NOT PALINDROME");
            }
        }
        sc.close();
    }
}