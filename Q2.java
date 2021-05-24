import java.util.*;

public class Q2 {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(n-- > 0) {
            arr.add(sc.nextInt());
        }
        sc.close();
        int a = 0, b = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) % 2 == 0) {
                int rem = arr.remove(i);
                a += rem;
                Collections.reverse(arr);
                System.out.println("a: " + a);
            } else{
                int rem = arr.remove(i);
                b += rem;
                System.out.println("b: " + a);
            }
        }
        int sum = a - b;
        System.out.println(sum);
    }
}