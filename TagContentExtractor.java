import java.util.*;
import java.util.regex.*;

public class TagContentExtractor{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
            Pattern pat = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher mat = pat.matcher(line);
            boolean found = false;

            while(mat.find()) {
                System.out.println(mat.group(2));
                found = true;
            }
            if(!found) 
                System.out.println("None");
			testCases--;
		}
        in.close();
	}
}