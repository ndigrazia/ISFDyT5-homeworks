package ar.edu.isfdyt.eje2;

import java.util.Vector;

public class Sujeto {
    
    private Vector<Observador> observadores = new Vector<Observador>();

    public void añadir(Observador o) {
        observadores.add(o);
    }

    public void eliminar(Observador o) {
        observadores.add(o);
    }

    public void notificar() {
        for(Observador o:observadores) 
            o.notificar(this);
    }
}

