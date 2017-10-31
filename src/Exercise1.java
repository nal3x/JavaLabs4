import java.util.*;
        

public class Exercise1 {
    
    public static void listModifier (ArrayList<Integer> list) {
        int index = 0; //position where element will be added
        int initialSize = list.size(); //initial size of list equals the number of operations
        
        for (int i = 0; i < initialSize; i++) {
            int element = list.get(index); 
            for (int j = 0; j < element - 1; j++) {
                list.add(index, element);
            }
            index += element; //reposition index shifting by #element positions
        }       
    }
    
    public static void scale(ArrayList<Integer> list) {
        /*fills the list from end to start, no need for index
        to track position of insertion
        */
        for (int i = list.size() - 1; i >= 0; i--) { 
//            System.out.println(list);
            int item = list.get(i); 
            for (int j = 0; j < item-1; j++) { 
                list.add(i, item); 
            } 
        } 
    } 
    
    public static void printList (ArrayList<Integer> list) {
        for (int i: list)
            System.out.print(i + ",");
        System.out.println("\b");
    }
    
    public static void main (String[] args) {
        Random r = new Random();
        ArrayList <Integer> myList = new ArrayList<Integer>();
        
        //fills the list
        for(int i = 0; i < 10; i++) {
            myList.add(r.nextInt(5) + 1);
        }
        
        printList(myList);
        
        //listModifier(myList);
        scale(myList);
        printList(myList);
        
        
    }
    
}
