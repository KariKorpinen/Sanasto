/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package duplikaatti;

/**
 *
 * @author kkkorpin
 */
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class TrieTestFrame extends JFrame {
 
 private static final long serialVersionUID = 1L;
  
 private JPanel basePanel = new JPanel();
 private JTextField textField = new JTextField(20);
 private JButton button = new JButton("Check");
 
 public TrieTestFrame(){
  designUI();
 }
  
 private void designUI(){
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setTitle("TRIE Test");
   
  button.addActionListener(new ActionListener() {
   @Override
   public void actionPerformed(ActionEvent e) {
    if(TrieLoader.trieDSA.search(textField.getText())){
     JOptionPane.showMessageDialog(basePanel, "The word you entered exist!!");
    }else{
     JOptionPane.showMessageDialog(basePanel, "The word you entered does not exist!!","Error",JOptionPane.ERROR_MESSAGE);
    }
   }
  });
   
  basePanel.add(textField);
  basePanel.add(button);
   
  add(basePanel);
   
  this.setSize(400,100);
   
  Toolkit tk = Toolkit.getDefaultToolkit();
     Dimension screenSize = tk.getScreenSize();
     int screenHeight = screenSize.height;
     int screenWidth = screenSize.width;
     setLocation(screenWidth / 2 - 200, screenHeight / 2 - 50);
   
  this.setVisible(true);
 }
}
