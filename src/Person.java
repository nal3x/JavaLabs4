import java.util.HashSet;
import java.util.Iterator;

public class Person {
    private String surname;
    private String name;
    private int age;

    public Person(String name, String surname, int age) {   
        this.surname=surname;
        this.name=name;
        this.age=age;
    }
    
    public boolean equals(Object obj) {
        if(obj == null) return false;
        
        if (obj instanceof Person) {
            Person PersonObj=(Person) obj;
            if(surname.equals(PersonObj.surname) && name.equals(PersonObj.name) && age==PersonObj.age)
                return true;
        }
        return false;
    }

    public int hashCode() {
        return Integer.valueOf(name.charAt(0))+Integer.valueOf(surname.charAt(0))+age;
    }
    
    public String toString() {
        return surname + " " + name + " " + age;
        
    }
}


class Main {
	
    public static void main(String[] args){
	Person p1 = new Person("Douka", "Anna", 40);
	Person p2 = new Person("Pappa", "Eleni", 18);
	Person p3 = new Person("Domna", "Amalia", 40);
	Person p4 = new Person("Pappa", "Eleni", 18);
        
       HashSet <Person> personsSet=new HashSet<Person>();
     
	// Θα προστεθούν μόνο τα 3 αντικείμενα στο σύνολο
        personsSet.add(p1);
        personsSet.add(p2);
        personsSet.add(p3);
        personsSet.add(p4);
        
      	// Διάσχιση του συνόλου
        Iterator <Person> iter = personsSet.iterator();
                
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        Person p5 = new Person("Douka", "Anna", 40);
        System.out.println("Εμπεριέχεται στο σύνολο;"+ personsSet.contains(p5));
        
        
        }
    }
