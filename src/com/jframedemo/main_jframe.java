package com.jframedemo;
import javax.swing.*;
import java.awt.*;

public class main_jframe extends JFrame {
    public main_jframe() {
        setSize(800,600);
        setVisible(true);
        setTitle("Hello World");
        //etBackground(Color.red);
        //this.getContentPane().setBackground(Color.red);

        JPanel jp =  new JPanel();
        jp.setBackground(Color.blue);

        this.add(jp);
    }
    public static void main(String[] args) {
        main_jframe ct1 = new main_jframe();
    }
}

