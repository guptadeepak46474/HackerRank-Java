import java.util.*;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\\Z");
        String s = scan.next().trim();
        scan.close();
        if(s.length() > 0) {
            String[] tokens = s.split("[!,?._'@\\s]+");
            System.out.println(tokens.length);
            for(String str : tokens)
                System.out.println(str);
        } else {
            System.out.println(0);
        }
    }
}
