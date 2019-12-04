import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel extends JPanel {//implements ActionListener{
    private JLabel lblTitulo;

    public Panel(){
        setLayout(null);
    }
    private void Inicializar(){
        setPreferredSize(new Dimension(400,400));
        lblTitulo = new JLabel("Resultados relacionados: ");        
        lblTitulo.setFont(new Font("Tahoma",1,20)); 
        lblTitulo.setAlignmentX(Component.LEFT_ALIGNMENT);  
        lblTitulo.setBounds(30,170,200,30);     
        add(lblTitulo);
    }
}