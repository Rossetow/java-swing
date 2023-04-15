import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ExemploJTable extends JFrame {
    
    public ExemploJTable() {
        super("Exemplo de JTable");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Cria os dados da tabela
        Object[][] dados = {
            {"Maria", "Feminino", 25},
            {"João", "Masculino", 30},
            {"Ana", "Feminino", 20},
            {"Pedro", "Masculino", 35},
        };
        
        // Cria os nomes das colunas
        String[] colunas = {"Nome", "Gênero", "Idade"};
        
        // Cria a tabela com os dados e as colunas
        JTable tabela = new JTable(dados, colunas);
        // Define tabela como NÃO editável
        tabela.setDefaultEditor(Object.class, null); //Remover caso deseja editar
        
        // Cria um JScrollPane para a tabela
        JScrollPane scrollPane = new JScrollPane(tabela);
        
        // Adiciona o JScrollPane ao JFrame
        add(scrollPane);
        
        // Define o tamanho do JFrame e o torna visível
        setSize(400, 300);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new ExemploJTable();
    }
}