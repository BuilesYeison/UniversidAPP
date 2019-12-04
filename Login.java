import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Login extends JFrame implements ActionListener{
 private JLabel lblUsuario, lblContrasena, lblIniciar, lblFondo;
 private JButton btnLogin, btnRegistro;
 private JTextField txtUsuario;
 private JPasswordField jpContrasena;//text box para contraseñas, se le puede asignar un caracter en el que se puede codificar el texto que se ingrese
 public String sCorreo, sContrasena, sRcorreo, sRcontra;

 public Login(){
  setLayout(null);
  setTitle("Iniciar Sesion");
  Registro registro = new Registro();
  sRcorreo = registro.sCorreo;
  sRcontra = registro.sContrasena;  
  lblIniciar = new JLabel("Iniciar Sesion:");
  lblIniciar.setFont(new Font("Arial",1,20));
  lblIniciar.setForeground(Color.white);
  lblIniciar.setBounds(330,200,170,30);//270
  add(lblIniciar);

  lblUsuario = new JLabel("Correo: ");
  lblUsuario.setFont(new Font("Arial",1,20));
  lblUsuario.setForeground(Color.white);
  lblUsuario.setBounds(300,250,140,30);
  add(lblUsuario);

  lblContrasena = new JLabel("Contrasenia: ");
  lblContrasena.setFont(new Font("Arial",1,20));
  lblContrasena.setForeground(Color.white);
  lblContrasena.setBounds(300,300,140,30);
  add(lblContrasena);

  Icon Fondo = new ImageIcon(getClass().getResource("login.jpg"));
  lblFondo = new JLabel(Fondo);
  lblFondo.setBounds(0,0,920,580);
  add(lblFondo);

  txtUsuario = new JTextField();
  txtUsuario.setBounds(460,250,160,28);
  lblFondo.add(txtUsuario);

  jpContrasena = new JPasswordField();
  jpContrasena.setBounds(460,300,160,30);
  jpContrasena.setEchoChar('*');//caracter por el que se reemplazara cada caracter del texto que se ingrese en el textbox de contraseña
  lblFondo.add(jpContrasena);

  btnLogin = new JButton("Iniciar Sesion");
  btnLogin.setForeground(Color.white);
  btnLogin.setBackground(new Color(255,167,38));
  btnLogin.setBounds(310,350,130,25);
  lblFondo.add(btnLogin);
  btnLogin.addActionListener(this);

  btnRegistro = new JButton("Registrarse");
  btnRegistro.setForeground(Color.white);
  btnRegistro.setBackground(new Color(255,167,38));
  btnRegistro.setBounds(470,350,130,25);
  lblFondo.add(btnRegistro);//ponerlo sobre el fondo
  btnRegistro.addActionListener(this);

  this.setDefaultCloseOperation(EXIT_ON_CLOSE);
 }

 public void actionPerformed(ActionEvent e){
  if(e.getSource() == btnLogin){
   sCorreo = txtUsuario.getText();
   sContrasena = jpContrasena.getText();  
   if(sCorreo.equals(sRcorreo) && sContrasena.equals(sRcontra)){
     JOptionPane.showMessageDialog(null, "Sesi\u00f3n iniciada correctamente");
     Buscador buscador = new Buscador();
     buscador.setVisible(true);
     this.setVisible(false);
     buscador.setSize(920,580);
     buscador.setResizable(false);
     buscador.setLocationRelativeTo(null);
   } else{
     JOptionPane.showMessageDialog(null, "No coinciden");
     txtUsuario.setText("");
     jpContrasena.setText("");
   }
   
  }
  if(e.getSource() == btnRegistro){
    Politicas ventana = new Politicas();
    ventana.setVisible(true);
    ventana.setSize(620,380);
    ventana.setResizable(false);
    ventana.setLocationRelativeTo(null);
    this.setVisible(false);
  }
 }

 public static void main(String args[]){
  Login ventana = new Login();
  ventana.setBounds(0,0,920,580);
  ventana.setVisible(true);
  ventana.setResizable(false);
  ventana.setLocationRelativeTo(null);
 }
}