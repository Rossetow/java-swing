import java.awt.*;
import javax.swing.*;

public class searchPanel extends JDialog{
    
    public searchPanel(JFrame frame){
        super(frame);
        setTitle("Borrow book");
        setSize(1000,1000);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(false);

        JPanel panel = new JPanel(new GridLayout(3,2,300,100));

        panel.add(new JLabel("Insert one of the information:"));
        panel.add(new JButton("Search"));
        panel.add(new JTextField("Title",50));
        panel.add(new JTextField("Author",50));
        panel.add(new JTextField("Book id",50));
        
        add(panel);
        pack();
    }

    public static void main(String[] args) {
        }
}
