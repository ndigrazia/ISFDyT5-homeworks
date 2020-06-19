package eje2;

import java.util.Vector;

public class Album
{
    private Vector<Foto> fotos = new Vector<Foto>();
    
    public Album()
    {
    }

    public void addFoto(Foto f) {
     fotos.add(f);
    }

    public void removeFoto(Foto f) {
     fotos.remove(f);
    }

    public void addFotos(Vector fotos) {
     fotos.addAll(fotos);
    }

}
