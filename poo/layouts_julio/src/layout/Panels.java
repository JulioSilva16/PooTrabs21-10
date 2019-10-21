package layout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Panels extends JFrame {

    public Panels(){
        setTitle("Panels");
        setBackground(Color.WHITE);
        setSize(400,350);
        setLayout();
        setResizable(true);
  
    }

    private void setLayout(){
        JPanel panel = new JPanel();

        JPanel rigthpanel = new JPanel();
        rigthpanel.setLayout(new BorderLayout(10,10));  
 
        JPanel Norte = createPanel(Color.BLUE,"Norte");
        JPanel Sul = createPanel(Color.RED,"Sul");
        JPanel Centro = createPanel(Color.WHITE,"Centro");
        JPanel Leste = createPanel(Color.GRAY,"Leste");
        JPanel Oeste = createPanel(Color.ORANGE,"Oeste"); 
        
        rigthpanel.add(Norte, BorderLayout.NORTH);
        rigthpanel.add(Sul, BorderLayout.SOUTH);
        rigthpanel.add(Centro, BorderLayout.CENTER);
        rigthpanel.add(Leste, BorderLayout.EAST);
        rigthpanel.add(Oeste, BorderLayout.WEST);
        rigthpanel.setVisible(true);
   
        JPanel leftpanel = new JPanel();
        leftpanel.setLayout( new BoxLayout(leftpanel, BoxLayout.LINE_AXIS));
 
        JCheckBox checkNorte = createCheckBox("Norte", Norte);
        JCheckBox checkSul = createCheckBox("Sul", Sul);
        JCheckBox checkCentro = createCheckBox("Centro", Centro);
        JCheckBox checkLeste = createCheckBox("Leste", Leste);
        JCheckBox checkOeste = createCheckBox("Oeste", Oeste);

        leftpanel.add(checkNorte);
        leftpanel.add(checkSul);
        leftpanel.add(checkCentro);
        leftpanel.add(checkLeste);
        leftpanel.add(checkOeste);
        
        panel.add(leftpanel);
        panel.add(rigthpanel);  
        add(panel);
    }

    private JPanel createPanel(Color cor, String texto){
        JPanel panel = new JPanel();
        panel.setBackground(cor);
        panel.add(new JLabel(texto));
        return panel;
    }

    private JCheckBox createCheckBox(String texto, JPanel jPanel){
        JCheckBox checkBox = new JCheckBox(texto);
        checkBox.setSelected(true);
     
        checkBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setVisible(checkBox.isSelected());
            }
        });
        return checkBox;
    }
}
