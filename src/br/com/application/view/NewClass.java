package br.com.application.view;

import java.awt.*; 
import javax.swing.*;

class myFrame extends JFrame {
 
  public void paint ( Graphics g )  {
    g.drawString("A myFrame object", 100, 500 );
  } 
  
  public static void main ( String[] args )
  {
    myFrame frame = new myFrame(); // construct a myFrame object
    frame.setSize( 450, 300 );     // set it to 150 wide by 100 high
    frame.setVisible( true );      // ask it to become visible
  }
  
  
} 

