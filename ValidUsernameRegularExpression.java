import java.util.Scanner;
import java.util.regex.*;

public class ValidUsernameRegularExpression {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            Pattern pat = Pattern.compile("^[[A-Z]|[a-z]][[A-Z]|[a-z]|\\d|[_]]{7,29}$");
            Matcher mat = pat.matcher(userName);
            boolean found = mat.matches();

            if(found)
                System.out.println("Valid");
            else
                System.out.println("Invalid");
        }
    }
}