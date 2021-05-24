import java.util.*;

class Add {
    int n1, n2, n3, n4, n5, n6;
    void add(int n1, int n2) {
        System.out.println(n1 + "+" + n2 + "=" + (n1+n2));
    }
    void add(int n1, int n2, int n3) {
        System.out.println(n1 + "+" + n2 + "+" + n3 + "=" + (n1+n2+n3));
    }
    void add(int n1, int n2, int n3, int n4, int n5) {
        System.out.println(n1 + "+" + n2 + "+" + n3  + "+" + n4 + "+"  + n5 + "=" + (n1+n2+n3+n4+n5));
    }
    void add(int n1, int n2, int n3, int n4, int n5, int n6) {
        System.out.println(n1 + "+" + n2 + "+"  + n3 + "+" +  n4 + "+"  + n5 + "+"  + n6 + "=" + (n1+n2+n3+n4+n5+n6));
    }
}

public class JavaVarargs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < 6; i++) {
            arr.add(Integer.parseInt(sc.next()));
            
        }
        sc.close();
        Add ob = new Add();
        ob.add(arr.get(0), arr.get(1));
        ob.add(arr.get(0), arr.get(1), arr.get(2));
        ob.add(arr.get(0), arr.get(1), arr.get(2), arr.get(3), arr.get(4));
        ob.add(arr.get(0), arr.get(1), arr.get(2), arr.get(3), arr.get(4), arr.get(5));
    }
}