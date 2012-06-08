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
 
public class Trie{
 private Node root;
 
 public Trie(){
  root = new Node(' ');
 }
 
 public void insert(String s,int rivilaskuri){
  Node current = root;
  if(s.length()==0) //For an empty character
   current.marker=true;
  for(int i=0;i<s.length();i++){
   Node child = current.subNode(s.charAt(i));
   if(child!=null){
    current = child;
   }
   else{
    current.child.add(new Node(s.charAt(i)));
    current = current.subNode(s.charAt(i));
   }
   // Set marker to indicate end of the word
   if(i==s.length()-1)
   {
       for(int je=0;je<current.rivit.length;je++)
       {
           if(current.rivit[je]==0)
           {
              current.rivit[je]=rivilaskuri;
              current.marker = true;
              return;
           }
           System.out.println("trie insert rivilaskurissa tavaraa "+current.rivit[je]);
       }
       current.rivit[0]=rivilaskuri;
       System.out.println("trie insert rivilaskuri "+current.rivit[0]); 
       System.out.println("trie insert rivilaskuri sisältö pituus "+current.rivit.length);
       for(int ji=0;ji<current.rivit.length;ji++)
       {
           if(current.rivit[ji]>0)
               System.out.println("trie insert rivilaskuri isompi kuin nolla "+current.rivit[ji]);
       }
    current.marker = true;
   }
   }
 }
 
 public boolean search(String s){
  Node current = root;
  while(current != null){
   for(int i=0;i<s.length();i++){   
    if(current.subNode(s.charAt(i)) == null)
     return false;
    else
     current = current.subNode(s.charAt(i));
   }
   /*
    * This means that a string exists, but make sure its
    * a word by checking its 'marker' flag
    */
   if (current.marker == true)
   {
       System.out.println("trie search "+s); 
    return true;
   }   
   else
    return false;
  }
  return false;
 }
 public boolean tulosta(String s,String tiedostonimi){
 //public boolean tulosta(){
  Node current = root;
 // int luku=10;
  while(current != null){
 //  for(int i=0;i<luku;i++){   
    for(int i=0;i<s.length();i++){
      if(current.subNode(s.charAt(i)) == null)
        return false;
    else
      {
         current = current.subNode(s.charAt(i));
         System.out.println("trie tulosta "+s.charAt(i));
      }
   }
   /*
    * This means that a string exists, but make sure its
    * a word by checking its 'marker' flag
    */
   if (current.marker == true)
   {
       System.out.println("trie tulosta current rivilaskuri "+current.rivit[0]);
       for(int jii=0;jii<current.rivit.length;jii++)
       {
           int vertaa=0;
           vertaa=current.rivit[jii];
          if(vertaa>0) 
          System.out.println("löytyi riviltä  "+current.rivit[jii]+" "+tiedostonimi);       
       }
       System.out.println("trie tulosta marker true "+s);   
    return true;
   }   
else
    return false;
  }
  return false;
 }
}