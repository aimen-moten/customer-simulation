package demo;

public class Customer {
  private String name;
  private int arrivalTime;
  private int age;


  public Customer(String name, int arrivalTime, int age){
    this.name = name;
    this.arrivalTime = arrivalTime;
    this.age = age;
  }

  public String getName(){
    return name;
  }

  public int getArrivalTime(){
    return arrivalTime;
  }

  public int getAge(){
    return age;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setArrivalTime(int arrivalTime){
    this.arrivalTime = arrivalTime;
  }

  public void setAge (int age){
    this.age = age;
  }

  @Override
  public String toString() {
    return "Customer {name: " + name + ", age: " + age + ", arrivalTime: " + arrivalTime + "}";
  }

}

  
  


  