import java.util.*;

public class JavaList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }
        int k = sc.nextInt();
        for(int i = 0; i < k; i++) {
            String str = sc.next();
            if(str.equals("Insert")) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                al.add(a, b);
            } else if(str.equals("Delete")) {
                al.remove(sc.nextInt());
            }
        }
        for(int i : al)
            System.out.print(i + " ");
        sc.close();
    }
}