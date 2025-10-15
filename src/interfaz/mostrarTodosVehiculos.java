package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import Controladora.Controlador;
import Controladora.ControladorUnico;
import aplicacionGestionVehiculos.Vehiculo;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mostrarTodosVehiculos extends JFrame {
	Controlador controla = ControladorUnico.getInstancia();
    private JPanel contentPane;
    private JTable table;
    private JButton volver;
    private JButton Modificar;
    private String	mensaje;
    private String boton;
    /**
     * Launch the application.
     */
    public void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    mostrarTodosVehiculos frame = new mostrarTodosVehiculos(mensaje,boton);
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
    public mostrarTodosVehiculos(String mensaje, String boton) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1200, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null);


        table = new JTable();
        table.setBounds(10, 10, 414, 241);
        contentPane.add(table);

        
        	
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 121, 1166, 432);
        contentPane.add(scrollPane);
        if(boton=="Modificar") {
        	
        	
        	controla.mostrarVehiculos(table);
        }
        if(boton=="Consultar") {
        	
        	
        	controla.listaVehiculos(table);
        }
        if(boton=="Valores") {
        	controla.mostrarValores(table);
        }
        JLabel MostrarTodos = new JLabel(mensaje);
        MostrarTodos.setFont(new Font("Tahoma", Font.PLAIN, 25));
        MostrarTodos.setHorizontalAlignment(SwingConstants.CENTER);
        MostrarTodos.setBounds(364, 28, 519, 66);
        contentPane.add(MostrarTodos);
        
        volver = new JButton("Volver");
        volver.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(boton=="Consultar" || boton=="Modificar") {
        			menu irMenu = new menu();
	        		irMenu.setVisible(true);
	        		dispose();
        		} else {
	        		dispose();
        		}
        		
        	}
        });
        volver.setBounds(1039, 90, 85, 21);
        contentPane.add(volver);
        
        Modificar = new JButton(boton);
        Modificar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		int fila = table.getSelectedRow();
                if (fila != -1) { 
                    int num = (int) table.getValueAt(fila, 0); 
                    if(boton=="Modificar") {
                    	modificarVehiculo ventanaModificar = new modificarVehiculo(controla.consultarVehiculo(num)); 
                    	ventanaModificar.setVisible(true);
                    }
                    if(boton=="Consultar") {
                    	mostrarVehiculo ventanaModificar = new mostrarVehiculo(controla.consultarVehiculo(num),"Consultar Vehiculo"); 
                    	ventanaModificar.setVisible(true);
                    }
			        
			        dispose();

                }
        	}
        });
        Modificar.setBounds(10, 90, 112, 21);
        contentPane.add(Modificar);
    }
}
