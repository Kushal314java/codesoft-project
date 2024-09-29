import java.util.Scanner;

public class ATM{

    // Display current balance in the account
    public static void displayBalance(int balance) {
        System.out.println("Current Balance: " + balance);
        System.out.println();
    }

    // Withdraw amount and update the balance
    public static int amountWithdrawing(int balance, int withdrawAmount) {
        System.out.println("Withdraw Operation:");
        System.out.println("Withdrawing Amount: " + withdrawAmount);
        if (balance >= withdrawAmount) {
            balance = balance - withdrawAmount;
            System.out.println("Please collect your money and collect the card");
            displayBalance(balance);
        } else {
            System.out.println("Sorry! Insufficient Funds");
            System.out.println();
        }
        return balance;
    }

    // Deposit amount and update the balance
    public static int amountDepositing(int balance, int depositAmount) {
        System.out.println("Deposit Operation:");
        System.out.println("Depositing Amount: " + depositAmount);
        balance = balance + depositAmount;
        System.out.println("Your Money has been successfully deposited");
        displayBalance(balance);
        return balance;
    }

    public static void main(String[] args) {
        int balance = 10000;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to ATM");
            System.out.println("Select 1 for Withdraw");
            System.out.println("Select 2 for Deposit");
            System.out.println("Select 3 for Check Balance");
            System.out.println("Select 4 to Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Withdraw
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = scanner.nextInt();
                    balance = amountWithdrawing(balance, withdrawAmount);
                    break;

                case 2: // Deposit
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = scanner.nextInt();
                    balance = amountDepositing(balance, depositAmount);
                    break;

                case 3: // Display balance
                    displayBalance(balance);
                    break;

                case 4: // Exit
                    System.out.println("Thank you for using our ATM. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }
}
















