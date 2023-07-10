package demo;

public class Comparator{
  public Customer compare(Customer a, Customer b){
    if (a.getArrivalTime() < b.getArrivalTime()){
      return a;
    }
    else {
      return b;
    }
  }
}