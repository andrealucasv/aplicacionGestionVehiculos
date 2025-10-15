
package Controladora;

import Controladora.Controlador;

public class ControladorUnico {
    
    private static Controlador controlador;
    
    public static Controlador getInstancia() {
        if (controlador == null) controlador = new Controlador();
        return controlador;
    }
    
}