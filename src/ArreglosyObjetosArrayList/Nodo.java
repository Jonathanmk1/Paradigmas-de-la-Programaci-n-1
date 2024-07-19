
package ArreglosyObjetosArrayList;
public class Nodo {
    private Nodo ant;
    private char dato;
    private Nodo sig;
    
    public Nodo (){
        this.ant = null;
        this.dato = '#';
        this.sig = null;
    }
    
    public Nodo (Nodo ant, char dt, Nodo sig){
        this.ant = ant;
        this.dato = dt;
        this.sig = sig;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }

    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}