import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Buscador extends JFrame implements ActionListener{
    private JLabel lblFondo, lblTitulo,lblDescripcion;
    private JButton btnCerrar, btnSubir, btnBuscar;
    private JTextField txtBuscador;
    public static String sNombre;

    public Buscador(){
        setLayout(null);
        Registro registro = new Registro();
        sNombre = registro.sNombres;
        setTitle("Bienvenido "+sNombre);
        lblTitulo = new JLabel("UniversidAPP");
        lblTitulo.setFont(new Font("Tahoma",1,60));
        lblTitulo.setForeground(Color.black);
        lblTitulo.setBounds(250,100,450,150);
        add(lblTitulo);

        lblDescripcion = new JLabel("La app para los estudiantes");
        lblDescripcion.setFont(new Font("Tahoma",1,20));
        lblDescripcion.setForeground(Color.black);
        lblDescripcion.setBounds(300,190,300,50);
        add(lblDescripcion);

        txtBuscador = new JTextField();
        txtBuscador.setBounds(178,250,550,30);
        add(txtBuscador);

        btnBuscar = new JButton("Buscar");
        btnBuscar.setBackground(new Color(255,167,38));
        btnBuscar.setForeground(Color.white);
        btnBuscar.setBounds(389,290,120,30);
        add(btnBuscar);
        btnBuscar.addActionListener(this);

        btnSubir = new JButton("Subir Archivo");
        btnSubir.setBackground(new Color(255,167,38));
        btnSubir.setForeground(Color.white);
        btnSubir.setBounds(30,30,120,30);        
        add(btnSubir);
        btnSubir.addActionListener(this);

        btnCerrar = new JButton("Cerrar Sesi\u00f3n");
        btnCerrar.setBackground(new Color(255,167,38));
        btnCerrar.setForeground(Color.white);
        btnCerrar.setBounds(750,30,120,30);
        add(btnCerrar);
        btnCerrar.addActionListener(this);

        Icon fondo = new ImageIcon(getClass().getResource("fondo.jpg"));
        lblFondo = new JLabel(fondo);
        lblFondo.setBounds(0,0,920,580);
        add(lblFondo);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
     
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btnBuscar){
         Buscador2 ventana2 = new Buscador2();
         ventana2.setVisible(true);
         ventana2.setSize(920,580);
         ventana2.setResizable(false);
         ventana2.setLocationRelativeTo(null);
         this.setVisible(false);
        }
        if(e.getSource()==btnSubir){
         Subir subir = new Subir();
         subir.setSize(920,580);
         subir.setVisible(true);
         subir.setResizable(false);
         subir.setLocationRelativeTo(null);
         this.setVisible(false);
        }
        if(e.getSource() ==btnCerrar){
         Login login = new Login();
         login.setVisible(true);
         login.setSize(920,580);
         login.setResizable(false);
         login.setLocationRelativeTo(null);        
         this.setVisible(false);
        }
    }
    public static void main(String args[]){
        Buscador ventana = new Buscador();
        ventana.setVisible(true);
        ventana.setSize(920,580);
        ventana.setResizable(true);
        ventana.setLocationRelativeTo(null);
    }

}