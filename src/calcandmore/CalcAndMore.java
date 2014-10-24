/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calcandmore;

import java.awt.CardLayout;
import java.awt.LayoutManager;
import javax.swing.JFrame;
import javax.swing.JPanel;

/** 
 * @author Charles
 * 
 * This class is the frame that holds the GUIs
 */
public class CalcAndMore extends JFrame {
    
    private LayoutManager cl = new CardLayout();
    private JPanel pages = new JPanel(cl);    
    private Calculator calc = new Calculator();
    
    public CalcAndMore(){
        //setSize(600,600);
        pages.add(calc);
        this.add(pages);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        this.pack();
    }
    
    public static void main(String[] args) {

        new CalcAndMore();
        
    }
}
