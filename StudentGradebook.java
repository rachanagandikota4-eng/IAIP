import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int id;
    ArrayList<Integer> marks;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.marks = new ArrayList<>();
    }

    public void addMark(int mark) {
        marks.add(mark);
    }

    public double getAverage() {
        if (marks.isEmpty()) 
            return 0;
        int total = 0;
        for (int m : marks)
             total += m;
        return (double) total / marks.size();
    }

    public String calculateGrade() {
        double avg = getAverage();
        if (avg >= 90) 
            return "A+";
        else if (avg >= 80) 
            return "A";
        else if (avg >= 70) 
            return "B";
        else if (avg >= 60) 
            return "C";
        else if (avg >= 50) 
            return "D";
        else return 
        "Fail";
    }

    public void display() {
        System.out.printf("ID: %-5d | Name: %-15s | Avg: %-6.2f | Grade: %s\n", id, name, getAverage(), calculateGrade());
    }
}

public class StudentGradebook {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Gradebook Menu ---");
            System.out.println("1. Add Student & Marks");
            System.out.println("2. Display Grade Report");
            System.out.println("3.edit student record");
            
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter Student ID: ");
                int id = sc.nextInt();
                sc.nextLine(); // consume newline
                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();
                
                Student s = new Student(name, id);
                System.out.print("How many subjects? ");
                int num = sc.nextInt();
                for (int i = 1; i <= num; i++) {
                    System.out.print("Enter marks for subject " + i + ": ");
                    s.addMark(sc.nextInt());
                }
                students.add(s);
                System.out.println("Student added successfully!");

            }else if (choice == 2) {
                System.out.println("\n--- Academic Performance Report ---");
                if (students.isEmpty()) System.out.println("No records found.");
                for (Student s : students) s.display();

            } else if (choice == 3) {

                System.out.print("Enter Student ID to Edit: ");
                int eid = sc.nextInt();

                boolean found = false;

                for (Student s : students) {

                    if (s.id == eid) {

                        sc.nextLine();

                        System.out.print("Enter New Student Name: ");
                        s.name = sc.nextLine();

                        s.marks.clear();

                        System.out.print("How many subjects? ");
                        int num = sc.nextInt();

                        for (int i = 1; i <= num; i++) {

                            System.out.print("Enter new marks for subject " + i + ": ");
                            s.addMark(sc.nextInt());
                        }

                        System.out.println("Student record updated successfully!");

                        found = true;
                        break;
                    }
                }

                if (!found) {

                    System.out.println("Student ID not found.");
                }
            }
            else if (choice == 4) {
                System.out.print("Enter Student ID to remove: ");
                int rid = sc.nextInt();
                students.removeIf(s -> s.id == rid);
                System.out.println("Record updated.");

            } else if (choice == 5) {
                System.out.println("Exiting... ");
                break;
            }
        }
        sc.close();
    }
}
