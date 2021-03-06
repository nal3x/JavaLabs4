import java.util.*;

public class TestArrayList2 {

    public static void main ( String [ ] args ) {
    
	ArrayList list2 = new ArrayList () ;
	String arr [ ] = { "One","","three",null,"Samos" } ;

	//Διαφορετικοί τρόποι για να προσθέσεις στοιχεία 
	for ( int i=0;i < arr.length;i++ )
	{
	list2.add (i, arr[i]);
	}
					
	list2.add (new Float( 3.5 )) ;
	list2.add ("Karlovassi");
	list2.add (new Integer(5)) ;
	list2.add (null);
	list2.add (5) ;

	String aa="Software Engineer";
	list2.add (1, aa);

	//Εμφάνιση των στοιχείων της λίστας arraylist
	System.out.println ( "Τα στοιχεία της λίστας είναι : " ) ;

	for ( int i=0;i < list2.size ( ) ;i++ )
	{
	System.out.println (" " + ( i+1 ) + ") " + list2.get(i));
	}

    System.out.println ( "Μέγεθος λίστας= "+list2.size ( ) ) ;
    System.out.println ( "Είναι άδεια η λίστα?= "+ list2.isEmpty ( )) ;

    //Θέτουμε το στοιχείο στην θέση 1
    list2.set (1, "J2EE Programmer");

    //Μετατρέπουμε το arraylist σε πίνακα
    System.out.println ( "Τα στοιχεία του ArrayList σε πίνακα είναι " ) ;
    Object list2array [ ] = list2.toArray ( );

    for ( int i=0;i < list2array.length;i++ ) {
        System.out.println ( " "+ ( i+1 ) +") "+list2array [ i ] ) ;
    }

    //Έλεγχος εάν ένα αντικείμενο εμπεριέχεται στην Arraylist
    System.out.println ( "Περιέχει την τιμή \"one\" =" + list2.contains ("one")) ;
    System.out.println ( "Περιέχει την τιμή \"null\" =" + list2.contains ( null ) ) ;

    //Επιστρέφει την θέση του αντικειμένου
    //Το 1ο στοιχείο είναι 0, οπότε θα επιστρέψει την τιμή 4
    System.out.println ( "θέση της τιμής \"null\" ="+list2.indexOf( null));

    //Επιστρέφει την τελευταία θέση ενός αντικειμένου στην λίστα
    System.out.println ( "Τελευταία θέση του αντικειμένου \"new Integer(5) \" = " + list2.lastIndexOf (new Integer(5)));

    //Διαγράφει τα στοιχεία από την Arraylist
    list2.remove (2);
    System.out.println ("Το μέγεθος της arraylist= " + list2.size( ));

    list2.clear ( );
    System.out.println ("Το μέγεθος της arraylist= " + list2.size( ));
    
    }
}
