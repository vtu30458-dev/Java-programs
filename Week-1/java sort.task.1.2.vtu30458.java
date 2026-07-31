import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
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

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Student> studentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            studentList.add(new Student(sc.nextInt(), sc.next(), sc.nextDouble()));
        }

        Collections.sort(studentList, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {

                if (s1.getCgpa() < s2.getCgpa())
                    return 1;
                if (s1.getCgpa() > s2.getCgpa())
                    return -1;

                int name = s1.getFname().compareTo(s2.getFname());
                if (name != 0)
                    return name;

                return s1.getId() - s2.getId();
            }
        });

        for (Student s : studentList) {
            System.out.println(s.getFname());
        }

        sc.close();
    }
}

Output:
Ashis
Fahim
Samara
Samiha
Rumpa
