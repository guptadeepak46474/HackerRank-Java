import java.util.*;
abstract class BookClass{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
	
}

class MyBookClass extends BookClass{
    void setTitle(String s) {
        this.title = s;
    }
}

public class JavaAbstractClass{
	
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBookClass new_novel=new MyBookClass();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
		
	}
}