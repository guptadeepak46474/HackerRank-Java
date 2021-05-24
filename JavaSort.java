import java.util.*;

class Studentmarks {
    int id;
    String fname;
    double cgpa;
    Studentmarks(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
     }
     public String getFname() {
        return fname;
     }
     public double getCgpa() {
        return cgpa;
     }
}

public class JavaSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Studentmarks> studentlist = new ArrayList<Studentmarks>();

        while(n-- > 0) {
            int id = sc.nextInt();
            String fname = sc.next();
            double cgpa = sc.nextDouble();

            Studentmarks st = new Studentmarks(id, fname, cgpa);
            studentlist.add(st);
        }

        sc.close();;

        Collections.sort(studentlist, Comparator.comparing(Studentmarks::getCgpa).
            reversed().thenComparing(Studentmarks::getFname).
            thenComparing(Studentmarks::getId) );
        
        for(Studentmarks s : studentlist)
            System.out.println(s.getFname());
    }
}