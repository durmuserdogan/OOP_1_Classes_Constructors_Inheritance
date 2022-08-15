public class BankAccount {

    private String accountNum;
    private double balance=0;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("56789", 2.50, "Default name", "Default address","default phone");
        System.out.println("Empty constructor called ");
    }

    public BankAccount(String accountNum, double balance, String customerName, String email, String phoneNumber){

        System.out.println("Account constructor with paramaters called");

        this.accountNum= accountNum;
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of "+ depositAmount+ "made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if (this.balance - withdrawalAmount<=0){
            System.out.println("Only "+ this.balance + " available. Withdrawal not processed");
        }
        else{
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of "+ withdrawalAmount+ " processed. Remaining balance= "+ this.balance);

        }
    }

    public String getAccountNum(){
        return accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositfunds(){

    }

    public void withdrawfunds(){

    }

}
