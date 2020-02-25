package JavaExercises.Lesson3;

public class VipCustomer {

  private String name;
  private double creditLimit;
  private String email;

  public VipCustomer (){
    this(" Vip", 10000, "VipDefault@gmail.com " );
  }

  public VipCustomer(String name, double creditLimit){
    this (name, creditLimit, "VipDefault@gmail.com");
  }

  public VipCustomer (String name, double creditLimit, String email){
    this.name = name;
    this.creditLimit = creditLimit;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public double getCreditLimit() {
    return creditLimit;
  }

  public String getEmail() {
    return email;
  }
}

