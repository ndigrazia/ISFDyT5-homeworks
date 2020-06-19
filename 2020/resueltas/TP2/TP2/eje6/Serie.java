package eje6;

import java.util.Vector;
 
public class Serie extends Video
{
    private Vector<Capitulo> capitulos = new Vector<Capitulo>();
    
    public Serie()
    {
    }

    public void removeCapitulo(Capitulo c) {
        capitulos.remove(c);
    }
    
    //SOBRECARGA
    public void addCapitulo(Capitulo c) {
        capitulos.add(c);
    }
    
    public void addCapitulo(Vector<Capitulo> capitulos) {
        capitulos.addAll(capitulos);
    }

    //SOBREESCRITURA
    public int precio() {
        return 1;
    }

}
