import java.util.Scanner;

class OnlineExam {

    String username = "student";
    String password = "1234";

    int score = 0;

    public void login() {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Online Examination System =====");

        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (user.equals(username) && pass.equals(password)) {

            System.out.println("\nLogin Successful!");
            startExam(sc);

        } else {

            System.out.println("\nInvalid Username or Password!");
        }
    }

    public void startExam(Scanner sc) {

        System.out.println("\n===== Exam Started =====");

        // Question 1
        System.out.println("\n1. Which language is used for Java programming?");
        System.out.println("a) Python");
        System.out.println("b) Java");
        System.out.println("c) HTML");
        System.out.println("d) C");

        System.out.print("Enter Answer: ");
        char ans1 = sc.next().charAt(0);

        if (ans1 == 'b' || ans1 == 'B') {
            score++;
        }

        // Question 2
        System.out.println("\n2. Which keyword is used to create a class in Java?");
        System.out.println("a) function");
        System.out.println("b) define");
        System.out.println("c) class");
        System.out.println("d) new");

        System.out.print("Enter Answer: ");
        char ans2 = sc.next().charAt(0);

        if (ans2 == 'c' || ans2 == 'C') {
            score++;
        }

        // Question 3
        System.out.println("\n3. Which method is the entry point of Java program?");
        System.out.println("a) start()");
        System.out.println("b) run()");
        System.out.println("c) main()");
        System.out.println("d) execute()");

        System.out.print("Enter Answer: ");
        char ans3 = sc.next().charAt(0);

        if (ans3 == 'c' || ans3 == 'C') {
            score++;
        }

        // Question 4
        System.out.println("\n4. Which symbol is used to end a statement in Java?");
        System.out.println("a) .");
        System.out.println("b) :");
        System.out.println("c) ;");
        System.out.println("d) ,");

        System.out.print("Enter Answer: ");
        char ans4 = sc.next().charAt(0);

        if (ans4 == 'c' || ans4 == 'C') {
            score++;
        }

        // Question 5
        System.out.println("\n5. Java is a _____ language.");
        System.out.println("a) Programming");
        System.out.println("b) Database");
        System.out.println("c) Browser");
        System.out.println("d) Operating System");

        System.out.print("Enter Answer: ");
        char ans5 = sc.next().charAt(0);

        if (ans5 == 'a' || ans5 == 'A') {
            score++;
        }

        showResult();
    }

    public void showResult() {

        System.out.println("\n===== Exam Result =====");

        System.out.println("Your Score: " + score + "/5");

        if (score >= 3) {

            System.out.println("Result: PASS");

        } else {

            System.out.println("Result: FAIL");
        }

        System.out.println("Thank You for Attending the Exam!");
    }
}

public class OnlineExamination {

    public static void main(String[] args) {

        OnlineExam exam = new OnlineExam();

        exam.login();
    }
}
