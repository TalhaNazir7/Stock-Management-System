package stockmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class InnerApp extends JFrame{
    private JLabel lb1,lb3,mainlb;
    //private JTable tbl;
    private JButton b1,b2,b3,b4;
    
    public void initialize()
    {
    
        Font f=new Font("Roman", Font.BOLD, 30);
        
        ImageIcon ic=new ImageIcon(getClass().getResource("Category.jpeg"));
        
        mainlb=new JLabel();
        mainlb.setIcon(ic);
        mainlb.setBounds(0,0,800,600);
        this.add(mainlb);
        
        lb1=new JLabel("WELCOME TO INVENTORY",JLabel.CENTER);
        lb1.setFont(f);
        lb1.setForeground(Color.YELLOW);
        lb1.setBounds(150,20,500,50);
        mainlb.add(lb1);
        
        lb3=new JLabel("CHOOSE THE CATEGORY OF PRODUCTS",JLabel.CENTER);
        lb3.setFont(new Font("Roman",Font.BOLD,20));
        lb3.setForeground(Color.YELLOW);
        lb3.setBounds(90,100,620,40);
        mainlb.add(lb3);
        
        b1=new JButton("Grocery");
        b1.setFont(new Font("Roman",Font.BOLD,20));
        b1.setBounds(325,200,150,40);
        b1.addActionListener(new btnHandle());
        mainlb.add(b1);
        
        b2=new JButton("Wardrobe");
        b2.setFont(new Font("Roman",Font.BOLD,20));
        b2.setBounds(325,280,150,40);
        b2.addActionListener(new btnHandle());
        mainlb.add(b2);
        
        b3=new JButton("Electronics");
        b3.setFont(new Font("Roman",Font.BOLD,20));
        b3.setBounds(325,350,150,40);
        b3.addActionListener(new btnHandle());
        mainlb.add(b3);
        
        b4=new JButton("Cutlery");
        b4.setFont(new Font("Roman",Font.BOLD,20));
        b4.setBounds(325,420,150,40);
        b4.addActionListener(new btnHandle());
        mainlb.add(b4);
        
    }
    public class btnHandle implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            String btntxt=e.getActionCommand();
            if(btntxt.compareTo("Grocery")==0)
            {
                Grocery g = new Grocery();
                g.setTitle("Grocery");
                g.setSize(800,600);   
                g.initialize();
                g.setLocation(400, 100);
                g.setVisible(true);
                
            }
            else if(btntxt.compareTo("Wardrobe")==0)
            {
                Wardrobe w = new Wardrobe();
                w.setTitle("Wardrobe");
                w.setSize(800,600);   
                w.initialize();
                w.setLocation(400, 100);
                w.setVisible(true);
            }
            else if(btntxt.compareTo("Electronics")==0)
            {
                Electronics el = new Electronics();
                el.setTitle("Electronics");
                el.setSize(800,600);   
                el.initialize();
                el.setVisible(true);
                el.setLocation(400, 100);
            }
            else if(btntxt.compareTo("Cutlery")==0)
            {
                Cutlery c = new Cutlery();
                c.setTitle("Cutlery");
                c.setSize(800,600);   
                c.initialize();
                c.setLocation(400, 100);
                c.setVisible(true);
            }
        }
        
    }
}
