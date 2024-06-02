
package stockmanagementsystem;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ShowTable extends JFrame implements MouseListener {
     JFrame frame=new JFrame();
     String[][] data={
                                        
                    };

        String [] cols={"Name","Quantity"};
        
    DefaultTableModel tmod=new DefaultTableModel(data,cols);

    JTable tb=new JTable(tmod);
    
     public void initilizer( String a)
     {
        frame.setBounds(350,120,570,140);
frame.setVisible(true);

        tb.addMouseListener(this);
        JScrollPane sc=new JScrollPane(tb);
        //sc.add(tb);
        sc.setBounds(5,0,545,100);
        this.add(sc);
        frame.add(sc);
        
        File fr=new File(a);
        try
        {
        Scanner input=new Scanner(fr);
        while(input.hasNext())
        {
            String str=input.nextLine();
            String[] row=str.split(",");
            tmod.addRow(row);
        }
        input.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
     }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
  }

    @Override
    public void mouseExited(MouseEvent e) {
   }
    
}
