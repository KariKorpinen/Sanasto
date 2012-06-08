/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package duplikaatti;

/**
 *
 * @author kkkorpin
 */
//package dsa.tries;
 
//import com.sun.org.apache.xml.internal.utils.Trie;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
 
public class TrieLoader {
  
 public static Trie trieDSA;
 Node root;				// keep track of the root
  Node position;
  String tiedostonimi;
  Object o4 ;//= new HashMap<String, String>();
 Object[] oArray2 ;
		//Object[] oArray1 = new Object[] {o1, o1, o2, o3, o3, o4};
		//Object[] oArray2 = new Object[] {o4};
 
 public static void main(String[] args) {
  	
  TrieLoader trieLoader = new TrieLoader();
  trieDSA = new Trie();
  trieLoader.load();
  trieLoader.etsi();
  //trieLoader.tulosta();
  new TrieTestFrame();
 }
  public void etsi(){
      System.out.println ("sisällä trieloader etsi funktio");
    //trieDSA.search("rivi");
      String s="rivi";
    trieDSA.tulosta(s,tiedostonimi);
  } 
 public void load(){
  //trieDSA = new Trie();
  BufferedReader br = null;
  try {
      tiedostonimi="src/properties/Musiciens2.txt";
   br = new BufferedReader(new FileReader(new File("src/properties/Musiciens2.txt")));
   
   //br = new BufferedReader(new FileReader(new File("src/properties/words.txt")));
   String eachLine = null;
   String[] pura;
   String delimiter = " ";
    int rivilaskuri=0;
   while((eachLine=br.readLine())!=null){
       //String[] temp;
      /* delimiter */
  //if s.nextLine().equals("")
      /* given string will be split by the argument delimiter provided. */
      //temp = str.split(delimiter);
      
       rivilaskuri++;
        System.out.println ("rivilaskuri "+rivilaskuri);
       if(eachLine.trim().isEmpty())
       {
        //   System.out.println ("tyhjä rivi ei lisätä");
       }
       else
         {
             System.out.println ("sisäänluetut rivilaskuri "+rivilaskuri);
      
      pura=eachLine.split(delimiter);
      for(int i =0; i < pura.length ; i++)
      {
          // if(pura[i].trim().isEmpty())
        // {
          //  System.out.println ("tyhjä");
        // }
         
       //  System.out.println (pura[i]);
         boolean oldValue=trieDSA.search(pura[i]);
       //  System.out.println ("vanha arvo "+oldValue);
         //if (line.trim().isEmpty()) {

       //  if(pura[i].trim().isEmpty())
       //  {
       //     System.out.println ("tyhjä");
       //  }
       //  else
       //  {
            if (oldValue == false) {
               trieDSA.insert(pura[i],rivilaskuri);
             //  System.out.println ("vanha arvo nolla");
               // No duplicates.
               //return;
            }
             //else if (oldValue instanceof HashSet) {
             // 3.1 There are already duplicates, so add the new one.
             //  HashSet duplicates = (HashSet) oldValue;
             //  duplicates.add (pura[i]);
             //  System.out.println ("onko tyyppiä hashset");
             // }
            else {
                // 3.2 This is the first duplicate => create a HashSet to store duplicates.
                ////////////////////////////////////////////////////7
               //o4= new HashMap< "pura",pura[i]>();
               //Object[] oArray1 = new Object[] {o1, o1, o2, o3, o3, o4};
		//oArray2 = new Object[] {o4};
               //Object[] oArray2 ;
		//Object[] oArray1 = new Object[] {o1, o1, o2, o3, o3, o4};
		//oArray2 = new Object[] {o4};
                /////////////////////////////////////////////////////////
             //  System.out.println ("luodaan hash set");
             //  HashSet duplicates = new HashSet ();
               // 3.3 Place old value and duplicate in hashset.
             //  duplicates.add (oldValue);
             //  duplicates.add (pura[i]);
              // o4=duplicates;
              // oArray2 = new Object[] {o4};
                trieDSA.insert(pura[i],rivilaskuri);
               //trieDSA.insert(oArray2.toString(),rivilaskuri);
              // System.out.println (oArray2[0].toString());
               // 3.4 Add the hashset itself as the value.
               //trieDSA.insert.
               //originalDataStructure.put (key, duplicates);
            }
         }
       //  System.out.println ("lopussa");
            //System.out.println (pura[i]);
     } 
    //trieDSA.
   }
  } catch (Exception e) {
   e.printStackTrace();
  } finally{
   if(br!=null){
    try {
     br.close();
    } catch (IOException e) {
     e.printStackTrace();
    }
   }
  }
  
 // System.out.println (trieDSA.toString());
 // trieDSA.tulosta("rivi");
 }
 public void tulosta()
 {
    
    // Trie trieDSA;
  /*   Collection values = trieDSA.values();
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
      * *
      */
    
 }
 /*public void print() {
		Node t=root;
		System.out.println(root.letter + " *");
		print(t.down);
	}

	void print(Node t) {
		if(t==null) return;
		//System.out.println(t.letter + " children");
		Node temp=t;
		while(t!=null) {
			System.out.print(t.letter + " ");
			if(t.endsWord)System.out.print("^");
			t=t.right;
		}
		System.out.println("*");
		t=temp;
		while(t!=null) {
			if(t.down!=null && t.right!=null) {
				System.out.println(t.letter + " children");
				print(t.down);

			}
			t=t.right;
		}
	}
*/
}