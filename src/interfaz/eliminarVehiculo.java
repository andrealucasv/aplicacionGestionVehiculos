package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controladora.Controlador;
import Controladora.ControladorUnico;
import aplicacionGestionVehiculos.Vehiculo;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class eliminarVehiculo extends JFrame {
	Controlador controla = ControladorUnico.getInstancia();
	private JPanel contentPane;
	private JTextField NumeroVehiculo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eliminarVehiculo frame = new eliminarVehiculo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public eliminarVehiculo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);


		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Eliminar = new JLabel("Eliminar Vehiculo");
		Eliminar.setBounds(175, 37, 199, 31);
		Eliminar.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(Eliminar);
		
		NumeroVehiculo = new JTextField();
		NumeroVehiculo.setBounds(210, 165, 125, 19);
		contentPane.add(NumeroVehiculo);
		NumeroVehiculo.setColumns(10);
		
		JButton btnNewButton = new JButton("Eliminar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int validar=0;
				validar+=controla.noVacio(NumeroVehiculo.getText(),"'Numero Vehiculo'");
				if(validar==0)
					validar+=controla.casillaNumerica(NumeroVehiculo.getText(),"'Numero Vehiculo'");
				if(validar==0) {
					int numero = Integer.parseInt(NumeroVehiculo.getText());
					Vehiculo val=controla.eliminarVehiculo(numero);
					if(val.getNum()==numero) {
						mostrarVehiculo ventanaMostrar = new mostrarVehiculo(val,"Vehículo eliminado exitosamente"); 
				        ventanaMostrar.setVisible(true);
				        dispose();
					}else {
						JOptionPane.showMessageDialog(null, "No se encontró ningún vehículo con el número especificado.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				
			}
		});
		btnNewButton.setBounds(228, 204, 85, 21);
		contentPane.add(btnNewButton);
		
		JLabel Numero = new JLabel("Ingrese el numero del carro");
		Numero.setHorizontalAlignment(SwingConstants.CENTER);
		Numero.setBounds(175, 134, 199, 21);
		contentPane.add(Numero);
		
		JButton Volver = new JButton("Volver");
		Volver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu irMenu = new menu();
        		irMenu.setVisible(true);
        		dispose();
			}
		});
		Volver.setBounds(409, 303, 85, 21);
		contentPane.add(Volver);
	}

}
