import javax.swing.*;

public class MinhaJanela extends JFrame {

    public MinhaJanela() {
        JLabel label = new JLabel("Olá, mundo!");     
        JButton button = new JButton("Clique aqui");  

        JPanel panel = new JPanel();
        panel.add(label);   // Insere o label no panel
        panel.add(button);  // Insere o button no panel

        add(panel);         // Insere o panel no frame

        setSize(300, 100);   // Define o tamanho do frame para 300x100
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Define a operação para fechar o frame
    }

    public static void main(String[] args) {
        MinhaJanela ex = new MinhaJanela();  // Inicializa o frame
        ex.setVisible(true);  // Apresenta o frame
    }
}