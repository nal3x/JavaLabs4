import java.util.*;
import java.util.HashMap;

public class PhoneBook {

private static HashMap <String, String> phonebook = new HashMap <String, String>();
 
public static void main(String [] args){

  Scanner in = new Scanner(System.in);

  while(true) {
   System.out.println("1. Προσθήκη τηλεφώνου στον κατάλογο");
   System.out.println("2. Εύρεση τηλεφώνου από τον κατάλογο");
   System.out.println("3. Προβολή όλων των στοιχείων του καταλόγου");
   System.out.println("4. Προβολή μεγέθους καταλόγου");
   System.out.println("5. Έξοδος");
   int choice=in.nextInt();
            
   if (choice == 1)
   	addPhoneNumber();
   else if (choice == 2)
   	searchNumber();
   else if (choice == 3)
   	displayAllNumbers();    
   else if (choice == 4)
   
       //your code here
       
   else if (choice == 5)
        break;
   else
    System.out.println("Δώσατε λάθος επιλογή. Δοκιμάστε ξανά!");
        }
  }
     
  private static void addPhoneNumber(){
      
      //your code here
  }

      }
     
  
private static void searchNumber(){

//your code here
 
}
 

private static void displayAllNumbers(){

//your code here

}
