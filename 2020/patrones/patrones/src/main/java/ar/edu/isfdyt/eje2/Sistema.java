package ar.edu.isfdyt.eje2;

public class Sistema implements Observador {
 
    public void notificar(Sujeto s) {
        System.out.println("Cambio : " + s);
    }

    public static void main(String[] args) {
        Sistema si = new Sistema();

        Impresora i1= new Impresora();
        i1.setName("Impresora1");
        i1.añadir(si);
        
        Impresora i2= new Impresora();
        i2.setName("Impresora2");
        i2.añadir(si);
        
        i1.setEncendida(true);
        i2.setEncendida(true);
        i2.setImprimiendo(true);
        i1.setEncendida(false);

    }
    
}
