import java.util.*;

public class JavaAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();
        
        char[] aa = a.toLowerCase().toCharArray();
        char[] bb = b.toLowerCase().toCharArray();

        Arrays.sort(aa);
        Arrays.sort(bb);
        System.out.println(Arrays.equals(aa, bb) ? "Anagrams" : "Not Anagrams");
    }
}