package eje6;

import java.util.Vector;

public class Video
{
    private Persona director;
    private Vector<Persona> actores = new Vector<Persona>();

    public Video()
    {
    }
    
    public void addActor(Persona c) {
        actores.add(c);
    }
    
    public void removeActor(Persona c) {
        actores.remove(c);
    }

    public void setDirector(Persona d) {
        director = d;
    }
    
    public Persona getDirector() {
        return director;
    }

    public int precio() {
        return 0;
    }
}
