package JavaExercises.Lesson3;

public class BankAccount {

  private String accountNumber;
  private double balance;
  private String customerName;
  private String email;
  private String phoneNumber;


  // sets constructor without param
  public BankAccount(){
    this("000-000-000",
        0.00,
        "Default",
        "Default",
        "+730-000 000");

    System.out.println("Default Account: " + getAccountNumber() +
        ", Balance: " + getBalance() +
        ", Name: " + getCustomerName() +
        ", Email: " + getEmail() +
        ", PhoneNumber: " + getPhoneNumber());
  }

  // sets constructor with param
  public BankAccount(
      String accountNumber,
      double balance,
      String customerName,
      String email,
      String phoneNumber) {

    this.accountNumber = accountNumber;
    this.balance = balance;
    this.customerName = customerName;
    this.email= email;
    this.phoneNumber=phoneNumber;
  }

  public void printAccount(){
    System.out.println("AccountNumber: " + getAccountNumber() + ", Balance: " +
        getBalance() + ", Name: " +
        getCustomerName() + ", Email: " +
        getEmail() + ", PhoneNumber: " +
        getPhoneNumber());
  }

  public void depositFunds (double deposit){
    balance += deposit;
  }

  public void withdrawFunds (double withdraw) {
    if (withdraw > balance) {
      System.out.println("insufficient funds! Current Balance: " + getBalance());
    }
    else {
      balance -= withdraw;
    }
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName){
    this.customerName = customerName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

}
