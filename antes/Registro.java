import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Registro extends JFrame implements ActionListener
  {
    private JLabel FondoR;
    private JLabel lblRegistrarse, lblNombres, lblApellidos, lblCarrera, lblCorreo, lblUniversidad, lblContrasena;
    private JTextField txtNombre, txtApellido, txtCorreo;
    private JComboBox cmbUniversidad, cmbCarrera;
    private JPasswordField txtContrasena;
    private JButton btnRegistrarse, btnRegresar;
    public String sNombres, sApellidos, sCarrera, sContrasena, sCorreo, sUniversidad;

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
       lblNombres.setBounds(240,60,180,150);
       add(lblNombres);

       lblApellidos = new JLabel("Apellidos:");
       lblApellidos.setFont(new Font("Arial",1,24));
       lblApellidos.setForeground(Color.white);
       lblApellidos.setBounds(240,120,180,150);
       add(lblApellidos);

       lblCorreo = new JLabel("Correo:");
       lblCorreo.setFont(new Font("Arial",1,24));
       lblCorreo.setForeground(Color.white);
       lblCorreo.setBounds(240,180,180,150);
       add(lblCorreo);
       
       lblUniversidad = new JLabel("Universidad:");
       lblUniversidad.setFont(new Font("Arial",1,24));
       lblUniversidad.setForeground(Color.white);
       lblUniversidad.setBounds(240,240,180,150);
       add(lblUniversidad); 

       lblCarrera = new JLabel("Carrera:");
       lblCarrera.setFont(new Font("Arial",1,24));
       lblCarrera.setForeground(Color.white);
       lblCarrera.setBounds(240,300,180,150);
       add(lblCarrera);

       cmbCarrera = new JComboBox();
       cmbCarrera.setBounds(420,362,260,28);
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

       lblContrasena = new JLabel("Contrase\u00f1a:");
       lblContrasena.setFont(new Font("Arial",1,24));
       lblContrasena.setForeground(Color.white);
       lblContrasena.setBounds(240,360,180,150);
       add(lblContrasena);

       txtNombre = new JTextField();
       txtNombre.setBounds(420,122,260,28);
       add(txtNombre);

       txtApellido = new JTextField();
       txtApellido.setBounds(420,182,260,28);
       add(txtApellido);

       txtCorreo = new JTextField();
       txtCorreo.setBounds(420,242,260,28);
       add(txtCorreo);

       cmbUniversidad = new JComboBox();
       cmbUniversidad.setBounds(420,302,260,28);
       add(cmbUniversidad);
       cmbUniversidad.addItem("Seleccione una universidad");
       cmbUniversidad.addItem("Instituci\u00f3n Universitaria Pascual Bravo");
       cmbUniversidad.addItem("Instituci\u00f3n Tecnol\u00f3gica Metropolitana");
       cmbUniversidad.addItem("Colegio Mayor de Antioquia");
       
       txtContrasena = new JPasswordField();
       txtContrasena.setBounds(420,422,260,28);
       txtContrasena.setEchoChar('*');
       add(txtContrasena);

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

 public void actionPerformed(ActionEvent e)
 {
    if(e.getSource() == btnRegistrarse)
    {
        sNombres = txtNombre.getText();
        sApellidos = txtApellido.getText();
        sCorreo = txtCorreo.getText();
        sUniversidad = cmbUniversidad.getSelectedItem().toString();
        sCarrera = cmbCarrera.getSelectedItem().toString();
        sContrasena = txtContrasena.getText();

      if(sNombres.equals("") || sApellidos.equals("") || sCorreo.equals("") || sUniversidad.equals("Seleccione una universidad") ||sCarrera.equals("Selecciona una carrera") || sContrasena.equals(""))
        {
          JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos");
          txtNombre.setText("");
          txtApellido.setText("");
          txtCorreo.setText("");
          txtContrasena.setText("");
        }
    else
    {
     //JOptionPane.showMessageDialog(null, "Registrado Correctamente");
     Login login = new Login();
     login.setVisible(true);
     login.setSize(920,580);
     login.setLocationRelativeTo(null);
     this.setVisible(false);
     Politicas politicas = new Politicas();
     politicas.setVisible(true);
     politicas.setSize(620,380);
     politicas.setLocationRelativeTo(null);
     boolean blAcepta1 = politicas.retornar();
     if(blAcepta1 == true)
     {
       JOptionPane.showMessageDialog(null, "Registrado Correctamente");
       Login login = new Login();
       login.setVisible(true);
       login.setSize(920,580);
       login.setLocationRelativeTo(null);
       this.setVisible(false);
     }else if (blAcepta1 == false){
       JOptionPane.showMessageDialog(null, "No aceptaste los terminos");
       txtNombre.setText("");
       txtApellido.setText("");
       txtCorreo.setText("");
       txtContrasena.setText("");
     }
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
