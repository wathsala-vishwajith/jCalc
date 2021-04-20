package com.sala;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        GUIForm form  = new GUIForm();
        JFrame frame = new JFrame("JCalc");
        frame.setContentPane(new GUIForm().getJPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

//        form.getA0Button().addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(frame,"Hello");
//                form.getTextField1().setText(form.getTextField1().getText() + "0");
//
//            }
//        });
    }
}
