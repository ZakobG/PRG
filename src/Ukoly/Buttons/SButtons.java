package Ukoly.Buttons;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SButtons implements ActionListener {
    private int i = 0;
    private JLabel label;
    private JButton plus;
    private JButton minus;
    private JButton move;
    private JButton images;

    int rx = 230;
    int ry = 10;
    boolean ault = true;

    public JPanel getPanel() {
        JPanel panel = new JPanel();

        // Buttons for addition and subtraction
        plus = new JButton("+1");
        plus.addActionListener(this);
        panel.add(plus);
        minus = new JButton("-1");
        minus.addActionListener(this);
        panel.add(minus);
        label = new JLabel("" + i);
        panel.add(label);

        // Button for random location
        move = new JButton("Click me");
        move.addActionListener(this);
        panel.add(move);

        return panel;
    }

    public void actionPerformed(ActionEvent e) {
        // if for addition and subtraction
        if (e.getSource() == plus) {
            i++;
            label.setText("" + i);
        }
        if (e.getSource() == minus) {
            i--;
            label.setText("" + i);
        }

        // if for random location
        int max = 700;
        int min = 1;
        int range = max - min + 1;
        ault = !ault;
        if (ault) {
            rx = 365;
            ry = 5;
            move.setLocation(rx, ry);
        } else {
            rx = (int) (Math.random() * range) + min;
            ry = (int) (Math.random() * range) + min;
            move.setLocation(rx, ry);
        }
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Buttons");
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(3);
        SButtons counter = new SButtons();
        JPanel counterPanel = counter.getPanel();
        Container content = frame.getContentPane();
        content.add(counterPanel);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}