public class Account{
    private String accountID;
    private double balance ;

    public Account(String id,double balance) {
        this.balance = balance;
        this.accountID = id;
    }

    public void balanceString(){
        System.out.println(getAccountID() + "id'li kullanicinin bakyesi: " + getBalance() + "TL");

    }
   
    public void changeBalance(double x){
        this.balance += x;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getAccountID() {
        return accountID;
    }
    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

}