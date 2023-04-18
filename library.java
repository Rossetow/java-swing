import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class library extends JFrame {

    private searchPanel searchPanel = new searchPanel(this);
    private borrowPanel borrowPanel = new borrowPanel(this);
    private addPanel addPanel = new addPanel(this);
    private removePanel removePanel = new removePanel(this);
    private returnPanel returnPanel = new returnPanel(this);
    public library(){

        setTitle("Library");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,1000);

        JPanel panel = new JPanel();
        
        JButton buttonSearch = new JButton("Search Book");
        JButton buttonBorrow = new JButton("Borrow book");
        JButton addButton = new JButton("Add book");
        JButton removeButton = new JButton("Remove book");
        JButton returnButton = new JButton("Return book");

        panel.add(buttonSearch);
        buttonSearch.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed (ActionEvent e){
                searchPanel.setVisible(true);
            }
            
        });

        panel.add(buttonBorrow);
        buttonBorrow.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                borrowPanel.setVisible(true);
            }
            
        });
        
        panel.add(addButton);
        addButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                addPanel.setVisible(true);
            }
            
        });
        panel.add(removeButton);
        removeButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                removePanel.setVisible(true);            
            }
            
        });

        panel.add(returnButton);
        returnButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                returnPanel.setVisible(true);      
            }
            
        });
        add(panel);
    }

    public static void main(String[] args) {
        library ex = new library();
        ex.setVisible(true);
    }
}
