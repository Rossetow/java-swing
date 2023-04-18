import javax.swing.JComboBox;
import javax.swing.*;


public class test extends JFrame{
    public test(){

        setTitle("Borrow book");
        setSize(1000,1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

    
        String[] opcoes = { "Opção 1", "Opção 2", "Opção 3" }; // cria array de opções
        JComboBox<String> comboBox = new JComboBox<>(opcoes); // instancia combo box com as opções definidas
        comboBox.setSelectedIndex(1);  // define a opção selecionada para "Opção 2"
        panel.add(comboBox);

        add(panel);
    }

    public static void main(String[] args) {
        test te = new test();
        te.setVisible(true);
    }
}
