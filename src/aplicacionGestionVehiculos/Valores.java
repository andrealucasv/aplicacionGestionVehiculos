package aplicacionGestionVehiculos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Valores {
	private int num;
    private String tipoCaucho;
    private String tamañoCaucho;
    private String velocidad;
    private String bomba;
    private String obstaculos;
    private String liquido;
    private String km;
    private NodoValores cabeza;
    private static final String NOMBRE_ARCHIVO = "valores.txt";

    public Valores(int num, String tipoCaucho, String tamañoCaucho, String velocidad, String bomba, String obstaculos, String liquido, String km) {
        this.num = num;
        this.tipoCaucho = tipoCaucho;
        this.tamañoCaucho = tamañoCaucho;
        this.velocidad = velocidad;
        this.bomba = bomba;
        this.obstaculos = obstaculos;
        this.liquido = liquido;
        this.km = km;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTipoCaucho() {
        return tipoCaucho;
    }

    public void setTipoCaucho(String tipoCaucho) {
        this.tipoCaucho = tipoCaucho;
    }

    public String getTamañoCaucho() {
        return tamañoCaucho;
    }

    public void setTamañoCaucho(String tamañoCaucho) {
        this.tamañoCaucho = tamañoCaucho;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getBomba() {
        return bomba;
    }

    public void setBomba(String bomba) {
        this.bomba = bomba;
    }

    public String getObstaculos() {
        return obstaculos;
    }

    public void setObstaculos(String obstaculos) {
        this.obstaculos = obstaculos;
    }

    public String getLiquido() {
        return liquido;
    }

    public void setLiquido(String liquido) {
        this.liquido = liquido;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }
    
    

    public Valores() {
        cabeza = null;
    }
    
    public void agregarValores(Valores valores) {
                NodoValores nuevoNodo = new NodoValores(valores);
                nuevoNodo.setSiguiente(cabeza);
                cabeza = nuevoNodo;
        }
    
    public void mostrarInformacionValores(Valores valores, DefaultTableModel model) {
        Object[] row = {
            valores.getNum(),
            valores.getTipoCaucho(),
            valores.getTamañoCaucho(),
            valores.getVelocidad(),
            valores.getBomba(),
            valores.getObstaculos(),
            valores.getLiquido(),
            valores.getKm()
        };
        model.addRow(row);
    }

    public void mostrarTodosLosValores(JTable tabla) {
        DefaultTableModel model = new DefaultTableModel();
        NodoValores temp = cabeza;
        
        model.addColumn("Tipo");
        model.addColumn("TipoCaucho");
        model.addColumn("TamañoCaucho");
        model.addColumn("Velocidad");
        model.addColumn("Bomba");
        model.addColumn("Obstaculos");
        model.addColumn("Liquido");
        model.addColumn("Km");
        
        while (temp != null) {
            mostrarInformacionValores(temp.getValores(), model);
            temp = temp.getSiguiente();
        }
        tabla.setModel(model);
    }
    
    public void cargarDesdeArchivo() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(NOMBRE_ARCHIVO));
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 8) {
                    int num = Integer.parseInt(partes[0]);
                    String tipoCaucho = partes[1];
                    String tamañoCaucho = partes[2];
                    String velocidad = partes[3];
                    String bomba = partes[4];
                    String obstaculos = partes[5];
                    String liquido = partes[6];
                    String km = partes[7];
                    Valores valores = new Valores(num, tipoCaucho, tamañoCaucho, velocidad, bomba, obstaculos, liquido, km);
                    agregarValores(valores);
                }
            }
            
            reader.close();
            System.out.println("La lista de valores se ha cargado desde el archivo exitosamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al cargar la lista de vehículos desde el archivo.");
            e.printStackTrace();
        }
    }
    
}

class NodoValores {
    private Valores valores;
    private NodoValores siguiente;

    public NodoValores(Valores valores) {
        this.valores = valores;
        this.siguiente = null;
    }

    public Valores getValores() {
        return valores;
    }

    public void setValores(Valores valores) {
        this.valores = valores;
    }

    public NodoValores getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoValores siguiente) {
        this.siguiente = siguiente;
    }
}
