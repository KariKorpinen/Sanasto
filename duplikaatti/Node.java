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
 
import java.util.Collection;
import java.util.LinkedList;
 
/**
 * @author Braga
 */
public class Node {
 char content;
 boolean marker;
 int [] rivit;
 Collection<Node> child;
  
 //public Node(char c){
 public Node(char c){
  child = new LinkedList<Node>();
  marker = false;
  rivit=new int[10];
  //rivit[0]=0;
 //  System.out.println("node "+c);
 //  System.out.println("node rivi "+c);
  content = c;
 }
  
 public Node subNode(char c){
  if(child!=null){
   for(Node eachChild:child){
    if(eachChild.content == c){
     return eachChild;
    }
   }
  }
  return null;
 }
}