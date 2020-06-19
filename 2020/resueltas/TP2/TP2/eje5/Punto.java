package eje5;

public class Punto
{
    private int x;
    private int y;

    public Punto()
    {
        x = 0;
        y = 0;
    }
    
    public Punto(int x, int y)
    {
       this.x = x;
       this.y = y;
    }
    
    public void setX(int x) {
       this.x = x;
    }

    public void setY(int y) {
       this.y = y;
    }

    public int getX() {
       return x;
    }

    public int getY() {
       return y;
    }
    
    public void sumarValor(int unValor) {
       x+=unValor;
       y+=unValor;
    }

    public void sumarPunto(Punto unPunto) {
        x += unPunto.getX(); 
        y += unPunto.getY();
    }

    public double distanciaDe(Punto unPunto) {
        double radicando = Math.pow(unPunto.getX() - x, 2) + Math.pow(unPunto.getY() - y, 2);
        return Math.sqrt(radicando);
    }

    public double distanciaAlOrigen() {
        return distanciaDe(new Punto(0,0));
    }    

}
