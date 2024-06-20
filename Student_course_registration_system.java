import java.util.Scanner;

public class Student_course_registration_system {
    static String newname;
    static String newemail;
    static String newPHN;
    static String newpassword;
    static String[] oldnames;
    static String[] oldemail;
    static String[] oldPHN;
    static String[] oldpassword;

    static String[] s1, s2, s3, s4;

    public static void main(String[] args) {
        System.out.println("Do you know - A coder can do anything anywhere");
        System.out.println("Welcome, this is the platform where you may learn by enrolling in computer programming subjects");
        System.out.println("ENTER YOUR STATUS");
        Scanner sc = new Scanner(System.in);
        int status = sc.nextInt();
        sc.nextLine();  // consume the newline character

        Data_base();

        if (status == 1) {
            System.out.println("Process: Sign up");
            signup(sc);
        } else if (status == 2) {
            System.out.println("Process: LOG IN");
            login(sc);
        } else {
          System.out.println("You are quitting");
        }
    }

    public static void Data_base() {
        // Here we are storing all the data of courses
        s1 = new String[]{"CYBER SECURITY", "MYSQL", "PYTHON LIBRARIES", "GENERATIVE AI", "R PROGRAMMING", "AUTOMATA", "DISCRETE", "C", "C++", "JAVA", "PYTHON", "DSA IN C", "ARTIFICIAL INTELLIGENCE", "MACHINE LEARNING", "OPEN CV", "DBMS", "RUBY", "SQL", "POSTGRESQL", "MONGO DB", "AWS", "PHP", "CPP", "JAVASCRIPT", "HTML", "CSS", "ANDROID DEVELOPMENT", "ANGULAR JS", "REACT JS", "NODE JS", "OOPS PYTHON", "BOOTSTRAP"};
        s2 = new String[]{"abc1", "abc2", "abc3", "abc4", "abc5", "abc6", "abc7", "abc8", "abc9", "abc10", "abc11", "abc12", "abc13", "abc14", "abc15", "abc16", "abc17", "abc18", "abc19", "abc20", "abc21", "abc22", "abc23", "abc24", "abc25", "abc26", "abc27", "abc28", "abc29", "abc30", "abc31", "abc32"};
        s3 = new String[]{"41", "31", "30", "44", "34", "54", "23", "12", "34", "45", "67", "65", "43", "57", "76", "45", "54", "56", "76", "34", "75", "87", "34", "35", "38", "58", "51", "42", "49", "40", "23", "26"};
        s4 = new String[]{"5", "3", "4", "5", "6", "7", "6", "5", "6", "6", "7", "6", "5", "3", "4", "4", "5", "5", "5", "6", "6", "6", "7", "6", "6", "8", "6", "7", "7", "8", "9", "5"};

        oldnames = new String[]{"SNEHA", "DHRUVI", "PRACHI", "SATYAM", "SHIVAM", "MANVI", "RASHI", "CHARU", "BOXEN", "ZOHO", "TECH", "ERROR", "CODER", "DECODER", "ROSHI"};
        oldemail = new String[]{"SNEHA@gmail.com", "DHRUVI@gmail.com", "PRACHI@gmail.com", "SATYAM@gmail.com", "SHIVAM@gmail.com", "MANVI@gmail.com", "RASHI@gmail.com", "CHARU@gmail.com", "BOXEN@gmail.com", "ZOHO@gmail.com", "TECH@gmail.com", "ERROR@gmail.com", "CODER@gmail.com", "DECODER@gmail.com", "ROSHI@gmail.com"};
        oldPHN = new String[]{"9945367891","9708567483","7998695949","9129394979", "9928537588","8888888887","9234567891","8345678902","9292939499","8796059437","9076859403","9940382758","7869704657","7685940322","8345674309"};
        oldpassword = new String[]{"2345", "5678", "0976", "3425", "9067", "7698", "5436", "9056", "9078", "2344", "5070", "6769", "4556", "6879", "5648"};
    }

    public static void signup(Scanner sc) {
        System.out.println("Interface For signup");
        System.out.println("Enter your name");
        newname = sc.nextLine();
        System.out.println("Enter your email");
        newemail = sc.nextLine();
        System.out.println("Enter the phone number");
        newPHN = sc.nextLine();
        System.out.println("Enter the strong password");
        newpassword = sc.nextLine();

        // Adding new user details to existing arrays
        oldnames = addElement(oldnames, newname);
        oldemail = addElement(oldemail, newemail);
        oldPHN = addElement(oldPHN, newPHN);
        oldpassword = addElement(oldpassword, newpassword);

        System.out.println("Go to the main menu");
        course_management(sc);
    }

    public static void login(Scanner sc) {
        System.out.println("Welcome to LOGIN");
        System.out.println("Enter the email");
        String email = sc.nextLine();
        System.out.println("Enter the password");
        String password = sc.nextLine();
        System.out.println("Enter 1 to log in or verify");
        int input = sc.nextInt();
        sc.nextLine();  // consume the newline character

        if (input == 1) {
            boolean found = false;
            for (int i = 0; i < oldemail.length; i++) {
                if (email.equalsIgnoreCase(oldemail[i])) {
                    found = true;
                    if (password.equals(oldpassword[i])) {
                        System.out.println("Verification successful");
                        course_management(sc);
                    } else {
                        System.out.println("Your password is incorrect. Please try again.");
                        System.out.println("PRESS 1 TO RETRY LOGIN OR PRESS (any integer) TO CREATE PASSWORD");
                        int input_3 = sc.nextInt();
                        sc.nextLine();  // consume the newline character

                        if (input_3 == 1) {
                            login(sc);
                        } else {
                            System.out.println("YOU ARE GOING TO RECREATE YOUR PASSWORD");
                            recreate_password(sc);
                        }
                    }
                    break;
                }
            }
            if (!found) {
                System.out.println("Email not recognized");
            }
        }
    }

    public static void course_management(Scanner sc) {
        System.out.println("Enter your interest");
        String course_name = sc.nextLine();
        System.out.println("Please enter the code of subject");
        String course_code = sc.nextLine();
        System.out.println("Enter 1 to search");
        int input = sc.nextInt();
        sc.nextLine();  // consume the newline character

        if (input == 1) {
            for (int i = 0; i < s1.length; i++) {
                if (course_name.equalsIgnoreCase(s1[i]) && course_code.equals(s2[i])) {
                    System.out.println("Hey, you found the course. Here are all the details:");
                    System.out.println("Available seats: " + s3[i] + " GRADES: " + s4[i]);
                    System.out.println("Do you want to enroll (PRESS 1) or rate (PRESS 2) it?");
                    int input_2 = sc.nextInt();
                    sc.nextLine();  // consume the newline character

                    if (input_2 == 1) {
                        System.out.println("Congrats! You unlocked this course");
                        int seats = Integer.parseInt(s3[i]);
                        s3[i] = String.valueOf(seats - 1);
                    } else if (input_2 == 2) {
                        System.out.println("Hey! Thanks for rating");
                        int grade = Integer.parseInt(s4[i]);
                        s4[i] = String.valueOf(grade + 1);
                    }
                }
            }
        }
    }

    public static void recreate_password(Scanner sc) {
        System.out.println("Please recreate your password");
        System.out.println("Enter your email");
        String email = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < oldemail.length; i++) {
            if (email.equalsIgnoreCase(oldemail[i])) {
                found = true;
                System.out.println("Enter new password");
                String newPass = sc.nextLine();
                oldpassword[i] = newPass;
                System.out.println("Password updated successfully. Please login again.");
                login(sc);
                break;
            }
        }
        if (!found) {
            System.out.println("Email not recognized");
        }
    }

    // Helper method to add an element to an array
    public static String[] addElement(String[] original, String newElement) {
        String[] newArray = new String[original.length + 1];
        System.arraycopy(original, 0, newArray, 0, original.length);
        newArray[original.length] = newElement;
        return newArray;
    }
}