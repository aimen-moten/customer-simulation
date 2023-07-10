import demo.Customer;
import demo.WaitingLine;

class Main {
  public static void main(String[] args) {

    System.out.println("Creating customers: ");
    Customer c1 = new Customer("Brian Howard", 55, 47);
    System.out.println(c1);

    Customer c2 = new Customer("Sanij Shreshta", 21, 19);
    System.out.println(c2);

    Customer c3 = new Customer("Aimen Moten", 20, 1);
    System.out.println(c3);

    Customer c4 = new Customer("Salman Khan", 23, 45);
    System.out.println(c4);

    WaitingLine line = new WaitingLine();
    line.addToWL(c1);
    line.addToWL(c2);
    line.addToWL(c3);
    line.addToWL(c4);
    
    System.out.println("Serving Customers:");
    while (line.isWLEmpty() == false){
      Customer c = line.removeFromWL();
      System.out.println(c);
    }
  }
}