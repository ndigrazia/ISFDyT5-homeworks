package ar.edu.isfdyt.ejer1;

import java.util.Vector;

public class Kit  extends Producto {

    private Vector<Producto> products = new Vector<Producto>();

    public void addProduct(Producto product) {
        products.add(product);
    }

    public boolean removeProduct(Producto product) {
       return products.remove(product);
    }
    
    public float getPrecio() {
        float t = 0;
        for(Producto p: products) {
            t+=p.getPrecio();
        }
        return t;
    }
}