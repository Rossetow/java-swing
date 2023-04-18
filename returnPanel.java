import java.awt.GridLayout;

import javax.swing.*;

public class returnPanel extends JDialog{
    
    public returnPanel(JFrame frame){
        super(frame);
        setTitle("Return book");
        setSize(1000,1000);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(false);

        JPanel panel = new JPanel(new GridLayout(3,2,300,100));

        panel.add(new JLabel("Insert one of the information:")); 
        panel.add(new JButton("Return"));
        panel.add(new JTextField("Title",50));
        panel.add(new JTextField("Author",50));
        panel.add(new JTextField("Book id",5));

        add(panel);
        pack();
    }

    public static void main(String[] args) {
    }
}
