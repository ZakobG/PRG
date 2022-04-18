package Ukoly;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SButtons implements ActionListener {
    private int i = 0;

    private JLabel label;
    private JButton plus;
    private JButton minus;
    private JButton move;

    Point Random = new Point();

    public JPanel getPanel() {
        JPanel panel = new JPanel();

        plus = new JButton("+1");
        plus.addActionListener(this);
        panel.add(plus);

        minus = new JButton("-1");
        minus.addActionListener(this);
        panel.add(minus);

        label = new JLabel("" + i);
        panel.add(label);

        move = new JButton("Click me");
        move.addActionListener(this);
        panel.add(move);

        return panel;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == plus) {
            i++;
            label.setText("" + i);
        }
        if (e.getSource() == minus) {
            i--;
            label.setText("" + i);
        }
        move.setLocation(Random);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Buttons");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(3);

        SButtons counter = new SButtons();
        JPanel counterPanel = counter.getPanel();

        Container content = frame.getContentPane();
        content.add(counterPanel);

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}