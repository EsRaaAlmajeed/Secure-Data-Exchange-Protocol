/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allint;

import java.awt.Color;

/**
 *
 * @author Lamoso
 */
public class Allint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ASL s= new ASL();
        s.setLocationRelativeTo(null);
        s.getContentPane().setBackground(new Color (120,170,125));
         s.setVisible(true);
         TCP t = new TCP ();
          t.setSize(3000,3000);
          t.setLocationRelativeTo(null);
          t.getContentPane().setBackground(new Color (120,170,125));
          t.setVisible(true);
           all e = new  all();
         e.setSize(3000,3000);
        e.setLocationRelativeTo(null);
        e.getContentPane().setBackground(new Color (120,170,125));
         e.setVisible(true);
       
        
         
         
    }

  
    
}
