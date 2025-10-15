package interfaz;

import java.awt.EventQueue;
import aplicacionGestionVehiculos.Vehiculo;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class mostrarVehiculo extends JFrame {

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
    private JTextField Titulo;
    private String mensaje;

    /**
     * Launch the application.
     */
    public  void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    mostrarVehiculo frame = new mostrarVehiculo(vehiculo,mensaje);
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
    public mostrarVehiculo(Vehiculo vehiculo, String mensaje) {
        this.vehiculo = vehiculo;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 551, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null);


        NumeroVehiculo = new JTextField();
        NumeroVehiculo.setFont(new Font("Dialog", Font.PLAIN, 9));
        NumeroVehiculo.setBounds(116, 167, 192, 19);
        NumeroVehiculo.setEditable(false);
        NumeroVehiculo.setBorder(null); 
        contentPane.add(NumeroVehiculo);
        NumeroVehiculo.setColumns(10);

        NombreEspañol = new JTextField();
        NombreEspañol.setFont(new Font("Dialog", Font.PLAIN, 9));
        NombreEspañol.setBounds(116, 214, 192, 19);
        NombreEspañol.setEditable(false); 
        NombreEspañol.setBorder(null); 
        contentPane.add(NombreEspañol);
        NombreEspañol.setColumns(10);

        NombreIngles = new JTextField();
        NombreIngles.setFont(new Font("Dialog", Font.PLAIN, 9));
        NombreIngles.setBounds(116, 259, 192, 19);
        NombreIngles.setEditable(false); 
        NombreIngles.setBorder(null); 
        contentPane.add(NombreIngles);
        NombreIngles.setColumns(10);

        NombreConductor = new JTextField();
        NombreConductor.setFont(new Font("Dialog", Font.PLAIN, 9));
        NombreConductor.setBounds(116, 310, 192, 19);
        NombreConductor.setEditable(false); 
        NombreConductor.setBorder(null); 
        contentPane.add(NombreConductor);
        NombreConductor.setColumns(10);

        TipoCaucho = new JTextField();
        TipoCaucho.setFont(new Font("Dialog", Font.PLAIN, 9));
        TipoCaucho.setBounds(116, 361, 192, 19);
        TipoCaucho.setEditable(false); 
        TipoCaucho.setBorder(null); 
        contentPane.add(TipoCaucho);
        TipoCaucho.setColumns(10);

        TamañoCaucho = new JTextField();
        TamañoCaucho.setFont(new Font("Dialog", Font.PLAIN, 9));
        TamañoCaucho.setBounds(116, 416, 192, 19);
        TamañoCaucho.setEditable(false); 
        TamañoCaucho.setBorder(null); 
        contentPane.add(TamañoCaucho);
        TamañoCaucho.setColumns(10);

        Velocidad = new JTextField();
        Velocidad.setFont(new Font("Dialog", Font.PLAIN, 9));
        Velocidad.setBounds(399, 77, 96, 19);
        Velocidad.setEditable(false);
        Velocidad.setBorder(null); 
        contentPane.add(Velocidad);
        Velocidad.setColumns(10);

        Bomba = new JTextField();
        Bomba.setFont(new Font("Dialog", Font.PLAIN, 9));
        Bomba.setBounds(399, 124, 96, 19);
        Bomba.setEditable(false); 
        Bomba.setBorder(null); 
        contentPane.add(Bomba);
        Bomba.setColumns(10);

        Obstaculos = new JTextField();
        Obstaculos.setFont(new Font("Dialog", Font.PLAIN, 9));
        Obstaculos.setBounds(399, 169, 96, 19);
        Obstaculos.setEditable(false); 
        Obstaculos.setBorder(null); 
        contentPane.add(Obstaculos);
        Obstaculos.setColumns(10);

        Liquido = new JTextField();
        Liquido.setFont(new Font("Dialog", Font.PLAIN, 9));
        Liquido.setBounds(399, 220, 96, 19);
        Liquido.setEditable(false); 
        Liquido.setBorder(null); 
        contentPane.add(Liquido);
        Liquido.setColumns(10);

        Km = new JTextField();
        Km.setFont(new Font("Dialog", Font.PLAIN, 9));
        Km.setBounds(399, 271, 96, 19);
        Km.setEditable(false); 
        Km.setBorder(null); 
        contentPane.add(Km);
        Km.setColumns(10);

        Titulo = new JTextField();
        Titulo.setHorizontalAlignment(SwingConstants.CENTER);
        Titulo.setEditable(false);
        Titulo.setFont(new Font("Tahoma", Font.PLAIN, 25));
        Titulo.setBounds(38, 10, 457, 55);
        Titulo.setBorder(null); 
        contentPane.add(Titulo);
        Titulo.setColumns(10);


        
        JLabel lblNombreEspañol = new JLabel("Nombre en español:");
        lblNombreEspañol.setFont(new Font("Dialog", Font.PLAIN, 9));
        lblNombreEspañol.setBounds(22, 211, 84, 25);
        contentPane.add(lblNombreEspañol);
        
        JLabel lblNombreIngles = new JLabel("Nombre en inglés:");
        lblNombreIngles.setFont(new Font("Dialog", Font.PLAIN, 9));
        lblNombreIngles.setBounds(29, 256, 77, 25);
        contentPane.add(lblNombreIngles);
        
        JLabel lblNombreConductor = new JLabel("Nombre del conductor:");
        lblNombreConductor.setFont(new Font("Dialog", Font.PLAIN, 9));
        lblNombreConductor.setBounds(10, 307, 96, 25);
        contentPane.add(lblNombreConductor);
        
        JLabel lblTipoCaucho = new JLabel("Tipo de caucho:");
        lblTipoCaucho.setFont(new Font("Dialog", Font.PLAIN, 9));
        lblTipoCaucho.setBounds(38, 358, 68, 25);
        contentPane.add(lblTipoCaucho);
        
        JLabel lblTamañoCaucho = new JLabel("Tamaño de caucho:");
        lblTamañoCaucho.setFont(new Font("Dialog", Font.PLAIN, 9));
        lblTamañoCaucho.setBounds(22, 413, 84, 25);
        contentPane.add(lblTamañoCaucho);
        
        JLabel lblVelocidad = new JLabel("Velocidad:");
        lblVelocidad.setFont(new Font("Dialog", Font.PLAIN, 9));
        lblVelocidad.setBounds(347, 74, 42, 25);
        contentPane.add(lblVelocidad);
        
        JLabel lblBomba = new JLabel("Bomba:");
        lblBomba.setFont(new Font("Dialog", Font.PLAIN, 9));
        lblBomba.setBounds(354, 121, 35, 25);
        contentPane.add(lblBomba);
        
        JLabel lblObstaculos = new JLabel("Obstáculos:");
        lblObstaculos.setFont(new Font("Dialog", Font.PLAIN, 9));
        lblObstaculos.setBounds(335, 166, 54, 25);
        contentPane.add(lblObstaculos);
        
        JLabel lblLiquido = new JLabel("Líquido:");
        lblLiquido.setFont(new Font("Dialog", Font.PLAIN, 9));
        lblLiquido.setBounds(354, 217, 35, 25);
        contentPane.add(lblLiquido);
        
        JLabel lblKm = new JLabel("Kilómetros:");
        lblKm.setFont(new Font("Dialog", Font.PLAIN, 9));
        lblKm.setBounds(341, 268, 48, 25);
        contentPane.add(lblKm);
        
        JLabel lblNumeroVehiculo = new JLabel("Numero vehiculo:");
        lblNumeroVehiculo.setFont(new Font("Dialog", Font.PLAIN, 9));
        lblNumeroVehiculo.setBounds(29, 170, 77, 13);
        contentPane.add(lblNumeroVehiculo);
        
        
        Titulo.setText(mensaje);
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
        
        botonMenu = new JButton("Aceptar");
        botonMenu.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		menu irMenu = new menu();
        		irMenu.setVisible(true);
        		dispose();
        	}
        });
        botonMenu.setBounds(347, 417, 85, 21);
        contentPane.add(botonMenu);
        
        JLabel foto = new JLabel("");
		foto.setBounds(38, 57, 100, 100);
		contentPane.add(foto);
		
		
		ImageIcon imagen = new ImageIcon("imagenes/"+vehiculo.getRutaImagen());
		Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		foto.setIcon(icono);
		
    }
}
