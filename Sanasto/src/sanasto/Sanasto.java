/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sanasto;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author kkkorpin
 */
public class Sanasto {
/**
  * @param args the command line arguments
*/
   public static void main(String[] args) {
   // TODO code application logic here
      TreeSet <String>tree = new TreeSet<String>(); 
      int rivilaskuri=0;
      String tiedosto="../Musiciens.txt";
      try{
         FileInputStream fstream = new FileInputStream(tiedosto);
         //luodaan streami sisäänluettavalle tiedostolle
         DataInputStream in = new DataInputStream(fstream);
         //luodaan objekti streamille 
         BufferedReader br = new BufferedReader(new InputStreamReader(in));
         //luodaan streamille puskuroitu lukija 
         String strLine;
         while ((strLine = br.readLine()) != null)   {
            //luetaan tiedostoa rivi riviltä
            rivilaskuri++;
            //lisätään luettuun riviin tiedostonimi ja rivinumero
            tree.add("tiedosto "+tiedosto.substring(3)+" rivi "+rivilaskuri+" "+strLine);
            //tree.add(tiedosto.substring(3)+" "+rivilaskuri+" "+strLine);
         }
         in.close();
         //suljetaan sisäänlukustreami
      }catch (Exception e){//siepataan poikkeus ja yritetään tulostaa virheenaiheuttaja
         System.err.println("Error: " + e.getMessage());
      }   
      
      try{  //käsitellään toinen tiedosto
         rivilaskuri=0;; 
         tiedosto=""; 
         tiedosto="../Berlioz.txt"; 
         FileInputStream fstream2 = new FileInputStream(tiedosto);
         DataInputStream in2 = new DataInputStream(fstream2);
         BufferedReader br2 = new BufferedReader(new InputStreamReader(in2));
         String strLine2;
         while ((strLine2 = br2.readLine()) != null)   {
            rivilaskuri++;
            //tree.add("tiedosto "+tiedosto.substring(3)+" rivi "+rivilaskuri+" "+strLine2);
            tree.add(tiedosto +" "+rivilaskuri+" "+strLine2);
            //tree.add(tiedosto.substring(3) +" "+rivilaskuri+" "+strLine2);
         }
         in2.close();
      }catch (Exception e){
      System.err.println("Error: " + e.getMessage());
      }
      Iterator iterator;
      iterator = tree.iterator();
      //haku ei palauta sanoja,joihin kuuluu muita merkkejä,kuten "Beethoven,"tai "-Beethoven" 
      String haku="Beethoven";
      while (iterator.hasNext()){    
         String s = iterator.next().toString();
         //pilkotaan rivi sanoiksi
         String[] words2 = s.split(" ");
         for (String word : words2)//käydään sanat läpi  
         {
            if(word.equals(haku))//jos sana on sama kuin hakuarvo,se tulostetaan
            {
               System.out.println(s);
               //Haun tulostus tulee muodossa
               //Berlioz.txt 9119 directeur des Beaux-Arts s'exprimer ainsi. Il admettait que Beethoven
               //Musiciens.txt 581 romantisme indompté de Beethoven et de Berlioz, la tragédie du siècle,
            }   
         }  
      }
      iterator=null;
   }   
}

