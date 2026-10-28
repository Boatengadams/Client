// Question: How can a bank account track its balance, client, and transactions?
package OOP.BANK;
//-balance : double
//-annualInterestRate : double
//-dateCreated : Date
//-----------------------------
//+Account(int, doublem double)
//+withdraw(double): boolean
//+deposite(double): void
//    +getters/setters
import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private Client client;
    private ArrayList<Transaction> transactions;

    public Account(int id , double balance,double annualInterestRate, Client client) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
        this.client =client;
        this.transactions = new ArrayList<>();
    }

    public boolean withdraw(double amount){
        if (balance>=amount){
            balance -= amount;

            this.transactions.add(new Transaction('W', amount, this.balance, "Withdrawn"+amount));
            return true;
        }
        return false;
    }

    public void deposite (double amount){
        balance += amount;
        this.transactions.add(new Transaction('D',amount,this.balance,"Deposited: "+amount));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
