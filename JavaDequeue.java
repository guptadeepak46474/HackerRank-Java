import java.util.*;

public class JavaDequeue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();

        int n = sc.nextInt();
        int k = sc.nextInt();
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            int input = sc.nextInt();
            deque.add(input);
            set.add(input);

            if(deque.size() == k) {
                if(set.size() > max)
                    max = set.size();
                int first = deque.remove();
                if(!deque.contains(first) )
                    set.remove(first);
            }
        }
        sc.close();
        System.out.println(max);
    }
}