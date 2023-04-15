import javax.swing.*;
import java.awt.*;

public class ExemploJPanel extends JFrame {
    public ExemploJPanel() {
        super("Exemplo de JPanel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel label = new JLabel("Este é um JLabel em um JPanel");

        panel.add(label, BorderLayout.CENTER);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ExemploJPanel();
    }
}