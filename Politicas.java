import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javafx.scene.*;
import java.io.*;

public class Politicas extends JFrame implements ActionListener{
    public JTextArea txtArea;
    public JScrollPane spScroll;
    private JButton btnAcepta, btnNoacepta;
    private JLabel lblFondo;
    static boolean blAcepta;

    public Politicas(){
        setLayout(null);
        setTitle("Terminos y Condiciones");
        Icon Fondo = new ImageIcon(getClass().getResource("fondo.jpg"));
        lblFondo = new JLabel(Fondo);
        lblFondo.setBounds(0,-10,620,380);
        add(lblFondo);
        
        txtArea = new JTextArea();
        spScroll = new JScrollPane(txtArea);
        spScroll.setBounds(55,20,500,250);
        lblFondo.add(spScroll);      

        File Texto = new File("PoliticaPrivacidad.txt");
        try{
            BufferedReader Leer = new BufferedReader(new FileReader(Texto));
            String Line = Leer.readLine();
            while(Line != null){
                txtArea.append(Line+"\n");
                Line = Leer.readLine();
            }
        }catch (Exception ex){
            this.setTitle("No Funciono");
        }    

        btnAcepta = new JButton("Acepto");
        btnAcepta.setBounds(70,290,100,25);
        btnAcepta.setForeground(Color.white);
        btnAcepta.setBackground(new Color(255,167,38));
        lblFondo.add(btnAcepta);
        btnAcepta.addActionListener(this);

        btnNoacepta = new JButton("No acepto");
        btnNoacepta.setBounds(220,290,100,25);
        btnNoacepta.setForeground(Color.white);
        btnNoacepta.setBackground(new Color(255,167,38));
        lblFondo.add(btnNoacepta);
        btnNoacepta.addActionListener(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnAcepta){
            blAcepta = true;
            this.setVisible(false);  
            Registro registro = new Registro();
            registro.setSize(920,580);
            registro.setVisible(true);
            registro.setResizable(false);
            registro.setLocationRelativeTo(null);          
        }
        if(e.getSource() == btnNoacepta){
            blAcepta = false;
            JOptionPane.showMessageDialog(null, "Necesitas aceptar para poder registrarte");
            this.setVisible(false);
            Login login = new Login();
            login.setBounds(0,0,920,580);
            login.setVisible(true);
            login.setResizable(false);
            login.setLocationRelativeTo(null);
        }        
    }

    public boolean retornar(){
        return blAcepta;      
    }

    public static void main(String args[]){
        Politicas ventana = new Politicas();
        ventana.setVisible(true);
        ventana.setSize(620,380);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
    }
}