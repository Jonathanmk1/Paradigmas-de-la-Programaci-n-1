package Clases_Objetos_Métodos_Cadenas;

public class Empleado {

    private String nombre;
    private String apellido;
    private double salario;

    // el constructor inicializa nombre con el parámetro nombre
    public Empleado(String nombre, String apellido, double salario) {// el nombre del constructor es el nombre de la clase
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public void establecern(String nombre) {
        this.nombre = nombre;
    }

    public void establecera(String apellido) {
        this.apellido = apellido;
    }

    public void establecers(double salario) {
        if(salario > 0.0){
            salario= salario * 12;
            this.salario = salario;
        }else if(salario < 0){
            
        }
    }

    public double aumento(double aumento) {
        aumento = salario * 0.10;
        salario = salario + aumento;
        return salario;
    }

    public String obtenern() {
        return nombre;
    }

    public String obtenera() {
        return apellido;
    }

    public double obteners() {
        return salario;
    }
}
