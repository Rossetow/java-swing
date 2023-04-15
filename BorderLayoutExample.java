import java.awt.*;
import javax.swing.*;

public class BorderLayoutExample extends JFrame {
    public BorderLayoutExample() {
        setTitle("BorderLayout Example");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout());

        add(new JButton("NORTH/PAGE_START"), BorderLayout.NORTH);  //BorderLayout.PAGE_START
        add(new JButton("SOUTH/PAGE_END"), BorderLayout.SOUTH);    //BorderLayout.PAGE_END
        add(new JButton("EAST/LINE_END"), BorderLayout.EAST);      //BorderLayout.LINE_END
        add(new JButton("WEST/LINE_START"), BorderLayout.WEST);    //BorderLayout.LINE_START
        add(new JButton("CENTER"), BorderLayout.CENTER);    
    }

    public static void main(String[] args) {
        BorderLayoutExample ex = new BorderLayoutExample();
        ex.setVisible(true);
    }
}