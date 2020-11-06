package BarberSystem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class BarberSystemCa extends JFrame implements ActionListener {

    public static void main(String[] args) {

        new BarberSystemCa();

    }

    public BarberSystemCa() {
        this.WindowSetup();

    }

    public void WindowSetup() {
        
        //  ==============THE MAIN WINDOW==================
        // this is the whole page itself, the window
        this.setVisible(true);
        this.setSize(1000, 600);
        BorderLayout frameLayout = new BorderLayout();
        this.setLayout(frameLayout);
        this.setDefaultCloseOperation(BarberSystemCa.EXIT_ON_CLOSE);

        // ================TOP SECTION==========================
        // my top section here, im dividing my top panel into two grids
        JPanel topPanel = new JPanel();
        GridLayout topLayout = new GridLayout(1, 2);
        topPanel.setLayout(topLayout);

        // here i`m adding this panel to my window. 
        this.add(topPanel, BorderLayout.PAGE_START);

        // here i`m organizing my left part of my top grid
        JPanel leftpanel = new JPanel();
        FlowLayout leftLayout = new FlowLayout();
        leftpanel.setLayout(leftLayout);
        leftLayout.setAlignment(FlowLayout.LEFT);

        //im adding a label to my left panel on top
        JLabel label1 = new JLabel("Customer Login");
        leftpanel.add(label1);
        JButton bt = new JButton("name");
        label1.add(bt);

        // and here im adding all of this to the left top panel
        topPanel.add(leftpanel);

        // now i`m fixing the right part of my top panel
        JPanel rightpanel = new JPanel();
        FlowLayout rightLayout = new FlowLayout();
        rightpanel.setLayout(rightLayout);
        rightLayout.setAlignment(FlowLayout.RIGHT);

        JButton buton1 = new JButton("Register your details:");
        JButton buton2 = new JButton("Find a slot");
        rightpanel.add(buton1);
        rightpanel.add(buton2);

        // now im adding all of this to the top panel on the right part.
        topPanel.add(rightpanel);

        //=======================MAIN AREA===================================
        // now im setting the main are, such as the lines
        JPanel mainarea = new JPanel();
        BorderLayout mainAreaLayout = new BorderLayout();
        mainarea.setLayout(mainAreaLayout);

        // now i will add this into the center of the window 
        this.add(mainarea, BorderLayout.CENTER);

        // 
        JPanel miniTopPanel = new JPanel();

        FlowLayout miniTopLayout = new FlowLayout();
        miniTopPanel.setLayout(miniTopLayout);
        miniTopLayout.setAlignment(FlowLayout.LEFT);

        JButton buttonLogin = new JButton("LOGIN ");
        buttonLogin.setActionCommand("buttonlogin");
        miniTopPanel.add(buttonLogin);
        buttonLogin.addActionListener(this);

        mainarea.add(miniTopPanel, BorderLayout.PAGE_START);

        //=========================DIVIDING MAIN AREA INTO 2 =======================
        JPanel MainArea = new JPanel();

        // dividing the section into two pieces (ONE ROW - TWO COLUMNS)
        GridLayout miniMainLayout = new GridLayout(1, 2);
        MainArea.setLayout(miniMainLayout);

        //===============LEFT PART==================
        // organising the left part
        JPanel leftpart = new JPanel();

        // Here I`m dividing the grid into two, so Im using a black line boarder for that
        leftpart.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        MainArea.add(leftpart);

        JLabel l2 = new JLabel("Customer");
        leftpart.add(l2);
        FlowLayout left = new FlowLayout();
        leftpart.setLayout(left);
        left.setAlignment(FlowLayout.TRAILING);

        TextField tx = new TextField("name     ");
        TextField tx2 = new TextField("Phone     ");
        TextField tx3 = new TextField("Email    ");
        TextField tx4 = new TextField("Password    ");
        leftpart.add(tx);
        leftpart.add(tx2);
        leftpart.add(tx3);
        leftpart.add(tx4);
        
        
        JButton customerlogin = new JButton ("Customer Login");
        leftpart.add(customerlogin);
        
        
//========================RIGHT PART=======================
        // here I`m adding my right part to my main area
        JPanel rightpart = new JPanel();
        MainArea.add(rightpart);

        GridLayout RightPartLayout = new GridLayout(1, 1);
        rightpart.setLayout(RightPartLayout);
       // JTabbedPane jp = new JTabbedPane();

        // adding my label to my right part
        JPanel smallerpanel = new JPanel();
        rightpart.add(smallerpanel);
        smallerpanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JLabel l4 = new JLabel("Barber Login");
        smallerpanel.add(l4);

        mainarea.add(MainArea, BorderLayout.CENTER);

        
        TextField name = new TextField("name     ");
        TextField location = new TextField("location     ");
        TextField phone = new TextField("Phone     ");
        TextField email = new TextField("Email    ");
        TextField password = new TextField("Password    ");
        smallerpanel.add(name);
        smallerpanel.add(location);
        smallerpanel.add(phone);
        smallerpanel.add(email);
        smallerpanel.add(password);
        
        
        JButton barberlogin = new JButton ("Barber Login");
        barberlogin.setActionCommand("barberlogin");
        barberlogin.addActionListener(this);
        smallerpanel.add(barberlogin);
        

        // NEVER FORGET THESE TWO BAD BOYS
        this.validate();
        this.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("buttonlogin")) {
            this.setVisible(true);
            new loginresponse();
            new barberlogin ();
        }

    }

}
