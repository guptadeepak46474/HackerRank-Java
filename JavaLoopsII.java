import java.util.*;
import java.lang.Math;

public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = a;
            for(int k = 0; k < n; k++) {
                sum += (Math.pow(2,k))*b; 
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        in.close();
    }
}