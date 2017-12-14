package com.jframedemo;
import javax.swing.*;
import java.awt.*;

public class main_jframe extends JFrame {
    public main_jframe() {
//        setSize(800,600);

        setTitle("Hello World");
        this.setBackground(Color.red);

//      set the frame to maximization
        setExtendedState(JFrame.MAXIMIZED_BOTH);
//      Set the frame position to be in the middle
//        this.setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        main_jframe ct1 = new main_jframe();
    }
}

