package eje5;

public class Circulo
{
    private int radio;
    private Punto centro;
    
    public Circulo(Punto p, int r)
    {
        centro = p;
        radio = r;
    }
    
    public void setRadio(int radio) {
      this.radio = radio;
    }
    
    public void setCentro(Punto centro) {
      this.centro = centro;
    }

    public int getRadio() {
      return this.radio;
    }
    
    public Punto getCentro() {
      return this.centro;
    }

    public void ampliar(int unValor) {
      radio+=unValor;
    }
    
    public double area() {
      return Math.PI * Math.pow(radio, 2);
    }
    
    public void trasladar(int x, int y){
      centro.sumarPunto(new Punto(x, y));
    }
        
}
