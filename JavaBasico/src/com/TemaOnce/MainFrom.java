package com.TemaOnce;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainFrom {
    private JTextPane PricePane;
    private JTextPane PriceIva;
    private JTextPane TotalPane;
    private JButton BotonCalcular;
    private JPanel PanelText;

    public MainFrom() {
        //BotonCalcular.addActionListener(BotonCalcular());

        PricePane.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                String valorPrecio = PricePane.getText()+"ñ";
                PricePane.setText(valorPrecio);
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("swing");
        frame.setContentPane(new MainFrom().PanelText);
        frame.setVisible(true);
    }
}
