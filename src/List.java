import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class List {
	
    public static void main(String[] args){
        
        HashSet<String> mySet = new HashSet<String>();
	Scanner input = new Scanner(System.in);
        
        String name = input.next();
	while (!name.equals("exit")){
            if (!mySet.add(name))   		
            System.out.println("Η συμβολοσειρά " + name + " υπάρχει ήδη στο σύνολο");	
             name = input.next();
        }
        System.out.println("Εμφάνιση στοιχείων με Encanched For");
        
        for(String str: mySet){
            System.out.println(str);
	}
        
        System.out.println();

// Χρήση iterator για προβολή των στοιχείων του HashSet. Οι iterators 
// παρέχουν έναν ομοιόμορφο τρόπο για την διάσχιση συλλογών (λίστες,
// HashSet, HashMap κλπ), απλοποιώντας έτσι την χρήση τους στις 
// εφαρμογές και επιτρέποντας την χρήση του πολυμορφισμού. 

        System.out.println("Εμφάνιση στοιχείων με Iterator");
        Iterator <String> iter = mySet.iterator();
                
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
		
        System.out.println();
        System.out.println("Εμφάνιση στοιχείων με πίνακα");
        
        Object[] array = mySet.toArray();
        for (int i = 0; i < array.length; i ++){
            name = (String) array[i];
            System.out.println(name);
        }
    }
}