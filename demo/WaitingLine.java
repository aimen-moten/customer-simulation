package demo;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
// Create a class called WaitingLine that behaves like a queue or a stack; that is, it should have methods to add and remove Customer objects, as well as a boolean method to check whether it is empty. It may have other methods as well, such as returning the current number of customers in the line or "peeking" at the customer at the head of the line without removing them, but these are not necessary for this problem.

public class WaitingLine{
  private List<Customer> WL = new ArrayList<Customer>();
  private int index = 0;

  public void addToWL(Customer c){
    this.WL.add(c);
    index += 1;
  }

  public Customer removeFromWL(){
    // Collections.sort(this.WL, new Comparator());
    Customer thisObj = findSmallest();
    this.WL.remove(thisObj);
    return thisObj;
  }

  private Customer findSmallest(){
    Customer smallest = this.WL.get(0);

    for (int i = 0; i < this.WL.size(); i++){
      Customer thisCustomer = this.WL.get(i);
      if (thisCustomer.getArrivalTime() < smallest.getArrivalTime()){
        smallest = thisCustomer;
      }
    }
    return smallest;
    
    // for (i=0; i<length(this.WL); i++){
    //   if (this.WL[i].getArrivalTime() < smallest.getArrivalTime()){
    //     smallest = this.WL[i];
    //   }
    // }

    // Iterator iterator = this.WL.iterator();
    //   while(iterator.hasNext()) {
    //     if (iterator.next.getArrivalTime() < smallest.getArrivalTime()){
    //       smallest = iterator.next;
    //     }
    //   }
  }

  public boolean isWLEmpty(){
    return this.WL.isEmpty();
  }
}
