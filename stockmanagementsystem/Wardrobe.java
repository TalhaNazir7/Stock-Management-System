package stockmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.*;
public class Wardrobe extends JFrame{
    private JLabel imglb,lb1,lb2,lb3,lb4,lb5;
    private JTextField t1,t2;
    private JButton b1,b2,b3;
    public void initialize()
    {
        ImageIcon ic=new ImageIcon(getClass().getResource("Wardrobe.jpeg"));
       
        imglb=new JLabel();
        imglb.setIcon(ic);
        imglb.setBounds(0,0,800,600);
        this.add(imglb);
        
        lb1=new JLabel("WELCOME TO WARDROBE",JLabel.CENTER);
        lb1.setFont(new Font("Roman",Font.BOLD,30));
        lb1.setForeground(Color.YELLOW);
        lb1.setBounds(150,20,500,50);
        imglb.add(lb1);
        
        lb2=new JLabel("ENTER PRODUCTS TO ADD TO STOCK",JLabel.CENTER);
        lb2.setFont(new Font("Roman",Font.BOLD,20));
        lb2.setBounds(90,100,620,40);
        lb2.setForeground(Color.YELLOW);
        imglb.add(lb2);
        
        lb5=new JLabel("Shirt  Jeans  Shoes  Socks  Watch  Tie",JLabel.CENTER);
        lb5.setFont(new Font("Roman",Font.BOLD,25));
        lb5.setBackground(Color.black);
        lb5.setOpaque(true);
        lb5.setForeground(Color.white);
        lb5.setBounds(100,200,600,40);
        imglb.add(lb5);
        
        lb3=new JLabel("Product Name",JLabel.CENTER);
        lb3.setFont(new Font("Roman",Font.BOLD,20));
        lb3.setBounds(200,300,200,40);
        lb3.setBackground(Color.black);
        lb3.setForeground(Color.white);
        lb3.setOpaque(true);
        imglb.add(lb3);
        
        t1=new JTextField();
        t1.setFont(new Font("Roman",Font.BOLD,20));
        t1.setBounds(400,300,200,40);
        imglb.add(t1);
        
        lb4=new JLabel("Enter Quantity",JLabel.CENTER);
        lb4.setFont(new Font("Roman",Font.BOLD,20));
        lb4.setBounds(200,350,200,40);
        lb4.setBackground(Color.black);
        lb4.setForeground(Color.white);
        lb4.setOpaque(true);
        imglb.add(lb4);
        
        t2=new JTextField();
        t2.setFont(new Font("Roman",Font.BOLD,20));
        t2.setBounds(400,350,200,40);
        imglb.add(t2);
        
        b1=new JButton("Add Record");
        b1.setFont(new Font("Roman",Font.BOLD,20));
        b1.setBounds(200,400,190,40);
        b1.addActionListener(new btnEvent4());
        imglb.add(b1);
        
        b2=new JButton("View Record");
        b2.setFont(new Font("Roman",Font.BOLD,20));
        b2.setBounds(410,400,190,40);
        b2.addActionListener(new btnEvent4());
        imglb.add(b2);
        
        b3=new JButton("Delete File");
        b3.setFont(new Font("Roman",Font.BOLD,20));
        b3.setBounds(200,450,190,40);
        b3.addActionListener(new btnEvent4());
        imglb.add(b3);
        
    }
    public class btnEvent4 implements ActionListener
    {        
        @Override
        public void actionPerformed(ActionEvent e) {
            String btntxt=e.getActionCommand();
            if(btntxt.compareTo("Add Record")==0)
            {
                if(t1.getText().compareTo("Shirt")==0||t1.getText().compareTo("Jeans")==0
                        ||t1.getText().compareTo("Shoes")==0||t1.getText().compareTo("Socks")==0
                        ||t1.getText().compareTo("Watch")==0||t1.getText().compareTo("Tie")==0)
                {
                    try
                    {
                    FileWriter f=new FileWriter("Wardrobe.txt",true);
                    f.write(t1.getText()+" , "+t2.getText()+"\n");
                    f.close();
                    t1.setText("");
                    t2.setText("");
                    JOptionPane.showMessageDialog(new Frame(),"Record Added","Message",JOptionPane.INFORMATION_MESSAGE);
                    }
                    catch(Exception ex)
                    {
                        
                        JOptionPane.showMessageDialog(new Frame(),ex.getMessage(),"ERROR",JOptionPane.WARNING_MESSAGE);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(new Frame(),"Wrong items","ERROR",JOptionPane.WARNING_MESSAGE);
                }
            }
            else if(btntxt.compareTo("View Record")==0)
            {
                ShowTable ans=new ShowTable();
                ans.initilizer("Wardrobe.txt");
            }
            else if(btntxt.compareTo("Delete File")==0)
            {
                try
                {
                    File f=new File("Wardrobe.txt");
                    f.delete();
                    JOptionPane.showMessageDialog(new Frame(),"Record deleted successfully","Deleted",JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception ex)
                {
                    
                }
            }
        }
        
    }
}
