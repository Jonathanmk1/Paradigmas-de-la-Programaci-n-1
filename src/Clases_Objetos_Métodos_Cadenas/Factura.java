package Clases_Objetos_Métodos_Cadenas;

public class Factura {

    private String pieza;
    private String descpieza;
    private int cantidad;
    private double precio;
    private double monto;

    public Factura(String pieza, String descpieza, int cantidad, double precio) {
        this.pieza = pieza;
        this.descpieza = descpieza;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public void establecern(String pieza) {
        this.pieza = pieza; // almacenar el nombre
    }

    public void establecerd(String descpieza) {
        this.descpieza = descpieza; // almacenar la descripcion de la pieza
    }

    public void establecerc(int cantidad) {
        if(cantidad > 0){
            this.cantidad = cantidad;
        }else if(cantidad < 0){
            cantidad = 0;
            this.cantidad = cantidad;
        }else{
            this.cantidad= cantidad;
        }
    }

    //PORQUE NO ME SALE EL PRECIO EN EL MAIN?
    public void establecerp(double precio) {
        if (precio > 0){
            this.precio = this.precio + precio;
        }else if(precio < 0){
            precio = 0.0;
            this.precio=precio;
        }else{
        }
    }

    public double ObtenerMonto(int cantidad, double precio) {
        if(cantidad > 0 && precio > 0){
            this.monto = cantidad * precio;
        }else if(cantidad < 0 || precio < 0){
            this.monto = 0.0;
        }else{
        }
        return this.monto;
    }

    // método para obtener el nombre del objeto
    public String obtenern() {
        return pieza;
    }

    public String obtenerd() {
        return descpieza;
    }

    public int obtenerc() {
        return cantidad;
    }

    public double obtenerp() {
        return precio;
    }
    public double obtenerm() {
        return monto;
    }
}
