import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Registro extends JFrame implements ActionListener
  {
    private JLabel FondoR;
    private JLabel lblCedula, lblRegistrarse, lblNombres, lblApellidos, lblCorreo, lblUniversidad, lblCarrera, lblContrasena;
    private JTextField txtNombre, txtApellido, txtCorreo, txtCedula;
    private JComboBox cmbUniversidad, cmbCarrera;
    private JPasswordField txtContrasena;
    private JButton btnRegistrarse, btnRegresar, btnTerms;
    public static String sCedula, sNombres, sApellidos, sCarrera, sContrasena, sCorreo, sUniversidad;

   public Registro()
     {
       setLayout(null);
       setTitle("Registro nuevo usuario");
       lblRegistrarse = new JLabel("Registrarse:");
       lblRegistrarse.setFont(new Font("Arial",1,26));
       lblRegistrarse.setForeground(Color.white);
       lblRegistrarse.setBounds(392,0,180,150);
       add(lblRegistrarse);

       lblNombres = new JLabel("Nombres:");
       lblNombres.setFont(new Font("Arial",1,24));
       lblNombres.setForeground(Color.white);
       lblNombres.setBounds(240,50,180,150);
       add(lblNombres);

       lblApellidos = new JLabel("Apellidos:");
       lblApellidos.setFont(new Font("Arial",1,24));
       lblApellidos.setForeground(Color.white);
       lblApellidos.setBounds(240,100,180,150);
       add(lblApellidos);

       lblCorreo = new JLabel("Correo:");
       lblCorreo.setFont(new Font("Arial",1,24));
       lblCorreo.setForeground(Color.white);
       lblCorreo.setBounds(240,150,180,150);
       add(lblCorreo);
       
       lblUniversidad = new JLabel("Universidad:");
       lblUniversidad.setFont(new Font("Arial",1,24));
       lblUniversidad.setForeground(Color.white);
       lblUniversidad.setBounds(240,200,180,150);
       add(lblUniversidad);

       lblCarrera = new JLabel("Carrera:");
       lblCarrera.setFont(new Font("Arial",1,24));
       lblCarrera.setForeground(Color.white);
       lblCarrera.setBounds(240,250,180,150);
       add(lblCarrera);

       lblContrasena = new JLabel("Contrase\u00f1a:");
       lblContrasena.setFont(new Font("Arial",1,24));
       lblContrasena.setForeground(Color.white);
       lblContrasena.setBounds(240,300,180,150);
       add(lblContrasena);

       lblCedula = new JLabel("C\u00e9dula");
       lblCedula.setFont(new Font("Arial",1,24));
       lblCedula.setForeground(Color.white);
       lblCedula.setBounds(240,350,180,150);
       add(lblCedula);

       txtNombre = new JTextField();
       txtNombre.setBounds(420,112,260,28);
       add(txtNombre);

       txtApellido = new JTextField();
       txtApellido.setBounds(420,162,260,28);
       add(txtApellido);

       txtCorreo = new JTextField();
       txtCorreo.setBounds(420,212,260,28);
       add(txtCorreo);

       cmbUniversidad = new JComboBox();
       cmbUniversidad.setBounds(420,262,260,28);
       add(cmbUniversidad);
       cmbUniversidad.addItem("Seleccione una universidad");
       cmbUniversidad.addItem("Instituci\u00f3n Universitaria Pascual Bravo");
       cmbUniversidad.addItem("Instituci\u00f3n Tecnol\u00f3gica Metropolitana");
       cmbUniversidad.addItem("Colegio Mayor de Antioquia");

       cmbCarrera = new JComboBox();
       cmbCarrera.setBounds(420,312,260,28);
       add(cmbCarrera);
       cmbCarrera.addItem("Seleccione una carrera");
       cmbCarrera.addItem("Ingenier\u00eda de Software");
       cmbCarrera.addItem("Ingenier\u00eda El\u00e9ctrica");
       cmbCarrera.addItem("Ingenier\u00eda Mec\u00e1nica");
       cmbCarrera.addItem("Ingenier\u00eda Administrativa");
       cmbCarrera.addItem("Ingenier\u00eda Industrial");
       cmbCarrera.addItem("Tecnolog\u00eda en Desarrollo de Software");
       cmbCarrera.addItem("Tecnolog\u00eda en Animaci\u00f3n Digital");
       cmbCarrera.addItem("Tecnolog\u00eda en Gesti\u00f3n del Dise\u00f1o Gr\u00e1fico");
       cmbCarrera.addItem("Tecnolog\u00eda en Gesti\u00f3n del Dise\u00f1o Textil y de Moda");
       cmbCarrera.addItem("Tecnolog\u00eda en Producci\u00f3n Industrial");
       cmbCarrera.addItem("Tecnolog\u00eda El\u00e9ctrica");
       cmbCarrera.addItem("Tecnolog\u00eda Electr\u00f3nica");
       cmbCarrera.addItem("Tecnolog\u00eda en Gesti\u00f3n del Mantenimiento Aeron\u00e1utico");
       cmbCarrera.addItem("Tecnolog\u00eda en Mec\u00e1nica Automotriz");
       cmbCarrera.addItem("Tecnolog\u00eda en Mec\u00e1nica Industrial");
       cmbCarrera.addItem("Tecnolog\u00eda en Operaci\u00f3n Integral de Transporte");
       cmbCarrera.addItem("Tecnolog\u00eda en Sistemas Electromec\u00e1nicos");
       cmbCarrera.addItem("Tecnolog\u00eda en Sistemas Mecatr\u00f3nicos");
       cmbCarrera.addItem("Profesional en Dise\u00f1o de Vestuario");
       cmbCarrera.addItem("Profesional en Gesti\u00f3n de Vestuario");
       cmbCarrera.addItem("Profesional en Dise\u00f1o Gr\u00e1fico");
       
       txtContrasena = new JPasswordField();
       txtContrasena.setBounds(420,362,260,28);
       txtContrasena.setEchoChar('*');
       add(txtContrasena);

       txtCedula = new JTextField();
       txtCedula.setBounds(420,412,260,28);
       add(txtCedula);

       btnRegistrarse = new JButton("Registrarse");
       btnRegistrarse.setBackground(new Color(255,167,38));
       btnRegistrarse.setForeground(Color.white);
       btnRegistrarse.setBounds(290,482,150,28);       
       add(btnRegistrarse);
       btnRegistrarse.addActionListener(this);

       btnRegresar = new JButton("Regresar");
       btnRegresar.setBackground(new Color(255,167,38));
       btnRegresar.setForeground(Color.white);
       btnRegresar.setBounds(490,482,150,28);
       add(btnRegresar);
       btnRegresar.addActionListener(this);

       Icon fondo = new ImageIcon(getClass().getResource("Registro.jpg"));
       FondoR = new JLabel(fondo);
       FondoR.setBounds(0,-10,920,580);
       add(FondoR);

       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
     }

 public void actionPerformed(ActionEvent e){
  if(e.getSource() == btnRegistrarse){
    sCedula = txtCedula.getText();
   try{
     int iCedula = Integer.parseInt(sCedula);
   }catch(Exception a){
     JOptionPane.showMessageDialog(null, "La cedula solo debe tener numeros");   
     txtNombre.setText("");
     txtApellido.setText("");
     txtCorreo.setText("");
     txtContrasena.setText("");
     txtCedula.setText("");  
   }
   sNombres = txtNombre.getText();
   sApellidos = txtApellido.getText();
   sCorreo = txtCorreo.getText();
   sUniversidad = cmbUniversidad.getSelectedItem().toString();
   sCarrera = cmbCarrera.getSelectedItem().toString();
   sContrasena = txtContrasena.getText();

   if(sCedula.equals("") || sNombres.equals("") || sApellidos.equals("") || sCorreo.equals("") || sUniversidad.equals("Seleccione una universidad") ||sCarrera.equals("Seleccione una carrera") || sContrasena.equals(""))
   {
     JOptionPane.showMessageDialog(null, "Llena correctamente todos los campos");
     txtNombre.setText("");
     txtApellido.setText("");
     txtCorreo.setText("");
     txtContrasena.setText("");
     txtCedula.setText("");
   }
   else
   {
     JOptionPane.showMessageDialog(null, "Registrado Correctamente");
     Login login = new Login();
     login.setVisible(true);
     login.setSize(920,580);
     login.setLocationRelativeTo(null);
     this.setVisible(false);        
  }
  }
  if(e.getSource() == btnRegresar)
  {
    Login login = new Login();
     login.setVisible(true);
     login.setSize(920,580);
     login.setLocationRelativeTo(null);
     this.setVisible(false);
  }
 }

  public static void main(String[] args)
    {
      Registro registro = new Registro();
      registro.setSize(920,580);
      registro.setVisible(true);
      registro.setResizable(false);
      registro.setLocationRelativeTo(null);
    }
}
