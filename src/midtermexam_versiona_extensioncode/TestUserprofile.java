
package midtermexam_versiona_extensioncode;

import java.util.Scanner;
/**
 *
 * @author karim kamel
 */
public class TestUserprofile {

 public static void main(String[] args) {
 
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Please enter your username: ");
     String input = scanner.nextLine();
    
     
  
     
     System.out.println("Please choose your favourite genres : Comeda, Drama, Action, or Mystery");
     String favG = scanner.nextLine();
     
     System.out.println("Hello " + input);
     System.out.println("Your favoutire genre is : " + favG);
     
 }
  
   
}