package com.sala;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import org.mariuszgromada.math.mxparser.*;

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
        getA2Button().addActionListener(e -> getTextField1().setText(getTextField1().getText() + "2"));
        getA3Button().addActionListener(e -> getTextField1().setText(getTextField1().getText() + "3"));
        getA4Button().addActionListener(e -> getTextField1().setText(getTextField1().getText() + "4"));
        getA5Button().addActionListener(e -> getTextField1().setText(getTextField1().getText() + "5"));
        getA6Button().addActionListener(e -> getTextField1().setText(getTextField1().getText() + "6"));
        getA7Button().addActionListener(e -> getTextField1().setText(getTextField1().getText() + "7"));
        getA8Button().addActionListener(e -> getTextField1().setText(getTextField1().getText() + "8"));
        getA9Button().addActionListener(e -> getTextField1().setText(getTextField1().getText() + "9"));
        getButton4().addActionListener(e -> getTextField1().setText(getTextField1().getText() + "+"));
        getButton7().addActionListener(e-> getTextField1().setText(getTextField1().getText() + "-"));
        getButton11().addActionListener(e-> getTextField1().setText(getTextField1().getText() + "/"));
        getButton13().addActionListener(e-> getTextField1().setText(getTextField1().getText() + "."));
        getcButton().addActionListener(e-> getTextField1().setText(""));

        getButton15().addActionListener(e -> {
            Expression e1 = new Expression(getTextField1().getText());
            getTextField1().setText(String.valueOf(e1.calculate()));
        });

        getJPanel().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
//                super.keyReleased(e);
                getTextField1().setText(getTextField1().getText()+e.getKeyChar());
            }
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
