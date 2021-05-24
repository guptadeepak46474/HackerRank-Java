import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.PriorityQueue;

class StudentClass {
    private final int id;
    private final String name;
    private final double cgpa;

    public StudentClass(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class Priorities {
    public static final Comparator<StudentClass> studentComparator = (s1, s2) -> (Comparator
            .comparingDouble(StudentClass::getCgpa).reversed())
            .thenComparing(StudentClass::getName)
            .thenComparingInt(StudentClass::getId)
            .compare(s1, s2);

    public List<StudentClass> getStudents(List<String> events) {
        PriorityQueue<StudentClass> pq = new PriorityQueue<>(events.size(), studentComparator);
        for (String event : events) {
            String[] token = event.split(" ");
            String command = token[0];

            if (command.equals("ENTER")) {
                int id = Integer.parseInt(token[3]);
                String name = token[1];
                double cgpa = Double.parseDouble(token[2]);
                StudentClass student = new StudentClass(id, name, cgpa);
                pq.add(student);
            } else {
                pq.poll();
            }
        }

        List<StudentClass> result = new ArrayList<>(pq.size());
        while (pq.size() > 0) {
            result.add(pq.poll());
        }
        return result;
    }
}

public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<StudentClass> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (StudentClass st: students) {
                System.out.println(st.getName());
            }
        }
    }
}