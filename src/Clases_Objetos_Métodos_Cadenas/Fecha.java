
package Clases_Objetos_Métodos_Cadenas;

public class Fecha {
    private int mes;
    private int dia;
    private int anio;
    private String fecha;
    
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        
    }
    public void establecerd(int dia){
        if( dia <= 31){
       this.dia = dia;
        }else{
            System.out.println("Fuera de rango");
        }
    }
    public void establecerm(int mes){
        if(mes <= 12){
            this.mes = mes;
        }else {
            System.out.println("Fuera de rango");
        }
    }
    public void establecera(int anio){
        this.anio = anio;
    }
    public String fecha(){
        fecha = mes + "/" + dia + "/" + anio;
        return fecha;
    }
    public int obtenerd(){
        return dia;
    } 
    public int obtenerm(){
        return mes;
    }
    public int obtenera(){
        return anio;
    }
}
