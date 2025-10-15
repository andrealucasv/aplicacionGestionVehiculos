package aplicacionGestionVehiculos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import interfaz.mostrarVehiculo;

    

public class GestorVehiculos {
    private NodoVehiculo cabeza;
    private static final String NOMBRE_ARCHIVO = "vehiculos.txt";

    public GestorVehiculos() {
        cabeza = null;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        int id;
        boolean idUnico = false;
        while (!idUnico) {
        	
            id = (int) (Math.random() * 30);
            boolean repetido = false;
            NodoVehiculo temp = cabeza;
            while (temp != null) {
                if (temp.getVehiculo().getNum() == id) {
                    repetido = true;
                    break;
                }
                temp = temp.getSiguiente();
            }
            if (!repetido) {
                vehiculo.setNum(id);
                NodoVehiculo nuevoNodo = new NodoVehiculo(vehiculo);
                nuevoNodo.setSiguiente(cabeza);
                cabeza = nuevoNodo;
                idUnico = true;
                System.out.println("Vehículo agregado exitosamente:");
            }
        }
        guardarEnArchivo();
        }

    public Vehiculo eliminarVehiculo(int num) {
    	Vehiculo vehiculoNoEliminado = new Vehiculo(0,"","","","","","","","","","","");
        if (cabeza != null && cabeza.getVehiculo().getNum() == num) {
            Vehiculo vehiculoEliminado = cabeza.getVehiculo();
            cabeza = cabeza.getSiguiente();
            guardarEnArchivo();
            return vehiculoEliminado;
        } else {
            NodoVehiculo temp = cabeza;
            NodoVehiculo previo = null;
            while (temp != null) {
                if (temp.getVehiculo().getNum() == num) {
                    Vehiculo vehiculoEliminado = temp.getVehiculo();
                    previo.setSiguiente(temp.getSiguiente());
                    guardarEnArchivo();
                    return vehiculoEliminado;
                }
                previo = temp;
                
                temp = temp.getSiguiente();
            }
            
        }
        
        return vehiculoNoEliminado;
    }

    public Vehiculo consultarVehiculo(int num) {
        NodoVehiculo temp = cabeza;
        while (temp != null) {
            if (temp.getVehiculo().getNum() == num) {
                return temp.getVehiculo();
            }
            temp = temp.getSiguiente();
        }
        return null;
    }
    
    public Vehiculo modificarVehiculo(int num, int op, String informacion) {
        NodoVehiculo temp = cabeza;
        while (temp != null) {
            if (temp.getVehiculo().getNum() == num) {
            	if(op==1) {
            		temp.getVehiculo().setNombreEspañol(informacion);;
            	}
            	if(op==2) {
            		temp.getVehiculo().setNombreIngles(informacion);
            	}
            	if(op==3) {
            		temp.getVehiculo().setNombreConductor(informacion);
            	}
            	if(op==4) {
            		temp.getVehiculo().setTipoCaucho(informacion);
            	}
            	if(op==5) {
            		temp.getVehiculo().setTamañoCaucho(informacion);
            	}
            	if(op==6) {
            		temp.getVehiculo().setVelocidad(informacion);
            	}
            	if(op==7) {
            		temp.getVehiculo().setBomba(informacion);
            	}
            	if(op==8) {
            		temp.getVehiculo().setObstaculos(informacion);
            	}
            	if(op==9) {
            		temp.getVehiculo().setLiquido(informacion);
            	}
            	if(op==10) {
            		temp.getVehiculo().setKm(informacion);
            	}
            	guardarEnArchivo();
                return temp.getVehiculo();
            }
            temp = temp.getSiguiente();
        }
        
        return null;
    }
    
    public void mostrarVehiculo(Vehiculo vehiculo, DefaultTableModel model) {
        Object[] row = {
            vehiculo.getNum(),
            vehiculo.getNombreEspañol(),
            vehiculo.getNombreIngles(),
        };
        model.addRow(row);
    }

    public void mostrarVehiculos(JTable tabla) {
        DefaultTableModel model = new DefaultTableModel();
        NodoVehiculo temp = cabeza;
        
        model.addColumn("Numero");
        model.addColumn("Nombre Español");
        model.addColumn("Nombre Ingles");
        
        while (temp != null) {
            mostrarVehiculo(temp.getVehiculo(), model);
            temp = temp.getSiguiente();
        }
        tabla.setModel(model);
    }
    
    public void mostrarInformacionVehiculo(Vehiculo vehiculo, DefaultTableModel model) {
        Object[] row = {
            vehiculo.getNum(),
            vehiculo.getNombreEspañol(),
            vehiculo.getNombreIngles(),
            vehiculo.getNombreConductor(),
            vehiculo.getTipoCaucho(),
            vehiculo.getTamañoCaucho(),
            vehiculo.getVelocidad(),
            vehiculo.getBomba(),
            vehiculo.getObstaculos(),
            vehiculo.getLiquido(),
            vehiculo.getKm()
        };
        model.addRow(row);
    }

    public void mostrarTodosLosVehiculos(JTable tabla) {
        DefaultTableModel model = new DefaultTableModel();
        NodoVehiculo temp = cabeza;
        
        model.addColumn("Numero");
        model.addColumn("Nombre Español");
        model.addColumn("Nombre Ingles");
        model.addColumn("Nombre Conductor");
        model.addColumn("Tipo Caucho");
        model.addColumn("Tamaño Caucho");
        model.addColumn("Velocidad");
        model.addColumn("Bomba");
        model.addColumn("Obstaculos");
        model.addColumn("Liquido");
        model.addColumn("Km");
        
        while (temp != null) {
            mostrarInformacionVehiculo(temp.getVehiculo(), model);
            temp = temp.getSiguiente();
        }
        tabla.setModel(model);
        TableColumn Conductor = tabla.getColumnModel().getColumn(3);
        Conductor.setPreferredWidth(160); 
        TableColumn Ingles = tabla.getColumnModel().getColumn(2);
        Ingles.setPreferredWidth(160); 
        TableColumn Español = tabla.getColumnModel().getColumn(1);
        Español.setPreferredWidth(160);
        TableColumn Tamaño = tabla.getColumnModel().getColumn(5);
        Tamaño.setPreferredWidth(100); 
    }
    

    public void guardarEnArchivo() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO));

            NodoVehiculo temp = cabeza;
            while (temp != null) {
                Vehiculo vehiculo = temp.getVehiculo();
                String linea = vehiculo.getNum() + "," + vehiculo.getNombreEspañol() + "," + vehiculo.getNombreIngles()
                        + "," + vehiculo.getNombreConductor() + "," + vehiculo.getTipoCaucho() + ","
                        + vehiculo.getTamañoCaucho() + "," + vehiculo.getVelocidad() + "," + vehiculo.getBomba() + ","
                        + vehiculo.getObstaculos() + "," + vehiculo.getLiquido() + "," + vehiculo.getKm() + "," + vehiculo.getRutaImagen();
                writer.write(linea);
                writer.newLine();
                temp = temp.getSiguiente();
            }

            writer.close();
            System.out.println("La lista de vehículos se ha guardado en el archivo exitosamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al guardar la lista de vehículos en el archivo.");
            e.printStackTrace();
        }
    }

    public void cargarDesdeArchivo() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(NOMBRE_ARCHIVO));
            String linea;
            
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 12) {
                    int num = Integer.parseInt(partes[0]);
                    String nombreEspañol = partes[1];
                    String nombreIngles = partes[2];
                    String nombreConductor = partes[3];
                    String tipoCaucho = partes[4];
                    String tamañoCaucho = partes[5];
                    String velocidad = partes[6];
                    String bomba = partes[7];
                    String obstaculos = partes[8];
                    String liquido = partes[9];
                    String km = partes[10];
                    String rutaImagen = partes[11];
                    
                    Vehiculo vehiculo = new Vehiculo(num, nombreEspañol, nombreIngles, nombreConductor, tipoCaucho,
                            tamañoCaucho, velocidad, bomba, obstaculos, liquido, km, rutaImagen);
                    
                    agregarVehiculo(vehiculo);
                    
                }
            }
            
            reader.close();
            System.out.println("La lista de vehículos se ha cargado desde el archivo exitosamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al cargar la lista de vehículos desde el archivo.");
            e.printStackTrace();
        }
    }
}

class NodoVehiculo {
    private Vehiculo vehiculo;
    private NodoVehiculo siguiente;

    public NodoVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        this.siguiente = null;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public NodoVehiculo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoVehiculo siguiente) {
        this.siguiente = siguiente;
    }
}
