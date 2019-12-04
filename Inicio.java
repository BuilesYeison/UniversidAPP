import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Inicio extends JFrame implements ActionListener{
 private JLabel lblDescr1,lblDescr4, lblDescr3, lblDescr2, lblTitulo, lblFondo;
 private JButton btnContinuar;

 public Inicio(){
  setLayout(null);
  setTitle("UniversidAPP");
  lblDescr1 = new JLabel("La APP donde puedes subir y bajar, examenes");
  lblDescr1.setForeground(Color.white);
  lblDescr1.setFont(new Font("Arial",1,17));
  lblDescr1.setBounds(505,270,450,30);
  add(lblDescr1);

  lblDescr2 = new JLabel("y trabajos ya calificados; para que te guies en");
  lblDescr2.setForeground(Color.white);
  lblDescr2.setFont(new Font("Arial",1,17));
  lblDescr2.setBounds(505,295,450,30);
  add(lblDescr2);

  lblDescr3 = new JLabel("tu proceso de aprendizaje y para que ayudes");
  lblDescr3.setForeground(Color.white);
  lblDescr3.setFont(new Font("Arial",1,17));
  lblDescr3.setBounds(505,320,450,30);
  add(lblDescr3);

  lblDescr4 = new JLabel("a otros estudiante con tu misma necesidad.");
  lblDescr4.setForeground(Color.white);
  lblDescr4.setFont(new Font("Arial",1,17));
  lblDescr4.setBounds(505,345,450,30);
  add(lblDescr4);

  lblTitulo = new JLabel("Bienvenido a UniversidAPP!");
  lblTitulo.setBounds(215,60,550,30);
  lblTitulo.setForeground(Color.white);
  lblTitulo.setFont(new Font("Arial",1,40));
  add(lblTitulo);

  Icon Fondo = new ImageIcon(getClass().getResource("inicio.jpg"));
  lblFondo = new JLabel(Fondo);
  lblFondo.setBounds(0,-28,920,580);
  add(lblFondo);

  btnContinuar = new JButton("Presiona para continuar");
  btnContinuar.setBounds(590,400,180,25);
  btnContinuar.setForeground(Color.white);
  btnContinuar.setBackground(new Color(255,167,38));
  add(btnContinuar);
  btnContinuar.addActionListener(this);

  this.setDefaultCloseOperation(EXIT_ON_CLOSE);
 }
 public void actionPerformed(ActionEvent e){
  if(e.getSource()==btnContinuar){
   Login login = new Login();
   login.setVisible(true);
   this.setVisible(false);
   login.setResizable(false);
   login.setSize(920,580);
   login.setLocationRelativeTo(null);
  }
 }
 public static void main(String args[]){
  Inicio ventana = new Inicio();
  ventana.setBounds(0,0,920,580);
  ventana.setVisible(true);
  ventana.setResizable(false);
  ventana.setLocationRelativeTo(null);
 }
}