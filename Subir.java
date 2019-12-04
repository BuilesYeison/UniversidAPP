import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Subir extends JFrame implements ActionListener
{
    private JLabel lblFondoS;
    private JLabel lblSubir, lblNombre, lblDescripcion, lblInstitucion, lblMateria, lblCarrera, lblProfesor, lblTipo;
    private JTextField txtNombre, txtAdjuntar;
    private JComboBox cmbInstitucion, cmbCarrera, cmbMateria, cmbProfesor, cmbTipo;
    private JTextArea taDescripcion;
    private JButton btnSubir, btnAdjuntar, btnRegresar;
    private JScrollPane jspDescripcion;
    public String sNombre, sDescripcion, sInstitucion, sCarrera, sMateria, sProfesor, sTipo;

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

      lblCarrera = new JLabel("Carrera:");
      lblCarrera.setFont(new Font("Arial",1,21));
      lblCarrera.setForeground(Color.white);
      lblCarrera.setBounds(255,240,180,150);
      add(lblCarrera);

      lblInstitucion = new JLabel("Instituci\u00f3n:");
      lblInstitucion.setFont(new Font("Arial",1,21));
      lblInstitucion.setForeground(Color.white);
      lblInstitucion.setBounds(255,200,180,150);
      add(lblInstitucion);

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

      cmbCarrera = new JComboBox();
      cmbCarrera.setBounds(425,305,240,24);
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

      cmbMateria = new JComboBox();
      cmbMateria.setBounds(425,350,240,24);
      add(cmbMateria);
      cmbMateria.addItem("Seleccione una materia");

      cmbProfesor = new JComboBox();
      cmbProfesor.setBounds(425,395,240,24);
      add(cmbProfesor);
      cmbProfesor.addItem("Seleccione un profesor");

      cmbTipo = new JComboBox();
      cmbTipo.setBounds(425,440,240,24);
      add(cmbTipo);
      cmbTipo.addItem("Seleccione un tipo de archivo");
      cmbTipo.addItem("Examen");
      cmbTipo.addItem("Parcial");
      cmbTipo.addItem("Quiz");
      cmbTipo.addItem("Taller");
      cmbTipo.addItem("Gu\u00eda");
      cmbTipo.addItem("Exposici\u00f3n");

      txtAdjuntar = new JTextField();
      txtAdjuntar.setBounds(290,493,120,22);
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
        sCarrera = cmbCarrera.getSelectedItem().toString();
        sMateria = cmbMateria.getSelectedItem().toString();
        sProfesor = cmbProfesor.getSelectedItem().toString();
        sTipo = cmbTipo.getSelectedItem().toString();

        if(sNombre.equals("") || sDescripcion.equals("") || sInstitucion.equals("Seleccione una universidad") || sCarrera.equals("Seleccione una carrera") || sMateria.equals("Seleccione una materia") || sProfesor.equals("Seleccione un profesor") || sTipo.equals ("Seleccione un tipo de archivo"))
        {
          JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos");
          txtNombre.setText("");
          taDescripcion.setText("");
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