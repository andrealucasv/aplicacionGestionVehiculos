package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controladora.Controlador;
import Controladora.ControladorUnico;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menu extends JFrame {
	Controlador controla = ControladorUnico.getInstancia();
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
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
	public menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setLocationRelativeTo(null);

		
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
		
		JButton botonEliminar = new JButton("Eliminar vehiculo");
		botonEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminarVehiculo ventanaEliminar = new eliminarVehiculo(); 
		        ventanaEliminar.setVisible(true); 
		        dispose();
			}
		});
		botonEliminar.setFont(new Font("Tahoma", Font.PLAIN, 8));
		botonEliminar.setBounds(211, 197, 118, 40);
		contentPane.add(botonEliminar);
		
		JButton botonAgregar = new JButton("Agregar vehiculo");
		botonAgregar.setFont(new Font("Tahoma", Font.PLAIN, 8));
		botonAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarVehiculo ventanaAgregar = new agregarVehiculo(); 
		        ventanaAgregar.setVisible(true); 
		        dispose();
			}
		});
		botonAgregar.setBounds(83, 198, 118, 39);
		contentPane.add(botonAgregar);
		
		JButton botonConsultar = new JButton("Consultar vehiculo");
		botonConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarTodosVehiculos ventanaMostrar = new mostrarTodosVehiculos("Lista de vehiculos","Consultar"); 
		        ventanaMostrar.setVisible(true);
		        dispose();
			}
		});
		botonConsultar.setFont(new Font("Tahoma", Font.PLAIN, 8));
		botonConsultar.setBounds(339, 197, 118, 40);
		contentPane.add(botonConsultar);
		
		JButton botonMostrar = new JButton("Mostrar todos los vehiculos");
		botonMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarTodosVehiculos ventanaMostrar = new mostrarTodosVehiculos("Mostrar todos los datos de vehiculos","Modificar"); 
		        ventanaMostrar.setVisible(true); 
		        dispose();
			}
		});
		botonMostrar.setFont(new Font("Tahoma", Font.PLAIN, 8));
		botonMostrar.setBounds(193, 247, 162, 40);
		contentPane.add(botonMostrar);
		
		JLabel lblNewLabel = new JLabel("AUTOS LOCOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(180, 50, 169, 68);
		contentPane.add(lblNewLabel);
		
		JButton salir = new JButton("Salir");
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confirmacion = JOptionPane.showOptionDialog(
			            null,"¿Desea salir del sistema?", "::::...Confirmación...:::",
			            JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
			        if (confirmacion==0) {
			        	dispose();
			        }
			        
			}
		});
		salir.setBounds(228, 328, 85, 21);
		contentPane.add(salir);
	}
}
