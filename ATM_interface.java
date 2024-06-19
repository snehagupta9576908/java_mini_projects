import java.util.Scanner;

public class ATM_interface {
    static float bank_balance = 0.0f;
    static int your_PIN;
    static String atm_card = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ENTRY Question
        System.out.println("Do you know when and where ATM was first used?");
        String ans = sc.nextLine();
        String right = "JUNE_1976_london_UK";
        if (ans.equalsIgnoreCase(right)) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong Answer");
            System.out.println("The correct answer is: " + right);
        }

        // ATM Interface
        System.out.println("WELCOME! This is interface");
        System.out.println("Insert ATM Card:");
        atm_card = sc.nextLine();
        System.out.println("Enter your PIN:");
        your_PIN = sc.nextInt();
        sc.nextLine(); // Consume the newline 
        verification(sc);
    }

    public static void verification(Scanner sc) {
        String[] s1 = {"ROHIT SHARMA", "SNEHA GUPTA", "PRACHI KHARE", "ISHIKA BATRA", "SACHIN TENDULKAR",
                       "VIRAT KOHLI", "ANUSHKA SHARMA", "AMAN DHATTARWAL", "BHUMIKA SHUKLA", "SADHNA YADAV",
                       "SHUBHMAN GILL", "CAMRON GREEN", "SAKSHI DHONI", "MAHINDRA DHONI", "SHRADHDHA SHARMA"};
        String[] s2 = {"2345", "5678", "0976", "3425", "9067", "7698", "5436", "9056", "9078", "2344",
                       "5070", "6769", "4556", "6879", "5648"};
        String[] s3 = {"Rs.1596567", "Rs.3448567", "Rs.345783", "Rs.23467", "Rs.46578", "Rs.56799", "Rs.234564",
                       "Rs.46859", "Rs.46588", "Rs.243789", "Rs.46322", "Rs.97080", "Rs.587000", "Rs.46585", "Rs.68705"};
//S1 FOR ATMCARD
//S2 FOR PIN OR PASSWORD
//S3 FOR RUPEES
        boolean found = false;
        for (int i = 0; i < s1.length; i++) {
            if (atm_card.equalsIgnoreCase(s1[i])) {
                found = true;
                if (your_PIN == Integer.parseInt(s2[i])) {
                    System.out.println("Verification successful");
                    bank_balance = Float.parseFloat(s3[i].substring(3).replace(",", ""));
                    transactionMenu(sc);
                } else {
                    System.out.println("Your PIN is incorrect. Please try again.");
                    System.out.println("Enter your PIN:");
                    your_PIN = sc.nextInt();
                    sc.nextLine(); // FOR newline 
                    verification(sc); // Retry verification
                }
                break;
            }
        }
        if (!found) {
            System.out.println("ATM Card not recognized");
        //DATA MAY BE OUT OF BOUND
        }
    }

    public static void transactionMenu(Scanner sc) {
        System.out.println("Choose your transaction:");
        System.out.println("1. Cash Withdrawal");
        System.out.println("2. Deposit");
        System.out.println("3. Check Bank Balance");
        System.out.println("4. Quit");

        int choice = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                cashWithdraw(sc);
                break;
            case 2:
                deposit(sc);
                break;
            case 3:
                checkBankBalance(sc);
                break;
            case 4:
                System.out.println("Exiting...");
                return; // Exit the menu
            default:
                System.out.println("Invalid choice");
        }
        transactionMenu(sc); // Show the menu again for the next transaction
    }

    public static void checkBankBalance(Scanner sc) {
        System.out.println("Your bank balance is: Rs." + bank_balance);
        System.out.println("Eject the card");
    }

    public static void deposit(Scanner sc) {
        System.out.println("Enter amount to deposit:");
        int your_deposit = sc.nextInt();
        bank_balance += your_deposit;
        System.out.println("Your current balance is: Rs." + bank_balance);
        System.out.println("Eject the card");
    }

    public static void cashWithdraw(Scanner sc) {
        System.out.println("Your bank balance is: Rs." + bank_balance);
        System.out.println("Enter amount to withdraw:");
        int withdraw = sc.nextInt();
        if (withdraw <= bank_balance) {
            bank_balance -= withdraw;
            System.out.println("Withdrawal successful. Take your cash from out box: Rs." + withdraw);
            System.out.println("Eject the card");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}