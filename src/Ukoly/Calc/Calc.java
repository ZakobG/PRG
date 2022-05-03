package Ukoly.Calc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;

public class Calc implements ActionListener {
    JFrame frame;
    JLabel window;
    JButton n0;
    JButton n1;
    JButton n2;
    JButton n3;
    JButton n4;
    JButton n5;
    JButton n6;
    JButton n7;
    JButton n8;
    JButton n9;
    JButton addition;
    JButton subtraction;
    JButton multiply;
    JButton divide;
    JButton equals;
    JButton clear;
    JButton decimal;

    void init() {
        frame = new JFrame("Calculator");
        frame.setSize(600, 700);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setResizable(false);
    }

    void print() {
        window = new JLabel("0");
        window.setBounds(50, 50, 300, 30);

        clear = new JButton("C");
        clear.setBounds(50, 100, 50, 50);
        clear.addActionListener(this);

        divide = new JButton("/");
        divide.setBounds(100, 100, 50, 50);
        divide.addActionListener(this);

        multiply = new JButton("*");
        multiply.setBounds(150, 100, 50, 50);
        multiply.addActionListener(this);

        subtraction = new JButton("-");
        subtraction.setBounds(200, 100, 50, 50);
        subtraction.addActionListener(this);

        addition = new JButton("+");
        addition.setBounds(200, 150, 50, 100);
        addition.addActionListener(this);

        equals = new JButton("=");
        equals.setBounds(200, 250, 50, 100);
        equals.addActionListener(this);

        decimal = new JButton(",");
        decimal.setBounds(150, 300, 50, 50);
        decimal.addActionListener(this);

        n0 = new JButton("0");
        n0.setBounds(50, 300, 100, 50);
        n0.addActionListener(this);

        n1 = new JButton("1");
        n1.setBounds(50, 250, 50, 50);
        n1.addActionListener(this);

        n2 = new JButton("2");
        n2.setBounds(100, 250, 50, 50);
        n2.addActionListener(this);

        n3 = new JButton("3");
        n3.setBounds(150, 250, 50, 50);
        n3.addActionListener(this);

        n4 = new JButton("4");
        n4.setBounds(50, 200, 50, 50);
        n4.addActionListener(this);

        n5 = new JButton("5");
        n5.setBounds(100, 200, 50, 50);
        n5.addActionListener(this);

        n6 = new JButton("6");
        n6.setBounds(150, 200, 50, 50);
        n6.addActionListener(this);

        n7 = new JButton("7");
        n7.setBounds(50, 150, 50, 50);
        n7.addActionListener(this);

        n8 = new JButton("8");
        n8.setBounds(100, 150, 50, 50);
        n8.addActionListener(this);

        n9 = new JButton("9");
        n9.setBounds(150, 150, 50, 50);
        n9.addActionListener(this);


        frame.add(window);
        frame.add(clear);
        frame.add(addition);
        frame.add(subtraction);
        frame.add(multiply);
        frame.add(divide);
        frame.add(decimal);
        frame.add(equals);
        frame.add(n0);
        frame.add(n1);
        frame.add(n2);
        frame.add(n3);
        frame.add(n4);
        frame.add(n5);
        frame.add(n6);
        frame.add(n7);
        frame.add(n8);
        frame.add(n9);
    }

    String s = "0";
    int num2 = 0;
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == n0) {
            s = s.concat("0");
            window.setText(s);
        }
        else if (e.getSource() == n1) {
            s = s.concat("1");
            window.setText(s);
        }
        else if (e.getSource() == n2) {
            s = s.concat("2");
            window.setText(s);
        }
        else if (e.getSource() == n3) {
            s = s.concat("3");
            window.setText(s);
        }
        else if (e.getSource() == n4) {
            s = s.concat("4");
            window.setText(s);
        }
        else if (e.getSource() == n5) {
            s = s.concat("5");
            window.setText(s);
        }
        else if (e.getSource() == n6) {
            s = s.concat("6");
            window.setText(s);
        }
        else if (e.getSource() == n7) {
            s = s.concat("7");
            window.setText(s);
        }
        else if (e.getSource() == n8) {
            s = s.concat("8");
            window.setText(s);
        }
        else if (e.getSource() == n9) {
            s = s.concat("9");
            window.setText(s);
        }
        else if (e.getSource() == clear) {
            s = "0";
            window.setText(s);
        }
        else if (e.getSource() == decimal) {
            if (!s.contains(",")) {
                s = s.concat(",");
            }
            window.setText(s);
        }
        else if (e.getSource() == addition) {
            int num = Integer.parseInt(s);
            num2 = num2 + num;
            window.setText(String.valueOf(num2));
        }
        System.out.println(num2);
        System.out.println(s);
    }
}
