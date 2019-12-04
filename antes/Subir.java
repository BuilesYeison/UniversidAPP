import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Subir extends JFrame implements ActionListener
{
    private JLabel lblFondoS;
    private JLabel lblSubir, lblNombre, lblDescripcion, lblInstitucion, lblCarrera, lblMateria, lblProfesor, lblTipo;
    private JTextField txtNombre, txtCarrera, txtMateria, txtProfesor, txtTipo, txtAdjuntar;
    private JComboBox cmbInstitucion;
    private JTextArea taDescripcion;
    private JButton btnSubir, btnAdjuntar, btnRegresar;
    private JScrollPane jspDescripcion;
    public static String sNombre, sDescripcion, sInstitucion, sCarrera, sMateria, sProfesor, sTipo;

    public Subir()
    {
      setTitle("Subir Archivo");
      lblSubir = new JLabel("Subir Archivo");
      lblSubir.setFont(new Font("Arial",1,23));
      lblSubir.setForeground(Color.white);
      lblSubir.setBounds(300,-20,180,150);
      add(lblSubir);

      lblNombre = new JLabel("Nombre:");
      lblNombre.setFont(new Font("Arial",1,23));
      lblNombre.setForeground(Color.white);
      lblNombre.setBounds(255,25,180,150);
      add(lblNombre);

      lblDescripcion = new JLabel("Descripci\u00f3n:");
      lblDescripcion.setFont(new Font("Arial",1,23));
      lblDescripcion.setForeground(Color.white);
      lblDescripcion.setBounds(255,70,180,150);
      add(lblDescripcion);

      lblInstitucion = new JLabel("Instituci\u00f3n:");
      lblInstitucion.setFont(new Font("Arial",1,21));
      lblInstitucion.setForeground(Color.white);
      lblInstitucion.setBounds(255,200,180,150);
      add(lblInstitucion);

      lblCarrera = new JLabel("Carrera:");
      lblCarrera.setFont(new Font("Arial",1,21));
      lblCarrera.setForeground(Color.white);
      lblCarrera.setBounds(255,240,180,150);
      add(lblCarrera);

      lblMateria = new JLabel("Materia:");
      lblMateria.setFont(new Font("Arial",1,21));
      lblMateria.setForeground(Color.white);
      lblMateria.setBounds(255,285,180,150);
      add(lblMateria);

      lblProfesor = new JLabel("Profesor:");
      lblProfesor.setFont(new Font("Arial",1,21));
      lblProfesor.setForeground(Color.white);
      lblProfesor.setBounds(255,330,180,150);
      add(lblProfesor);

      lblTipo = new JLabel("Tipo:");
      lblTipo.setFont(new Font("Arial",1,21));
      lblTipo.setForeground(Color.white);
      lblTipo.setBounds(255,375,180,150);
      add(lblTipo);

      txtNombre = new JTextField();
      txtNombre.setBounds(425,88,240,24);
      add(txtNombre);

      taDescripcion = new JTextArea();
      jspDescripcion = new JScrollPane(taDescripcion);
      jspDescripcion.setBounds(255,165,412,80);
      add(jspDescripcion);

      cmbInstitucion = new JComboBox();
      cmbInstitucion.setBounds(425,265,240,24);
      add(cmbInstitucion);
      cmbInstitucion.addItem("Seleccione una universidad");
      cmbInstitucion.addItem("Instituci\u00f3n Universitaria Pascual Bravo");
      cmbInstitucion.addItem("Instituci\u00f3n Tecnol\u00f3gica Metropolitana");
      cmbInstitucion.addItem("Colegio Mayor de Antioquia");

      txtCarrera = new JTextField();
      txtCarrera.setBounds(425,305,240,24);
      add(txtCarrera);

      txtMateria = new JTextField();
      txtMateria.setBounds(425,350,240,24);
      add(txtMateria);

      txtProfesor = new JTextField();
      txtProfesor.setBounds(425,395,240,24);
      add(txtProfesor);      

      txtTipo = new JTextField();
      txtTipo.setBounds(425,440,240,24);
      add(txtTipo);

      txtAdjuntar = new JTextField();
      txtAdjuntar.setBounds(290,493,120,22);
      txtAdjuntar.setEnabled(false);
      add(txtAdjuntar);

      btnRegresar = new JButton("Regresar");
      btnRegresar.setBackground(new Color(255,167,38));
      btnRegresar.setForeground(Color.white);
      btnRegresar.setBounds(750,40,120,23);
      add(btnRegresar);
      btnRegresar.addActionListener(this);

      btnAdjuntar = new JButton("");
      btnAdjuntar.setBackground(new Color(255,167,38));
      btnAdjuntar.setForeground(Color.white);
      btnAdjuntar.setBounds(411,493,35,23);
      add(btnAdjuntar);
      btnAdjuntar.addActionListener(this);

      btnSubir = new JButton("Subir Archivo");
      btnSubir.setBackground(new Color(255,167,38));
      btnSubir.setForeground(Color.white);
      btnSubir.setBounds(485,493,150,23);
      add(btnSubir);
      btnSubir.addActionListener(this);
  
      setLayout(null);
      Icon fondo = new ImageIcon(getClass().getResource("Subir.jpg"));
      lblFondoS = new JLabel(fondo);
      lblFondoS.setBounds(0,-10,920,580);
      add(lblFondoS);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
      if(e.getSource()==btnRegresar){
          Buscador buscador = new Buscador();
          buscador.setVisible(true);
          buscador.setSize(920,580);
          buscador.setLocationRelativeTo(null);
          this.setVisible(false);
      }
      if(e.getSource() == btnSubir)
      {
        sNombre = txtNombre.getText();
        sDescripcion += taDescripcion.getText() + "\n";
        sInstitucion = cmbInstitucion.getSelectedItem().toString();
        sCarrera = txtCarrera.getText();
        sMateria = txtMateria.getText();
        sProfesor = txtProfesor.getText();
        sTipo = txtTipo.getText();

        if(sNombre.equals("") || sDescripcion.equals("") || sInstitucion.equals("Seleccione una universidad") || sCarrera.equals("") || sMateria.equals("") || sProfesor.equals("") || sTipo.equals (""))
        {
          JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos");
          txtNombre.setText("");
          taDescripcion.setText("");
          txtCarrera.setText("");
          txtMateria.setText("");
          txtProfesor.setText("");
          txtTipo.setText("");
        }
        else
        {
          JOptionPane.showMessageDialog(null, "Subido Correctamente");
          Buscador buscador = new Buscador();
          buscador.setVisible(true);
          buscador.setSize(920,580);
          buscador.setLocationRelativeTo(null);
          this.setVisible(false);
        }
      }
    }

    public static void main(String[] args)
    {
      Subir subir = new Subir();
      subir.setSize(920,580);
      subir.setVisible(true);
      subir.setResizable(false);
      subir.setLocationRelativeTo(null);
    }
}