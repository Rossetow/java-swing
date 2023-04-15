import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame {
    public GridLayoutExample(){
        setTitle("Exemplo GridLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        // cria um painel com GridLayout 3x3 com cada elemento espaçado em 10x10
        JPanel panel = new JPanel(new GridLayout(/*rows*/3, /*cols*/3, /*hgap*/10, /*vgap*/10));
        
        // adiciona botões ao painel
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton("Botão " + i);
            panel.add(button);
        }

        // adiciona o painel ao frame e exibe o frame
        add(panel);
    }

    public static void main(String[] args) {
        GridLayoutExample ex = new GridLayoutExample();
        ex.setVisible(true);
    }
}