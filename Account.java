package bankmangementsystem;

public class Account {

    private int accountNumber;
    private String name;
    private String phone;
    private int pin;
    private double balance;

    public Account(int accountNumber, String name, String phone, int pin) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.phone = phone;
        this.pin = pin;
        this.balance = 0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } 
        else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } 
        else {
            balance = balance - amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
    }

    public void displayAccount() {

        System.out.println("\n----- ACCOUNT DETAILS -----");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Name           : " + name);
        System.out.println("Phone          : " + phone);
        System.out.println("Balance        : ₹" + balance);
    }
}
