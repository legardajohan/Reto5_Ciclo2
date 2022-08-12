package codigo.View;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import codigo.Model.VO.*;

import java.awt.*;
import java.util.ArrayList;

public class Interface3 extends JFrame{
    JPanel panelOne;
    JTable table;
    DefaultTableModel model;
    JScrollPane scroll;

    public Interface3() {
        setTitle("Query 3");
        setSize(500, 500);
        setResizable(false);
        String[] colums = {"ID", "Builder", "Bank"};
        ArrayList<String[]> values = Query3VO.values();
        String[][] data = new String[values.size()][3];
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
        add(panelOne);

        setVisible(true);
    }
}
