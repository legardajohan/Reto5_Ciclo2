package codigo.View;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import codigo.Model.VO.*;

import java.awt.*;
import java.util.ArrayList;

public class Interface1 extends JFrame{
    JPanel panelOne;
    JTable table;
    DefaultTableModel model;
    JScrollPane scroll;
    JButton btn1;

    public Interface1() {
        
        setTitle("Query 1");
        setSize(500, 500);
        setResizable(false);
        String[] colums = {"ID", "Name", "Last Name", "City"};
        ArrayList<String[]> values = Query1VO.values();
        String[][] data = new String[values.size()][4];
        for (int i = 0; i < values.size(); i++) {
            int j = 0;
            for (String str : values.get(i)) {
                data[i][j] = str;
                j++;
            }
        }

        // String[][] data = {{"", "", "", ""}, {"", "", "", ""}};
        model = new DefaultTableModel(data, colums);
        table = new JTable(model);
        scroll = new JScrollPane(table);
        scroll.setBounds(20, 20, 440, 420);
        add(scroll);

        panelOne = new JPanel();
        panelOne.setBackground(new Color(75, 86, 239));
        panelOne.add(new JLabel("Primer Informe"));
                
        add(panelOne);
        setVisible(true);
    }
    
}
