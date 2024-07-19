package Clases_Objetos_Métodos_Cadenas;
// La clase Cuenta con una variable de instancia double llamada saldo y un constructor
// además de un método llamado deposito que realiza validación.

public class Cuenta {

    private String nombre; // variable de instancia
    private double saldo; // variable de instancia

    // el constructor inicializa nombre con el parámetro nombre
    public Cuenta(String nombre, double saldo) {// el nombre del constructor es el nombre de la clase

        this.nombre = nombre;

        // valida que el saldo sea mayor que 0.0; de lo contrario,
// la variable de instancia saldo mantiene su valor inicial predeterminado de 0.0
        if (saldo > 0.0) // si el saldo es válido  
            this.saldo = saldo; // lo asigna a la variable de instancia saldo
    }

    // método que deposita (suma) sólo una cantidad válida al saldo
    public void depositar(double montoDeposito) {
        
        if (montoDeposito > 0.0) // si el montoDeposito es válido
            saldo = saldo + montoDeposito; // lo suma al saldo
    }

    // método que devuelve el saldo de la cuenta
    
    public void retirar(double salret){
        //carga un monto a la cuenta
        if(salret > 0.0){
            if(salret < saldo){
                //resta el saldo del monto
                saldo = saldo - salret;
            }else{
                //si exceda el monto a retirar 
                //se imprime este mensaje
                System.out.println("El monto a retirar excede el saldo de la cuenta");
            }
        }
    }

    // método para establecer el nombre en el objeto
    public void establecerNombre(String nombre) {

        this.nombre = nombre; // almacenar el nombre
    }

    // método para obtener el nombre dqel objeto
    public String obtenerNombre() {

        return nombre; // devuelve el valor de nombre a quien lo invocó
    }
    public double obtenerSaldo() {
        
        return saldo;
    }
} // fin de la clase Cuenta