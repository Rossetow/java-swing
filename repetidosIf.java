import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class repetidosIf extends JFrame implements ActionListener {

    private JButton botaoInfo;
    private JButton botaoAlerta;
    private JButton botaoErro;
    
    public repetidosIf() {
        super("Exemplo de Botões com Diálogos");
        
        // Configura o layout do frame para FlowLayout
        setLayout(new FlowLayout());
        
        // Cria os botões
        botaoInfo = new JButton("Informação");
        botaoAlerta = new JButton("Alerta");
        botaoErro = new JButton("Erro");
        
        // Adiciona os botões ao frame
        add(botaoInfo);
        add(botaoAlerta);
        add(botaoErro);
        
        // Registra o frame como ouvinte dos eventos de clique nos botões
        botaoInfo.addActionListener(this);
        botaoAlerta.addActionListener(this);
        botaoErro.addActionListener(this);
        
        // Configura as propriedades do frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // Verifica qual botão foi clicado
        if (e.getSource() == botaoInfo) {
            // Exibe um diálogo de informação
            JOptionPane.showMessageDialog(this, "Mensagem de Informação", "Informação", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == botaoAlerta) {
            // Exibe um diálogo de alerta
            JOptionPane.showMessageDialog(this, "Mensagem de Alerta", "Alerta", JOptionPane.WARNING_MESSAGE);
        } else if (e.getSource() == botaoErro) {
            // Exibe um diálogo de erro
            JOptionPane.showMessageDialog(this, "Mensagem de Erro", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String[] args) {
        new MeuFrame();
    }

}