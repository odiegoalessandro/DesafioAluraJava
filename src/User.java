public class User {
    private final String name;
    private final String accountType;
    private double balance;

    public User(String name, double balance, String accountType){
        this.name = name;
        this.balance = balance;
        this.accountType = accountType;
    }

    public String getName() {
        return this.name;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
