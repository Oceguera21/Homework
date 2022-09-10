package Week1VariablesAndOperations;

public class VariablesAndOperations {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int availablePlaneSeats = 7;
    
    double costOfGroceries = 28.69;
    
    char middleInitial = 'M';
    
    boolean isHotOutside = false;
    
    String customerFirstName = "Max";
    
    String streetAddress = "2705 N 25th Place";
    
    System.out.println("Available seats left on the plane:" + availablePlaneSeats);
    System.out.println("$" + costOfGroceries + " is the price for groceries.");
    System.out.println("The person's middle initial is " +middleInitial);
    System.out.println("It is hot outside - " + isHotOutside);
    System.out.println("The customer's first name is " + customerFirstName);
    System.out.println(streetAddress + " is where the person lives.");
    
    availablePlaneSeats = availablePlaneSeats - 2;
    System.out.println(availablePlaneSeats);
    
    costOfGroceries += 2.15;
    System.out.println(costOfGroceries);
    
    middleInitial = 'A';
    System.out.println(middleInitial);
    
    isHotOutside = true;
    System.out.println(isHotOutside);
    
    String fullName = customerFirstName + " " + middleInitial + " Oceguera";
    System.out.println(fullName); 
    
    System.out.println("The customer Mr. " + fullName + " lives at " + streetAddress + ".");
    
    
    
  }

}
"# Homework" 
