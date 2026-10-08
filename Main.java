package bankmangementsystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bank bank = new Bank();

        boolean running = true;

        while (running) {

            System.out.println("\n==============================");
            System.out.println("      JAVA BANKING SYSTEM");
            System.out.println("==============================");

            System.out.println("1. Create Account");
            System.out.println("2. View Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Check Balance");
            System.out.println("6. Change PIN");
            System.out.println("7. Delete Account");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter phone number: ");
                    String phone = sc.nextLine();

                    System.out.print("Create 4-digit PIN: ");
                    int pin = sc.nextInt();

                    Account newAccount =
                            bank.createAccount(name, phone, pin);

                    System.out.println("\nAccount created successfully!");
                    System.out.println(
                            "Your Account Number: "
                                    + newAccount.getAccountNumber());

                    break;

                case 2:

                    System.out.print("Enter account number: ");
                    int accountNumber = sc.nextInt();

                    Account account =
                            bank.findAccount(accountNumber);

                    if (account != null) {
                        account.displayAccount();
                    } else {
                        System.out.println("Account not found.");
                    }

                    break;

                case 3:

                    System.out.print("Enter account number: ");
                    accountNumber = sc.nextInt();

                    account = bank.findAccount(accountNumber);

                    if (account != null) {

                        System.out.print("Enter amount: ");
                        double amount = sc.nextDouble();

                        account.deposit(amount);

                    } else {

                        System.out.println("Account not found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter account number: ");
                    accountNumber = sc.nextInt();

                    account = bank.findAccount(accountNumber);

                    if (account != null) {

                        System.out.print("Enter amount: ");
                        double amount = sc.nextDouble();

                        account.withdraw(amount);

                    } else {

                        System.out.println("Account not found.");
                    }

                    break;

                case 5:

                    System.out.print("Enter account number: ");
                    accountNumber = sc.nextInt();

                    account = bank.findAccount(accountNumber);

                    if (account != null) {

                        System.out.println(
                                "Current Balance: ₹"
                                        + account.getBalance());

                    } else {

                        System.out.println("Account not found.");
                    }

                    break;

                case 6:

                    System.out.print("Enter account number: ");
                    accountNumber = sc.nextInt();

                    account = bank.findAccount(accountNumber);

                    if (account != null) {

                        System.out.print("Enter new PIN: ");
                        int newPin = sc.nextInt();

                        account.setPin(newPin);

                        System.out.println(
                                "PIN changed successfully.");

                    } else {

                        System.out.println("Account not found.");
                    }

                    break;

                case 7:

                    System.out.print("Enter account number: ");
                    accountNumber = sc.nextInt();

                    boolean deleted =
                            bank.deleteAccount(accountNumber);

                    if (deleted) {

                        System.out.println(
                                "Account deleted successfully.");

                    } else {

                        System.out.println(
                                "Account not found.");
                    }

                    break;

                case 8:

                    running = false;

                    System.out.println(
                            "Thank you for using Java Banking System!");

                    break;

                default:

                    System.out.println(
                            "Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}
