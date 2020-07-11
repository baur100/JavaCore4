package hw9;

public class BankAccount {
    private String owner;
    private double balance;
    private String accountId;

    public BankAccount(){}

    public BankAccount(String owner, double balance, String accountId){
        setOwner(owner);
        setBalance(balance);
        setAccountId(accountId);
    }

    public String getOwner(){
        return this.owner;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getAccountId(){
        return this.accountId;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setAccountId(String accountId){
        this.accountId = accountId;
    }

    public void deposit(double sum){
        balance += sum;
    }

    public double withdraw(double sum){
        balance -= sum;
        return balance;
    }

    public void printInfo(){
        System.out.println("Owner: " + owner + ", Id: " + accountId + ", balance: $" + balance);
    }

}