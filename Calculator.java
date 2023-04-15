import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.*;

public class Calculator extends JFrame{
    public Calculator() {
        setTitle("Calculadora");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(5,2, 10, 10));

        JLabel label1 = new JLabel("Número 1");
        JLabel label2 = new JLabel("Número 2");
        JLabel labelResultado = new JLabel("Resultado");

        JTextField text1 = new JTextField(10);
        JTextField text2 = new JTextField(10);
        JTextField text3 = new JTextField(10);

        JButton button1 = new JButton("+");
        JButton button2 = new JButton("-");
        JButton button3 = new JButton("/");
        JButton button4 = new JButton("*");

        panel.add(label1);
        panel.add(text1);
        panel.add(label2);
        panel.add(text2);
        panel.add(labelResultado);
        panel.add(text3);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        add(panel);
    }

    public void actionPerformed (ActionEvent e){
        
        double num1 = Double.parseDouble(text1.getText());
    }
    

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setVisible(true);
    }
}


