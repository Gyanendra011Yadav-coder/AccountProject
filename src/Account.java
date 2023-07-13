import java.util.Date;

/**
 * TODO: BELOW ASSIGNMENT HAS WHOLE POINTS COVERED THAT ARE EMETIONED BELOW
 *
 *Design a class named Account that contains:
 * A private int data field named accountNumfor the account (default 0).
 * A private string data field named accountNamefor the account (default "none").
 * A private double data field named balancefor the account (default 0).
 * A private int data field named numTransactionsthat will count the number of deposit and withdraw transactions made to an account.
 * A private Date data field named dateCreatedthat stores the date when the account was created.
 * A no-arg constructor that creates a default account.
 * A constructor that creates an account with the specified account number and name.The accessor and mutator methods for account number, name.The access or method for balance and dateCreated.A method namedwithdrawthat withdraws a specified amount from the account.
 * A method named depositthat deposits a specified amount to the account.
 * A method named displayAccountInfo that displays all the information in the Account object.
 * A method named combinethat takes another Account object as an argument and adds up balances and number of transactions to current Account object.
 */

public class Account {
    private int accountNum;
    private String accountName;
    private double balance;
    private int numTransactions;
    private Date dateCreated;

    // no-arg constructor
    public Account() {
        this.accountNum = 0;
        this.accountName = "none";
        this.balance = 0;
        this.numTransactions = 0;
        this.dateCreated = new Date();
    }

    // constructor with account number and name
    public Account(int accountNum, String accountName) {
        this.accountNum = accountNum;
        this.accountName = accountName;
        this.balance = 0;
        this.numTransactions = 0;
        this.dateCreated = new Date();
    }

    // accessor and mutator methods for account number or getter and setter methods
    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    // accessor and mutator methods for account name
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    // accessor method for balance
    public double getBalance() {
        return balance;
    }

    // accessor method for date created
    public Date getDateCreated() {
        return dateCreated;
    }

    // method to withdraw amount from account
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            numTransactions++;
//            System.out.println("Withdrawal of " + amount + " successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // method to deposit amount to account
    public void deposit(double amount) {
        balance += amount;
        numTransactions++;
//        System.out.println("Deposit of " + amount + " successful.");
    }

    // method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNum);
        System.out.println("Account Name: " + accountName);
        System.out.println("Balance: " + "XXXXXXXXXXCAD");
        System.out.println(numTransactions +" "+"transactions since created at"+" " +dateCreated);
    }

    // method to combine account with another account
    public void combine(Account otherAccount) {
        balance += otherAccount.getBalance();
        numTransactions += otherAccount.numTransactions;
    }

    /*
        Hey, Student You may connect with me through LinkedIN, for any Query: https://www.linkedin.com/in/gyanendra-yadav-8ba1541ab/
     */
}
