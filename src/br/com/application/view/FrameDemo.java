package br.com.application.view;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameDemo extends javax.swing.JFrame implements WindowListener {
 
    public FrameDemo() {
        super("Frame Demo");
        // initialization code...
 
        setSize(300, 400);
 
        addWindowListener(this);
 
        setVisible(true);
    }
 
    public void windowActivated(WindowEvent event) {
        System.out.println("The window has been activated");
    }
 
    public void windowClosed(WindowEvent event) {
        System.out.println("The window has been closed");
    }
 
    public void windowClosing(WindowEvent event) {
        System.out.println("About to close the window");
    }
 
    public void windowDeactivated(WindowEvent event) {
        System.out.println("The window has been deactivated");
    }
 
    public void windowDeiconified(WindowEvent event) {
        System.out.println("The window has been restored");
    }
 
    public void windowIconified(WindowEvent event) {
        System.out.println("The window has been minimized");
    }
 
    public void windowOpened(WindowEvent event) {
        System.out.println("The window has been opened");
    }
}
