package eje5;

import java.util.Vector;

public class Libreria
{
    private Vector<Libro> libros = new Vector<Libro>();
    
    public Libreria()
    {
    }

    //Agrega un libro a la colección
    public void agregarLibro(Libro unLibro) {
        libros.add(unLibro);
    }
    
    //Elimina un libro de la colección
    public void eliminarLibro(Libro unLibro) {
        libros.remove(unLibro);
    }

    //Retorna la cantidad de libros
    public int cantidadDeLibros() {
        return libros.size();
    }

    //Retorna la cantidad total de copias
    public int cantidadTotalDeCopias()  {
        int t = 0;
        
        for(Libro l:libros)
            t+=l.getCantCopias();
            
       return t;
    }
    
}
