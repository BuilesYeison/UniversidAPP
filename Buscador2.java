import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Buscador2 extends JFrame implements ActionListener{
    private JLabel lblLogo, lblFondo, lblTitulo, lblResultado;
    private JButton btnBuscar, btnDescargar, btnSubir, btnCerrar;
    private JPanel pnResultados;
    private JTextField txtBuscador;
    private JTextArea txtDescripcion;
    public static String sNombre,sDescripcion;
    private JScrollPane scrollBar;

    public Buscador2(){
        setLayout(null);
        Registro registro = new Registro();
        sNombre = registro.sNombres;
        setTitle("Bienvenido "+sNombre);

        txtBuscador = new JTextField();
        txtBuscador.setBounds(150,70,250,30);
        add(txtBuscador);

        btnSubir = new JButton("Subir Archivo");
        btnSubir.setBackground(new Color(255,167,38));
        btnSubir.setForeground(Color.white);
        btnSubir.setBounds(620,20,120,30);        
        add(btnSubir);
        btnSubir.addActionListener(this);

        btnCerrar = new JButton("Cerrar Sesi\u00f3n");
        btnCerrar.setBackground(new Color(255,167,38));
        btnCerrar.setForeground(Color.white);
        btnCerrar.setBounds(750,20,120,30);
        add(btnCerrar);
        btnCerrar.addActionListener(this);

        btnBuscar = new JButton("Buscar");
        btnBuscar.setBackground(new Color(255,167,38));
        btnBuscar.setForeground(Color.white);
        btnBuscar.setBounds(420,70,120,30);
        add(btnBuscar);
        btnBuscar.addActionListener(this);

        pnResultados = new JPanel();
        pnResultados.setBounds(10,150,885,380);
        pnResultados.setLayout(null);
        add(pnResultados);

        /*scrollBar = new JScrollPane(pnResultados);      
        pnResultados.setPreferredSize(new Dimension(885,380));
        pnResultados.add(scrollBar);  */        
        
        lblTitulo = new JLabel("Resultados relacionados: ");        
        lblTitulo.setFont(new Font("Tahoma",1,20));
        lblTitulo.setBounds(50,20,300,50);
        pnResultados.add(lblTitulo);

        Resultado();

        Icon logo = new ImageIcon(getClass().getResource("logo.png"));
        lblLogo = new JLabel(logo);
        lblLogo.setBounds(30,30,105,105);
        add(lblLogo);

        Icon fondo = new ImageIcon(getClass().getResource("fondo.jpg"));
        lblFondo = new JLabel(fondo);
        lblFondo.setBounds(0,0,920,580);
        add(lblFondo);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void Resultado(){
        lblResultado = new JLabel("Examen POO, I.U Pascual Bravo, Herramientas 3, Oscar Ochoa, Examen");
        lblResultado.setFont(new Font("Tahoma",1,15));
        lblResultado.setBounds(30,50,600,50);
        pnResultados.add(lblResultado);

        sDescripcion = "Examen realizado a mitad del semestre con el profesor oscar\n"
                      +"Sobre programacion orientada a objetos en java, aqui esta el\n"
                      +"examen que el realizara para que estudien c:";

        txtDescripcion = new JTextArea();
        txtDescripcion.setBounds(30,90,500,80);
        txtDescripcion.setBackground(new Color(68,114,196));
        txtDescripcion.setFont(new Font("Tahoma",1,12));
        pnResultados.add(txtDescripcion);

        txtDescripcion.setText(sDescripcion);

        btnDescargar = new JButton("Descargar");
        btnDescargar.setForeground(Color.white);
        btnDescargar.setBackground(new Color(255,167,38));
        btnDescargar.setBounds(40,180,100,30);//180 en y
        pnResultados.add(btnDescargar);
        btnDescargar.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnBuscar){

        }
        if(e.getSource()==btnDescargar){
            JOptionPane.showMessageDialog(null, "Descargado correctamente");
        }
        if(e.getSource()==btnCerrar){
            Login login = new Login();
            login.setVisible(true);
            login.setSize(920,580);
            login.setResizable(false);
            login.setLocationRelativeTo(null);        
            this.setVisible(false);
        }

    }
    
    public static void main(String args[]){
        Buscador2 ventana = new Buscador2();
        ventana.setVisible(true);
        ventana.setSize(920,580);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
    }

}