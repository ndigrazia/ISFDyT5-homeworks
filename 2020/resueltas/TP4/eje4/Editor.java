package eje4;

import java.util.Vector;

public class Editor
{
    private Vector<Figura> figuras = new Vector<Figura>();
    
    public Editor()
    {
    }

    public void addFigura(Figura f) {
     figuras.add(f);
    }

    public void removeFigura(Figura f) {
     figuras.remove(f);
    }

   public double calcularArea() {
     double t = 0;
     
     for(Figura f:figuras) {
        t+=f.area();
     }
     
     return t;
   }
   
}
