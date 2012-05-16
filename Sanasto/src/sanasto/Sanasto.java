/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sanasto;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

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
      try{
            FileInputStream fstream = new FileInputStream("../Musiciens.txt");
            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null)   {
            // Print the content on the console
               System.out.println (strLine);
            }
            //Close the input stream
            in.close();
         }catch (Exception e){//Catch exception if any
         System.err.println("Error: " + e.getMessage());
      }   
      try{
            FileInputStream fstream2 = new FileInputStream("../Berlioz.txt");
            
            DataInputStream in2 = new DataInputStream(fstream2);
            BufferedReader br2 = new BufferedReader(new InputStreamReader(in2));
            String strLine2;
            //Read File Line By Line
            while ((strLine2 = br2.readLine()) != null)   {
            // Print the content on the console
               System.out.println (strLine2);
            }
            //Close the input stream
            in2.close();
         }catch (Exception e){//Catch exception if any
         System.err.println("Error: " + e.getMessage());
      }   
   } 
}

