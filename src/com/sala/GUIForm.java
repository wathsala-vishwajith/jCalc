package com.sala;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIForm {
    private JPanel panel;
    private JTextField textField1;
    private JButton a4Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton button4;
    private JButton a5Button;
    private JButton a6Button;
    private JButton button7;
    private JButton a1Button1;
    private JButton a2Button;
    private JButton a3Button;
    private JButton button11;
    private JButton a0Button;
    private JButton button13;
    private JButton cButton;
    private JButton button15;
    private JButton a7Button;

    public GUIForm() {
        getA0Button().addActionListener(e -> {
            //JOptionPane.showMessageDialog(null,"Hello");
            getTextField1().setText(getTextField1().getText() + "0");
        });
        getA1Button1().addActionListener(e -> {
                //JOptionPane.showMessageDialog(null,"Hello");
                getTextField1().setText(getTextField1().getText() + "1");

        });
        getA2Button().addActionListener(e -> {
                getTextField1().setText(getTextField1().getText() + "2");

        });

    }

    public JPanel getJPanel(){
        return panel;
    }
    public JButton getA1Button1(){
        return a1Button1;
    }

    public JButton getA0Button() {
        return a0Button;
    }

    public JButton getA2Button() {
        return a2Button;
    }

    public JButton getA3Button() {
        return a3Button;
    }

    public JButton getA4Button() {
        return a4Button;
    }

    public JButton getA5Button() {
        return a5Button;
    }

    public JButton getA6Button() {
        return a6Button;
    }

    public JButton getA7Button() {
        return a7Button;
    }

    public JButton getA8Button() {
        return a8Button;
    }

    public JButton getA9Button() {
        return a9Button;
    }

    public JButton getButton4() {
        return button4;
    }

    public JButton getButton7() {
        return button7;
    }

    public JButton getButton11() {
        return button11;
    }

    public JButton getButton13() {
        return button13;
    }

    public JButton getButton15() {
        return button15;
    }

    public JButton getcButton() {
        return cButton;
    }
    public JTextField getTextField1() {
        return textField1;
    }




    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
