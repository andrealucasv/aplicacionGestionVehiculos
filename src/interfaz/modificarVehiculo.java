package interfaz;

import java.awt.EventQueue;
import aplicacionGestionVehiculos.Vehiculo;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controladora.Controlador;
import Controladora.ControladorUnico;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class modificarVehiculo extends JFrame {
	Controlador controla = ControladorUnico.getInstancia();
    private JPanel contentPane;
    private JTextField NumeroVehiculo;
    private Vehiculo vehiculo;
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
    private JButton botonMenu;
    private JTextField opcion;
    private JTextField informacion;

    /**
     * Launch the application.
     */
    public  void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    modificarVehiculo frame = new modificarVehiculo(vehiculo);
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
    public modificarVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 551, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null);


        NumeroVehiculo = new JTextField();
        NumeroVehiculo.setBounds(116, 77, 192, 19);
        NumeroVehiculo.setFont(new Font("Dialog", Font.PLAIN, 9));
        NumeroVehiculo.setEditable(false); 
        NumeroVehiculo.setBorder(null); 
        contentPane.add(NumeroVehiculo);
        NumeroVehiculo.setColumns(10);

        NombreEspañol = new JTextField();
        NombreEspañol.setBounds(116, 124, 192, 19);
        NombreEspañol.setFont(new Font("Dialog", Font.PLAIN, 9));
        NombreEspañol.setEditable(false); 
        NombreEspañol.setBorder(null); 
        contentPane.add(NombreEspañol);
        NombreEspañol.setColumns(10);

        NombreIngles = new JTextField();
        NombreIngles.setBounds(116, 169, 192, 19);
        NombreIngles.setFont(new Font("Dialog", Font.PLAIN, 9));
        NombreIngles.setEditable(false); 
        NombreIngles.setBorder(null);
        contentPane.add(NombreIngles);
        NombreIngles.setColumns(10);

        NombreConductor = new JTextField();
        NombreConductor.setBounds(116, 220, 192, 19);
        NombreConductor.setFont(new Font("Dialog", Font.PLAIN, 9));
        NombreConductor.setEditable(false); 
        NombreConductor.setBorder(null); 
        contentPane.add(NombreConductor);
        NombreConductor.setColumns(10);

        TipoCaucho = new JTextField();
        TipoCaucho.setBounds(116, 271, 192, 19);
        TipoCaucho.setFont(new Font("Dialog", Font.PLAIN, 9));
        TipoCaucho.setEditable(false); 
        TipoCaucho.setBorder(null); 
        contentPane.add(TipoCaucho);
        TipoCaucho.setColumns(10);

        TamañoCaucho = new JTextField();
        TamañoCaucho.setBounds(116, 326, 192, 19);
        TamañoCaucho.setFont(new Font("Dialog", Font.PLAIN, 9));
        TamañoCaucho.setEditable(false); 
        TamañoCaucho.setBorder(null); 
        contentPane.add(TamañoCaucho);
        TamañoCaucho.setColumns(10);

        Velocidad = new JTextField();
        Velocidad.setBounds(399, 129, 96, 19);
        Velocidad.setFont(new Font("Dialog", Font.PLAIN, 9));
        Velocidad.setEditable(false); 
        Velocidad.setBorder(null); 
        contentPane.add(Velocidad);
        Velocidad.setColumns(10);

        Bomba = new JTextField();
        Bomba.setBounds(399, 176, 96, 19);
        Bomba.setFont(new Font("Dialog", Font.PLAIN, 9));
        Bomba.setEditable(false); 
        Bomba.setBorder(null); 
        contentPane.add(Bomba);
        Bomba.setColumns(10);

        Obstaculos = new JTextField();
        Obstaculos.setBounds(399, 221, 96, 19);
        Obstaculos.setFont(new Font("Dialog", Font.PLAIN, 9));
        Obstaculos.setEditable(false); 
        Obstaculos.setBorder(null); 
        contentPane.add(Obstaculos);
        Obstaculos.setColumns(10);

        Liquido = new JTextField();
        Liquido.setBounds(399, 272, 96, 19);
        Liquido.setFont(new Font("Dialog", Font.PLAIN, 9));
        Liquido.setEditable(false); 
        Liquido.setBorder(null); 
        contentPane.add(Liquido);
        Liquido.setColumns(10);

        Km = new JTextField();
        Km.setBounds(399, 323, 96, 19);
        Km.setFont(new Font("Dialog", Font.PLAIN, 9));
        Km.setEditable(false); 
        Km.setBorder(null); 
        contentPane.add(Km);
        Km.setColumns(10);

        


        
        JLabel lblNombreEspañol = new JLabel("1- Nombre en español:");
        lblNombreEspañol.setBounds(10, 121, 96, 25);
        lblNombreEspañol.setFont(new Font("Dialog", Font.PLAIN, 9));
        contentPane.add(lblNombreEspañol);
        
        JLabel lblNombreIngles = new JLabel("2- Nombre en inglés:");
        lblNombreIngles.setBounds(22, 166, 84, 25);
        lblNombreIngles.setFont(new Font("Dialog", Font.PLAIN, 9));
        contentPane.add(lblNombreIngles);
        
        JLabel lblNombreConductor = new JLabel("3- Nombre del conductor:");
        lblNombreConductor.setBounds(0, 217, 106, 25);
        lblNombreConductor.setFont(new Font("Dialog", Font.PLAIN, 9));
        contentPane.add(lblNombreConductor);
        
        JLabel lblTipoCaucho = new JLabel("4- Tipo de caucho:");
        lblTipoCaucho.setBounds(29, 268, 77, 25);
        lblTipoCaucho.setFont(new Font("Dialog", Font.PLAIN, 9));
        contentPane.add(lblTipoCaucho);
        
        JLabel lblTamañoCaucho = new JLabel("5- Tamaño de caucho:");
        lblTamañoCaucho.setBounds(10, 323, 96, 25);
        lblTamañoCaucho.setFont(new Font("Dialog", Font.PLAIN, 9));
        contentPane.add(lblTamañoCaucho);
        
        JLabel lblVelocidad = new JLabel("6- Velocidad:");
        lblVelocidad.setBounds(335, 126, 54, 25);
        lblVelocidad.setFont(new Font("Dialog", Font.PLAIN, 9));
        contentPane.add(lblVelocidad);
        
        JLabel lblBomba = new JLabel("7- Bomba:");
        lblBomba.setBounds(341, 173, 48, 25);
        lblBomba.setFont(new Font("Dialog", Font.PLAIN, 9));
        contentPane.add(lblBomba);
        
        JLabel lblObstaculos = new JLabel("8- Obstáculos:");
        lblObstaculos.setBounds(325, 218, 64, 25);
        lblObstaculos.setFont(new Font("Dialog", Font.PLAIN, 9));
        contentPane.add(lblObstaculos);
        
        JLabel lblLiquido = new JLabel("9 Líquido:");
        lblLiquido.setBounds(341, 269, 48, 25);
        lblLiquido.setFont(new Font("Dialog", Font.PLAIN, 9));
        contentPane.add(lblLiquido);
        
        JLabel lblKm = new JLabel("10- Kilómetros:");
        lblKm.setBounds(325, 320, 64, 25);
        lblKm.setFont(new Font("Dialog", Font.PLAIN, 9));
        contentPane.add(lblKm);
        
        JLabel lblNumeroVehiculo = new JLabel("Numero vehiculo:");
        lblNumeroVehiculo.setBounds(29, 80, 77, 13);
        lblNumeroVehiculo.setFont(new Font("Dialog", Font.PLAIN, 9));
        contentPane.add(lblNumeroVehiculo);
        
        JLabel foto = new JLabel("");
		foto.setBounds(384, 10, 100, 100);
		contentPane.add(foto);
		
		
		ImageIcon imagen = new ImageIcon("imagenes/"+vehiculo.getRutaImagen());
		Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		foto.setIcon(icono);
        
        
        NumeroVehiculo.setText(String.valueOf(vehiculo.getNum()));
        NombreEspañol.setText(vehiculo.getNombreEspañol());
        NombreIngles.setText(vehiculo.getNombreIngles());
        NombreConductor.setText(vehiculo.getNombreConductor());
        TipoCaucho.setText(vehiculo.getTipoCaucho());
        TamañoCaucho.setText(vehiculo.getTamañoCaucho());
        Velocidad.setText(vehiculo.getVelocidad());
        Bomba.setText(String.valueOf(vehiculo.getBomba()));
        Obstaculos.setText(String.valueOf(vehiculo.getObstaculos()));
        Liquido.setText(String.valueOf(vehiculo.getLiquido()));
        Km.setText(String.valueOf(vehiculo.getKm()));
        
        botonMenu = new JButton("Volver");
        botonMenu.setBounds(399, 382, 85, 21);
        botonMenu.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		mostrarTodosVehiculos ventanaMostrar = new mostrarTodosVehiculos("Mostrar todos los datos de vehiculos","Modificar"); 
		        ventanaMostrar.setVisible(true); 
		        dispose();
        	}
        });
        contentPane.add(botonMenu);
        
        JLabel Titulo = new JLabel("Modificar");
        Titulo.setBounds(147, 10, 239, 40);
        Titulo.setHorizontalAlignment(SwingConstants.CENTER);
        Titulo.setFont(new Font("Tahoma", Font.PLAIN, 25));
        contentPane.add(Titulo);
        
        opcion = new JTextField();
        opcion.setBounds(147, 371, 96, 19);
        contentPane.add(opcion);
        opcion.setColumns(10);
        
        informacion = new JTextField();
        informacion.setBounds(147, 408, 96, 19);
        contentPane.add(informacion);
        informacion.setColumns(10);
        
        JLabel Opcion = new JLabel("Ingrese la opcion a modificar:");
        Opcion.setFont(new Font("Tahoma", Font.PLAIN, 9));
        Opcion.setBounds(10, 374, 124, 13);
        contentPane.add(Opcion);
        
        JLabel Valor = new JLabel("Ingrese la informacion:");
        Valor.setFont(new Font("Tahoma", Font.PLAIN, 9));
        Valor.setBounds(38, 411, 96, 13);
        contentPane.add(Valor);
        
        JButton Modificar = new JButton("Modificar");
        Modificar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		int validar=0;
				validar+=controla.noVacio(opcion.getText(),"'Opcion'");
				validar+=controla.noVacio(informacion.getText(),"'Informacion'");
				if(validar==0)
					validar+=controla.casillaNumerica(opcion.getText(),"'Opcion'");
				if(validar==0) {
					int op=Integer.parseInt(opcion.getText());
					if(op>=1 && op<=10) {
						if(op==7)
							validar+=controla.validarPorcentaje(informacion.getText(),"'Bomba'",5,35,1);
						if(op==8)
							validar+=controla.validarPorcentaje(informacion.getText(),"'Obstaculos'",5,40,1);
						if(op==9)
							validar+=controla.validarPorcentaje(informacion.getText(),"'Liquido'",10,35,1);
						if(op==10)
							validar+=controla.validarPorcentaje(informacion.getText(),"'Kilometraje'",80,200,2);
	
							if(validar==0) {
								Vehiculo val=controla.modificarVehiculo(vehiculo.getNum(), Integer.parseInt(opcion.getText()), informacion.getText());	
				        		mostrarVehiculo ventanaMostrar = new mostrarVehiculo(val,"Vehículo modificado exitosamente"); 
						        ventanaMostrar.setVisible(true);
						        dispose();
							}
							
						
			        		
					} else {
		     			JOptionPane.showMessageDialog(null, "La opcion debe estar entre 1 y 10.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

					}
	        	}
        	}
        });
        Modificar.setBounds(264, 382, 96, 21);
        contentPane.add(Modificar);
        
        
    }
}
