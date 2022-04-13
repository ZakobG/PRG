import javax.swing.*;
import java.awt.*;

public class Swing {
    public static void main(String[] args) {
        JFrame fr = new JFrame("Frame");
        JLabel lb = new JLabel("Labil lmao");
        JLabel lbi = new JLabel();
        ImageIcon img = new ImageIcon("C:\\Users\\Name\\IdeaProjects\\PRG\\imgs\\KK.jpg");

        lb.setText("Labil lmao");
        lbi.setIcon(img);

        lb.setBounds(50,50,100,30);

        fr.setSize(1000,750);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(3);
        fr.add(lb);
        fr.add(lbi);
    }
}
