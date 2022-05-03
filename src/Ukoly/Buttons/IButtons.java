package Ukoly.Buttons;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Math;

public class IButtons implements ActionListener {
    private JButton ImgButt;
    private JLabel ImgLab;

    public JPanel getPanel() {
        JPanel panel = new JPanel();

        ImgButt = new JButton("Click me!");
        ImgButt.addActionListener(this);
        panel.add(ImgButt);

        ImgLab = new JLabel(new ImageIcon("C:\\Users\\Name\\IdeaProjects\\PRG\\imgs\\IBImgs\\06b3d6e0a295c5e80c09afca7a48a5f2.jpg"));
        panel.add(ImgLab);

        return panel;
    }

    public void actionPerformed(ActionEvent e) {
        int range = (int) (Math.random() * 4);

        if (e.getSource() == ImgButt && range == 0) {
            ImgLab.setIcon(new ImageIcon("C:\\Users\\Name\\IdeaProjects\\PRG\\imgs\\IBImgs\\gagg.jpg"));
        } else if (e.getSource() == ImgButt && range == 1) {
            ImgLab.setIcon(new ImageIcon("C:\\Users\\Name\\IdeaProjects\\PRG\\imgs\\IBImgs\\dz.jpg"));
        } else if (e.getSource() == ImgButt && range == 2) {
            ImgLab.setIcon(new ImageIcon("C:\\Users\\Name\\IdeaProjects\\PRG\\imgs\\IBImgs\\ce1d4643187f4d3f208e9c2ef84e4f6e.jpg"));
        } else if (e.getSource() == ImgButt && range == 3) {
            ImgLab.setIcon(new ImageIcon("C:\\Users\\Name\\IdeaProjects\\PRG\\imgs\\IBImgs\\c04f8b31f30a6d031db192654b77e208.jpg"));
        }
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Buttons");
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        IButtons counter = new IButtons();
        JPanel counterPanel = counter.getPanel();
        Container content = frame.getContentPane();
        content.add(counterPanel);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}