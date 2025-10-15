package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controladora.ControladorUnico;
import Controladora.Controlador;
import aplicacionGestionVehiculos.GestorVehiculos;
import aplicacionGestionVehiculos.Vehiculo;
import Controladora.Controlador;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class agregarVehiculo extends JFrame {
	Controlador controla = ControladorUnico.getInstancia();
    private JPanel contentPane;
    private JTextField NombreEspañol;
    private JTextField NombreIngles;
    private JTextField NombreConductor;
    private JTextField TipoCaucho;
    private JTextField TamañoCaucho;
    private JTextField Velocidad;
    private JTextField Bomba;
    private JTextField Obstaculos;
    private JTextField Liquido;
    private JTextField Km;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    agregarVehiculo frame = new agregarVehiculo();
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
    public agregarVehiculo() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 551, 396);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null);


        JLabel lblNewLabel = new JLabel("AGREGAR");
        lblNewLabel.setBounds(218, 45, 108, 31);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
        contentPane.add(lblNewLabel);

        JLabel lblNombreEspañol = new JLabel("Nombre en español:");
        lblNombreEspañol.setFont(new Font("Dialog", Font.PLAIN, 8));
        lblNombreEspañol.setBounds(40, 100, 100, 25);
        contentPane.add(lblNombreEspañol);

        JLabel lblNombreIngles = new JLabel("Nombre en inglés:");
        lblNombreIngles.setFont(new Font("Dialog", Font.PLAIN, 8));
        lblNombreIngles.setBounds(56, 135, 84, 25);
        contentPane.add(lblNombreIngles);

        JLabel lblNombreConductor = new JLabel("Nombre del conductor:");
        lblNombreConductor.setFont(new Font("Dialog", Font.PLAIN, 8));
        lblNombreConductor.setBounds(40, 170, 100, 25);
        contentPane.add(lblNombreConductor);

        JLabel lblTipoCaucho = new JLabel("Tipo de caucho:");
        lblTipoCaucho.setFont(new Font("Tahoma", Font.PLAIN, 8));
        lblTipoCaucho.setBounds(66, 205, 74, 25);
        contentPane.add(lblTipoCaucho);

        JLabel lblTamañoCaucho = new JLabel("Tamaño de caucho:");
        lblTamañoCaucho.setFont(new Font("Tahoma", Font.PLAIN, 8));
        lblTamañoCaucho.setBounds(49, 240, 91, 25);
        contentPane.add(lblTamañoCaucho);

        JLabel lblVelocidad = new JLabel("Velocidad:");
        lblVelocidad.setFont(new Font("Tahoma", Font.PLAIN, 8));
        lblVelocidad.setBounds(86, 275, 54, 25);
        contentPane.add(lblVelocidad);

        JLabel lblBomba = new JLabel("Bomba:");
        lblBomba.setFont(new Font("Tahoma", Font.PLAIN, 8));
        lblBomba.setBounds(395, 100, 35, 25);
        contentPane.add(lblBomba);

        JLabel lblObstaculos = new JLabel("Obstáculos:");
        lblObstaculos.setFont(new Font("Tahoma", Font.PLAIN, 8));
        lblObstaculos.setBounds(376, 135, 54, 25);
        contentPane.add(lblObstaculos);

        JLabel lblLiquido = new JLabel("Líquido:");
        lblLiquido.setFont(new Font("Tahoma", Font.PLAIN, 8));
        lblLiquido.setBounds(386, 170, 42, 25);
        contentPane.add(lblLiquido);

        JLabel lblKm = new JLabel("Kilómetros:");
        lblKm.setFont(new Font("Tahoma", Font.PLAIN, 8));
        lblKm.setBounds(376, 205, 54, 25);
        contentPane.add(lblKm);

        NombreEspañol = new JTextField();
        NombreEspañol.setBounds(150, 100, 200, 25);
        contentPane.add(NombreEspañol);
        NombreEspañol.setColumns(10);

        NombreIngles = new JTextField();
        NombreIngles.setBounds(150, 135, 200, 25);
        contentPane.add(NombreIngles);
        NombreIngles.setColumns(10);

        NombreConductor = new JTextField();
        NombreConductor.setBounds(150, 170, 200, 25);
        contentPane.add(NombreConductor);
        NombreConductor.setColumns(10);

        TipoCaucho = new JTextField();
        TipoCaucho.setBounds(150, 205, 200, 25);
        contentPane.add(TipoCaucho);
        TipoCaucho.setColumns(10);

        TamañoCaucho = new JTextField();
        TamañoCaucho.setBounds(150, 240, 200, 25);
        contentPane.add(TamañoCaucho);
        TamañoCaucho.setColumns(10);

        Velocidad = new JTextField();
        Velocidad.setBounds(150, 275, 200, 25);
        contentPane.add(Velocidad);
        Velocidad.setColumns(10);

        Bomba = new JTextField();
        Bomba.setBounds(440, 100, 70, 25);
        contentPane.add(Bomba);
        Bomba.setColumns(10);

        Obstaculos = new JTextField();
        Obstaculos.setBounds(440, 135, 70, 25);
        contentPane.add(Obstaculos);
        Obstaculos.setColumns(10);

        Liquido = new JTextField();
        Liquido.setBounds(440, 170, 70, 25);
        contentPane.add(Liquido);
        Liquido.setColumns(10);

        Km = new JTextField();
        Km.setBounds(440, 205, 70, 25);
        contentPane.add(Km);
        Km.setColumns(10);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(396, 253, 114, 45);
        contentPane.add(comboBox);
        
        ImageIcon imagen = new ImageIcon("imagenes/doce.png");
		Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		comboBox.addItem(icono);
		ImageIcon imagen2 = new ImageIcon("imagenes/trece.png");
		Icon icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		comboBox.addItem(icono2);
		ImageIcon imagen3 = new ImageIcon("imagenes/catorce.png");
		Icon icono3 = new ImageIcon(imagen3.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		comboBox.addItem(icono3);
		ImageIcon imagen4 = new ImageIcon("imagenes/quince.png");
		Icon icono4 = new ImageIcon(imagen4.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		comboBox.addItem(icono4);

        JButton btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	int validar=0;
				validar+=controla.noVacio(NombreEspañol.getText(),"'Nombre en español'");
				validar+=controla.noVacio(NombreIngles.getText(),"'Nombre en ingles'");
				validar+=controla.noVacio(NombreConductor.getText(),"'Nombre del conductor'");
				validar+=controla.noVacio(TipoCaucho.getText(),"'Tipo de caucho'");
				validar+=controla.noVacio(TamañoCaucho.getText(),"'Tamaño de caucho'");
				validar+=controla.noVacio(Velocidad.getText(),"'Velocidad'");
				validar+=controla.noVacio(Bomba.getText(),"'Bomba'");
				validar+=controla.noVacio(Obstaculos.getText(),"'Obstaculos'");
				validar+=controla.noVacio(Liquido.getText(),"'Liquido'");
				validar+=controla.noVacio(Km.getText(),"'Kilometros'");
				
				if(validar==0) {
					validar+=controla.validarPorcentaje(Bomba.getText(),"'Bomba'",5,35,1);
					validar+=controla.validarPorcentaje(Obstaculos.getText(),"'Obstaculos'",5,40,1);
					validar+=controla.validarPorcentaje(Liquido.getText(),"'Liquido'",10,35,1);
					validar+=controla.validarPorcentaje(Km.getText(),"'Kilometros'",80,200,2);
				}	
            	
            	if(validar==0) {
	                String nombreEspañol = NombreEspañol.getText();
	                String nombreIngles = NombreIngles.getText();
	                String nombreConductor = NombreConductor.getText();
	                String tipoCaucho = TipoCaucho.getText();
	                String tamañoCaucho = TamañoCaucho.getText();
	                String velocidad = Velocidad.getText();
	                String bomba = Bomba.getText();
	                String obstaculos = Obstaculos.getText();
	                String liquido = Liquido.getText();
	                String km = Km.getText();
	                int opcion = comboBox.getSelectedIndex();
	                String ruta = "";
	                if(opcion==0) {
	                	ruta = "doce.png";
	                }
	                if(opcion==1) {
	                	ruta = "trece.png";
	                }
	                if(opcion==2) {
	                	ruta = "catorce.png";
	                }
	                if(opcion==3) {
	                	ruta = "quince.png";
	                }
	
	                Vehiculo vehiculoNuevo = new Vehiculo(0, nombreEspañol, nombreIngles, nombreConductor, tipoCaucho, tamañoCaucho, velocidad, bomba, obstaculos, liquido, km,ruta);
	                
	                controla.agregarVehiculo(vehiculoNuevo);
	                
	                mostrarVehiculo ventanaMostrar = new mostrarVehiculo(vehiculoNuevo,"Vehículo agregado exitosamente");
			        ventanaMostrar.setVisible(true);
	                dispose();
            	}
                
            }
        });
        btnAgregar.setBounds(226, 310, 100, 30);
        contentPane.add(btnAgregar);
        
        JButton Volver = new JButton("Volver");
        Volver.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		menu irMenu = new menu();
        		irMenu.setVisible(true);
        		dispose();
        	}
        });
        Volver.setBounds(425, 312, 85, 21);
        contentPane.add(Volver);
        
        JButton Valores = new JButton("Valores");
        Valores.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		mostrarTodosVehiculos ventanaMostrar = new mostrarTodosVehiculos("Lista de valores","Valores"); 
		        ventanaMostrar.setVisible(true);
        	}
        });
        Valores.setBounds(27, 316, 85, 21);
        contentPane.add(Valores);
        
        
		
    }
}
