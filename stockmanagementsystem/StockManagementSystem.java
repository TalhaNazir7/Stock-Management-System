
package stockmanagementsystem;
import java.awt.*;
import javax.swing.JFrame;
public class StockManagementSystem {

    public static void main(String[] args) {
        Design d=new Design();
  
        d.setTitle("Stock Management System");
        d.setSize(800,600);
//        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        d.getContentPane().setBackground(Color.LIGHT_GRAY);
        d.setLocation(400, 100);
            
        d.setLayout(null);
        d.initialize();
        d.setVisible(true);
         
    }
    
}
