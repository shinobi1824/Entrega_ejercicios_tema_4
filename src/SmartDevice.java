public abstract class SmartDevice {
    private String Fabricante;
    private  String procesador;
    private int ram;
    private int almacenamiento;
    private String pantalla;
    private int resolucion;
    private int densidad_de_Pixeles;
    private double camara;
    private int bateria;
    private double alto;
    private double ancho;

    public SmartDevice() {

    }

    public SmartDevice(String fabricante, String procesador, int ram, int almacenamiento, String pantalla, int resolucion,
                       int densidad_de_Pixeles, double camara, int bateria, double alto, double ancho) {

        Fabricante = fabricante;
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.pantalla = pantalla;
        this.resolucion = resolucion;
        this.densidad_de_Pixeles = densidad_de_Pixeles;
        this.camara = camara;
        this.bateria = bateria;
        this.alto = alto;
        this.ancho = ancho;
    }
}
