import java.util.*;

public class Main {
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String greeting = sc.nextLine();
    System.out.println(">>>" + greeting + "\n//A string has been printed\n");
    System.out.println("The length is: " + greeting.length() + "\n//Usage of Length method\n");
    System.out.println("The text to Uppercase: "+ greeting.toUpperCase() + "\n//Usage of toUpperCase() method\n");
    System.out.println("The text to Lowercase: "+ greeting.toLowerCase() + "\n//Usage of toLowerCase() method\n");
    String mystring = "Hey! I am the best software engineer. I am curious about the core technologies. I wanna know every bit of the existing technology\n";
   	System.out.println(mystring);
   	
    System.out.println("Enter the text you wanna search: ");
    String usertext = sc.nextLine();
    System.out.println("The index position of "+usertext+" is " +mystring.indexOf(usertext) + "\n");
    
    System.out.println("\tEnter your first name: ");
    String fname = sc.nextLine();
    
    System.out.println("\tEnter your last name: ");
    String lname = sc.nextLine();
    
    System.out.println("Your full name is: " + fname.concat(lname));
    System.out.println("\n//Usage of concat() method");
  }
}
