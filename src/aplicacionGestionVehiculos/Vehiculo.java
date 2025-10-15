package aplicacionGestionVehiculos;

public class Vehiculo {
	private int num;
    private String nombreEspañol;
    private String nombreIngles;
    private String nombreConductor;
    private String tipoCaucho;
    private String tamañoCaucho;
    private String velocidad;
    private String bomba;
    private String obstaculos;
    private String liquido;
    private String km;
    private String rutaImagen;

    public Vehiculo(int num,String nombreEspañol, String nombreIngles, String nombreConductor, String tipoCaucho, String tamañoCaucho, String velocidad, String bomba, String obstaculos, String liquido, String km, String ruta) {
        this.num = num;
    	this.nombreEspañol = nombreEspañol;
        this.nombreIngles = nombreIngles;
        this.nombreConductor = nombreConductor;
        this.tipoCaucho = tipoCaucho;
        this.tamañoCaucho = tamañoCaucho;
        this.velocidad = velocidad;
        this.bomba = bomba;
        this.obstaculos = obstaculos;
        this.liquido = liquido;
        this.km = km;
        this.rutaImagen = ruta;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public String getNombreEspañol() {
        return nombreEspañol;
    }

    public void setNombreEspañol(String nombreEspañol) {
        this.nombreEspañol = nombreEspañol;
    }

    public String getNombreIngles() {
        return nombreIngles;
    }

    public void setNombreIngles(String nombreIngles) {
        this.nombreIngles = nombreIngles;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
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
    
    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
}
