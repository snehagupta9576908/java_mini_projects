import java.util.Scanner;

public class QuizGame {
    static int right = 0;
    static int wrong = 0;
    
    public static void main(String[] args) {
        System.out.println("WELCOME! This is the gaming interface");
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to Start or 2 to Quit:");
        int job = sc.nextInt();
        
        if (job == 1) {
            startQuiz(sc);
        } else {
            quit(sc);
        }
        
        sc.close();
        System.out.println("Your ScoreCard is: " + right + " right answers, " + wrong + " wrong answers.");
    }

    public static void startQuiz(Scanner sc) {
        String[] questions = {
            "Question 1: which city is famous for its leather hub of INDIA? \n1. Gorakhpur\n2. Ahmedabad \n3.Kanpur  \n4. Gurgaon",
            "Question 2: What is 2 + 1? \n1. 3 \n2. 4 \n3. 5 \n4. 6",
            "Question 3: What is the capital of Italy? \n1. Rome \n2. Madrid \n3. Paris \n4. Berlin",
            "Question 4: What is 5 * 3? \n1. 15 \n2. 20 \n3. 10 \n4. 25",
            "Question 5: What is the largest planet? \n1. Earth \n2. Mars \n3. Jupiter \n4. Saturn"
        };

        int[] correctAnswers = {3, 1, 1, 1, 3};  // Correct answers for the questions

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            int option = sc.nextInt();
            
            if (option == correctAnswers[i]) {
                System.out.println("Your option is correct");
                right++;
            } else {
                System.out.println("Your option is incorrect");
                wrong++;
            }
        }
    }

    public static void quit(Scanner sc) {
        System.out.println("Are you sure you want to quit? (yes/no)");
        String option = sc.next();

        if (option.equalsIgnoreCase("yes")) {
            System.out.println("Quitting the game...");
        } else {
            startQuiz(sc);
        }
    }
}