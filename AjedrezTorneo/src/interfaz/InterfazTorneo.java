package interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Font;

import logica.Torneo;

@SuppressWarnings("serial")
public class InterfazTorneo extends JFrame {
    private Torneo tournament;
	private JPanel contentPane;
	private JLabel lblNombre;
	private JTextField textField_Nombre;
	private JLabel lblFecha;
	private JTextField textField_1;
	private JPanel panelboton;
	private JButton btnCrear;
	private JPanel panel_2;
	private JLabel lblNewLabel;
	private JTextField textField_2;
	private JLabel lblModalidad;
	private JComboBox<String> comboBox_Modalidad;
	private JLabel lblNewLabel_1;
	private JTextField textField;

	private void CrearTorneo(){
		tournament.setNombre(textField_Nombre.getText());
		// tournament.setFecha(lblFecha.getString());
		tournament.setLugar(textField_2.getText());
		if (comboBox_Modalidad.getSelectedIndex()==0) {
		   tournament.setModalidad(Torneo.Modalidad.ROUNDROBIN);
		} else { 
		   tournament.setModalidad(Torneo.Modalidad.SWISS);
		}
		// completar todos los datos
		JOptionPane.showMessageDialog(null, "Torneo Registrado!");
		setVisible(false); // Hace ventana invisible
		dispose(); // Destruye ventana y libera recursos		
	}


	public InterfazTorneo(Torneo torneo) {
		setTitle("Ajedrez Torneo");
		tournament = torneo;
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 191, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(3, 9, 0, 0));
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		lblNombre.setForeground(new Color(100, 149, 237));
		lblNombre.setBackground(Color.WHITE);
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNombre);
		
		textField_Nombre = new JTextField();
		panel_1.add(textField_Nombre);
		textField_Nombre.setColumns(10);
		
		lblFecha = new JLabel("Fecha");
		lblFecha.setForeground(new Color(100, 149, 237));
		lblFecha.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		lblFecha.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblFecha);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel = new JLabel("Lugar");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		lblNewLabel.setForeground(new Color(100, 149, 237));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setToolTipText("");
		panel_1.add(lblNewLabel);
		
		textField_2 = new JTextField();
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, new Color(0, 0, 0), null));
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(2, 2, 0, 0));
		
		lblModalidad = new JLabel("Modalidad");
		lblModalidad.setForeground(new Color(100, 149, 237));
		lblModalidad.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		lblModalidad.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblModalidad);
		
		comboBox_Modalidad = new JComboBox<String>();
		comboBox_Modalidad.setModel(new DefaultComboBoxModel<String>(new String[] {"Suizo", "Round Robin"}));
		comboBox_Modalidad.setSelectedIndex(0);
		panel_2.add(comboBox_Modalidad);
		
		lblNewLabel_1 = new JLabel("N\u00FAmero de Rondas");
		lblNewLabel_1.setForeground(new Color(100, 149, 237));
		lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_1);
		
		textField = new JTextField();
		panel_2.add(textField);
		textField.setColumns(10);
		
		panelboton = new JPanel();
		panelboton.setBackground(new Color(0, 191, 255));
		FlowLayout fl_panelboton = (FlowLayout) panelboton.getLayout();
		contentPane.add(panelboton);
		
		btnCrear = new JButton("Crear");
		btnCrear.setForeground(new Color(100, 149, 237));
		btnCrear.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   CrearTorneo();   
			
			}
		});
		panelboton.add(btnCrear);
	}
	
	

}
