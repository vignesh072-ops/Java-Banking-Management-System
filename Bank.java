package bankmangementsystem;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts = new ArrayList<>();

    private int nextAccountNumber = 1001;

    public Account createAccount(String name, String phone, int pin) {

        Account account =
                new Account(nextAccountNumber, name, phone, pin);

        accounts.add(account);

        nextAccountNumber++;

        return account;
    }

    public Account findAccount(int accountNumber) {

        for (Account account : accounts) {

            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }

        return null;
    }

    public boolean deleteAccount(int accountNumber) {

        Account account = findAccount(accountNumber);

        if (account != null) {
            accounts.remove(account);
            return true;
        }

        return false;
    }
}
