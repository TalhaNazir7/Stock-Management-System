
package stockmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Design extends JFrame{
    private JLabel imglb,un,psd,main;
    private JTextField t1; 
    private JPasswordField p1;
    private JButton b1;
    
    public void initialize()
    {        
        Font f=new Font("Roman",Font.BOLD,22);
        Font f2=new Font("Roman",Font.BOLD,32);
        
        ImageIcon ic=new ImageIcon(getClass().getResource("Login.jpeg"));
        
        imglb=new JLabel();
        imglb.setIcon(ic);
        imglb.setBounds(0,0,800,600);
        this.add(imglb);
        
        main=new JLabel("STOCK MANAGEMENT SYSTEM");
        main.setBounds(150,100,500,40);
        main.setForeground(Color.YELLOW);
        main.setFont(f2);
        imglb.add(main);
        
        un=new JLabel("Username");
        //un.setForeground(Color.BLUE);
        un.setBounds(200,200,120,40);
        un.setForeground(Color.YELLOW);
        un.setFont(f);
        imglb.add(un);
        
        t1 = new JTextField();
        t1.setBounds(340,200,200,40);
        t1.setFont(new Font("Roman",Font.PLAIN,20));
        imglb.add(t1);
        
        psd=new JLabel("Password");
        //un.setForeground(Color.BLUE);
        psd.setBounds(200,250,120,40);
        psd.setForeground(Color.YELLOW);
        psd.setFont(f);
        imglb.add(psd);
        
        p1 = new JPasswordField();
        p1.setBounds(340,250,200,40);
        p1.setFont(f);
        imglb.add(p1);
        
        b1 = new JButton("Sign In");
        b1.setBounds(340,310,200,40);
        b1.setFont(new Font("Roman",Font.PLAIN,20));
        b1.addActionListener(new btnAction());
        imglb.add(b1);
    }
    
    public class btnAction implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(t1.getText().compareTo("Admin")==0 && String.valueOf(p1.getPassword()).compareTo("12345")==0)
            {
                dispose();
                InnerApp i=new InnerApp();
                i.setTitle("Inventory");
                i.setSize(800,600);
                i.getContentPane().setBackground(Color.LIGHT_GRAY);
                i.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                i.setLayout(null);
                i.initialize();
                i.setLocation(400, 100);
                i.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(new Frame(),"Invalid Credentials","ERROR",JOptionPane.WARNING_MESSAGE);     
            }
        }
        
    }
}
