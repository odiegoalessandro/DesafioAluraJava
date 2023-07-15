public class Account {
    User user;

    public Account(User user){
        this.user = user;
    }

    public void transfer(double value, String beneficent){
        if (this.user.getBalance() >= value){
            this.user.setBalance(this.user.getBalance() - value);
        }
    }

    public void deposit(double value){
        this.user.setBalance(this.user.getBalance() + value);
    }

    public double getBalance(){
        return user.getBalance();
    }
}
