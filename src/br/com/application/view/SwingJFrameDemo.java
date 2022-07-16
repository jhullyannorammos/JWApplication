package br.com.application.view;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SwingJFrameDemo extends javax.swing.JFrame {
    
    
    public SwingJFrameDemo() {
        super("Demo program for JFrame");
        
        JFrame frame = new JFrame("Demo program for JFrame");
        frame.setSize( 450, 300 );     // set it to 150 wide by 100 high
        frame.setVisible( true );      // ask it to become visible
        frame.setLayout(new GridBagLayout());
        frame.setLayout(new GridLayout());
        frame.setLayout(new CardLayout());
        frame.setLayout(new FlowLayout());
        frame.setLayout(null);
        
        LayoutManager layout = null;
        frame.getContentPane().setLayout(layout);
        
        JTextField textFieldUserName = new JTextField(50);
        frame.add(textFieldUserName);
        
        frame.getContentPane().add(textFieldUserName);


    }
    
    public static void main ( String[] args ){
    
    }
}
