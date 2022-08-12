package codigo.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfaceMain extends JFrame implements ActionListener {

    JPanel panel;
    JLabel label, labelImg;
    JButton btn1, btn2, btn3;

    public InterfaceMain(){
        setTitle("Main");
        setSize(420, 311);
        setResizable(false);

        this.setLocationRelativeTo(this);

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(255, 255, 255));
        add(panel);

        // Label
        label = new JLabel("Informes App");
        label.setFont(new Font("cooper black", 0, 20));
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        label.setForeground(new Color(80, 27, 234));
        panel.add(label);

        // Img 

        // Button
        btn1 = new JButton("Consulta 1");
        btn1.addActionListener(this);
        btn1.setForeground(new Color(255, 255, 255));
        btn1.setBackground(new Color(76, 38, 129));        
        btn1.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(btn1);

        btn2 = new JButton("Consulta 2");
        btn2.addActionListener(this);
        btn2.setForeground(new Color(255, 255, 255));
        btn2.setBackground(new Color(76, 38, 129));        
        btn2.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(btn2);

        btn3 = new JButton("Consulta 3");
        btn3.addActionListener(this);
        btn3.setForeground(new Color(255, 255, 255));
        btn3.setBackground(new Color(76, 38, 129));        
        btn3.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(btn3);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn1) {
            Interface1 interface1 = new Interface1();
            interface1.setVisible(true);
            this.setVisible(false);
        } else if (e.getSource() == btn2) {
            Interface2 interface2 = new Interface2();
            interface2.setVisible(true);
            this.setVisible(false);
        } else if (e.getSource() == btn3) {
            Interface3 interface3 = new Interface3();
            interface3.setVisible(true);
            this.setVisible(false);
        }

    }
}
