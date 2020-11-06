/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BarberSystem;

import BarberSystem.BarberSystemCa;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Maicon
 */
class loginresponse extends JFrame {

    public loginresponse() {
      
        this.setVisible(true);
        this.setSize(500, 300);
        BorderLayout frameLayout = new BorderLayout();
        this.setLayout(frameLayout);
        this.setDefaultCloseOperation(BarberSystemCa.EXIT_ON_CLOSE);
      //  JFrame window = new JFrame();
        
         GridLayout topLayout = new GridLayout(1, 1);
        JPanel pn = new JPanel ();
        JLabel response = new JLabel("YOU ARE NOT LOGGED IN YET");
       // response.setBackground(Color.ORANGE);
        pn.add(response);
        this.add(pn, BorderLayout.CENTER);
    }

}
