/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package duplikaatti;

import java.util.*;

/**
 *
 * @author kkkorpin
 */
public class Duplikaatti {
   // import java.util.*;

//public class Duplicate {

  // Any Map can be used, e.g., TreeMap.
  static Map originalDataStructure = new HashMap();
  

  // Insertion.

  static void insert (Object key, Object value)
  {
    // 1. Attempt a direct insertion.
    Object oldValue = originalDataStructure.put (key, value);

    // 2. If the value wasn't already there, nothing to be done.
    if (oldValue == null) {
      // No duplicates.
      return;
    }

    // 3. Otherwise, check if duplicates already exist.
    if (oldValue instanceof HashSet) {
      // 3.1 There are already duplicates, so add the new one.
      HashSet duplicates = (HashSet) oldValue;
      duplicates.add (value);
    }
    else {
      // 3.2 This is the first duplicate => create a HashSet to store duplicates.
      HashSet duplicates = new HashSet ();
      // 3.3 Place old value and duplicate in hashset.
      duplicates.add (oldValue);
      duplicates.add (value);
      // 3.4 Add the hashset itself as the value.
      originalDataStructure.put (key, duplicates);
    }
  }
  /*
 static void insert (Object key, Object value,Object value2)
  {
    // 1. Attempt a direct insertion.
    Object oldValue2 = originalDataStructure.put (key, value,value2);

    // 2. If the value wasn't already there, nothing to be done.
    if (oldValue == null) {
      // No duplicates.
      return;
    }

    // 3. Otherwise, check if duplicates already exist.
    if (oldValue instanceof HashSet) {
      // 3.1 There are already duplicates, so add the new one.
      HashSet duplicates = (HashSet) oldValue;
      duplicates.add (value);
    }
    else {
      // 3.2 This is the first duplicate => create a HashSet to store duplicates.
      HashSet duplicates = new HashSet ();
      // 3.3 Place old value and duplicate in hashset.
      duplicates.add (oldValue);
      duplicates.add (value);
      // 3.4 Add the hashset itself as the value.
      originalDataStructure.put (key, duplicates);
    }
  }
  * 
  */

  // Enumerate and print all values.

  static void printAll ()
  {
    Collection values = originalDataStructure.values();
    for (Iterator i=values.iterator();  i.hasNext(); ) {
      Object obj = i.next();
      // If the value is a HashSet, we have duplicates.
      if (obj instanceof HashSet) {
        // Extract the different values.
        HashSet duplicates = (HashSet) obj;
        for (Iterator j=duplicates.iterator();  j.hasNext(); ) {
          System.out.println (j.next());
        }
      }
      else {
        // If it's not a HashSet, the extract obj is a value.
        System.out.println (obj);
      }
    }
  }

  public static void main (String[] argv)
  {
    // Add data with duplicates.
    insert ("Ali", "Anorexic Ali");
    insert ("Bill", "Bulimic Bill");
    insert ("Bill", "Blasphemous Bill");     // Duplicate.
    insert ("Chen", "Cadaverous Chen");
    insert ("Dave", "Dyspeptic Dave");
    insert ("Dave1", "Duplicitous Dave"); 
    insert ("Dave2", "Duplicitous Dave"); 
    insert ("Dave3", "Duplicitous Dave"); 
    insert ("Dave4", "Duplicitous Dave"); 
    insert ("Dave5", "Duplicitous Dave");     // Duplicate.
    insert ("Dave6", "Diabolical Dave");      // Duplicate.
    insert ("Ella", "Egregious Ella");
    insert ("Franco", "Flatulent Franco");
    insert ("Gita", "Gluttonous Gita"); 
    insert ("Gita", "Grotesque Gita");       // Duplicate.

    // Print.
    printAll();
  }

}

    /*

    /**
     * @param args the command line arguments
     */
   /* public static void main(String[] args) {
        // TODO code application logic here
    }*/
//}
