package Controladora;

import aplicacionGestionVehiculos.Vehiculo;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import aplicacionGestionVehiculos.GestorVehiculos;
import aplicacionGestionVehiculos.Valores;

public class Controlador{
    private Vehiculo vehiculo;
    public GestorVehiculos gestor;
    public Valores valor;
    
    public Controlador() {
    	gestor = new GestorVehiculos();
    	valor = new Valores();
    	llenarLista();
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public void llenarLista() {
    	gestor.cargarDesdeArchivo();
    	valor.cargarDesdeArchivo();
    }
    public void agregarVehiculo(Vehiculo vehiculo2){
    	gestor.agregarVehiculo(vehiculo2);
    }
    
    public Vehiculo eliminarVehiculo(Integer numero) {
    	Vehiculo val=gestor.eliminarVehiculo(numero);
    	return val;
    }
    
    public Vehiculo consultarVehiculo(Integer numero) {
    	Vehiculo val=gestor.consultarVehiculo(numero);
    	return val;
    }
    
    public Vehiculo modificarVehiculo(int num, int op, String informacion) {
    	Vehiculo val=gestor.modificarVehiculo(num,op,informacion);
    	return val;
    }
    
    public void mostrarVehiculos(JTable tabla) {
    	gestor.mostrarTodosLosVehiculos(tabla);
    }
    
    public void listaVehiculos(JTable tabla) {
    	gestor.mostrarVehiculos(tabla);
    }
    
    public void mostrarValores(JTable tabla) {
    	valor.mostrarTodosLosValores(tabla);
    }
    
    public int noVacio(String casilla,String mensaje) {
    	int val=0;
    	if(casilla.isEmpty()) {
			JOptionPane.showMessageDialog(null, "No puedes dejar la casilla " + mensaje +" en blanco.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

    		val=1;
    	}
    	return val;
    }
    
    public int casillaNumerica(String casilla,String mensaje) {
    	int val=0;
    	try{
                Integer.parseInt(casilla);
                val=0;
              
          }catch(NumberFormatException error){
     			JOptionPane.showMessageDialog(null, "La casilla " + mensaje +" contiene caracteres no numericos.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
              val=1; 
          }
    	return val;
    }
    
    public int validarPorcentaje(String casilla, String mensaje, int minimo, int maximo,int op) {
        int val = 0;
        try {
        	if(op==1) {
        		if (!casilla.contains("%")) {
	                JOptionPane.showMessageDialog(null, "La casilla " + mensaje + " debe contener el símbolo de porcentaje (%).", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
	                return 1;
	            }
	
	        	
	            
        	} else {
        		if (!casilla.contains("km/h")) {
	                JOptionPane.showMessageDialog(null, "La casilla " + mensaje + " debe contener la expresion (km/h).", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
	                return 1;
	            }
	
	        	
	            
        	}
        	casilla = casilla.replace("%", "").trim();
        	casilla = casilla.replace("km/h", "").trim();

            double valor = Double.parseDouble(casilla);
            if (valor < minimo || valor > maximo) {
                if(op==1) {
                	JOptionPane.showMessageDialog(null, "El valor en la casilla " + mensaje + " debe estar entre " + Integer.toString(minimo) + "% y " + Integer.toString(maximo) + "%.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                }else {
                	JOptionPane.showMessageDialog(null, "El valor en la casilla " + mensaje + " debe estar entre " + Integer.toString(minimo) + "km/h y " + Integer.toString(maximo) + "km/h.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

                }
                val = 1;
            }
        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "La casilla " + mensaje + " contiene caracteres no numéricos.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            val = 1;
        }
        return val;
    }

    
}
