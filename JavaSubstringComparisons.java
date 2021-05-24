import java.util.*;

public class JavaSubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        SortedSet<String> sets = new TreeSet<>();
        for(int i = 0; i <= s.length()-k; i++) {
            sets.add(s.substring(i, i+k));
        }
        return sets.first() + "\n" + sets.last();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        sc.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}