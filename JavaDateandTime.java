import java.util.Scanner;
import java.time.LocalDate;

public class JavaDateandTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mm = sc.nextInt();
        int dd = sc.nextInt();
        int yy = sc.nextInt();
        sc.close();
        LocalDate date = LocalDate.of(yy, mm, dd);
        System.out.println(date.getDayOfWeek());
    }
    
}