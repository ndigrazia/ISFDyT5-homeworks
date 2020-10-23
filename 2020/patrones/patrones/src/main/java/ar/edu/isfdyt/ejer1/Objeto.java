package ar.edu.isfdyt.ejer1;

public class Objeto {
   
    private int x;

    public void setX(int x) {
        this.x = x;
    }
        
    public int getX() {
        return x;
    }

    public static void main(String[] args) {
        Objeto o1 = new Objeto();
        o1.setX(1);
        System.out.println(o1.getX());

        Objeto o2 = new Objeto();
        o2.setX(4);
        System.out.println(o2.getX());
    }
    
}

