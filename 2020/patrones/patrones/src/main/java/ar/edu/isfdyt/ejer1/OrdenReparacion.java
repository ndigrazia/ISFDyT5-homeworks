package ar.edu.isfdyt.ejer1;

import java.util.Vector;

public class OrdenReparacion {

    private Vector<Producto> products = new Vector<Producto>();

    public void addProduct(Producto product) {
        products.add(product);
    }

    public boolean removeProduct(Producto product) {
       return products.remove(product);
    }

    public float getPrecioTotal() {
        float t = 0;
        for(Producto p: products) {
            t+=p.getPrecio();
        }
        return t;
    }

    public static void main(String[] args) {
        OrdenReparacion o = new OrdenReparacion();

        Pieza p1 = new Pieza();
        p1.setPrecio(12);
        
        Pieza p2 = new Pieza();
        p2.setPrecio(11);

        Pieza p3 = new Pieza();
        p3.setPrecio(11);

        Pieza p4 = new Pieza();
        p4.setPrecio(11);

        Pieza p5 = new Pieza();
        p5.setPrecio(11);

        Kit k1 = new Kit();
        k1.addProduct(p1);
        k1.addProduct(p2);

        Kit k2 = new Kit();
        k2.addProduct(p3);
        k2.addProduct(p4);
        k2.addProduct(k1);

        o.addProduct(k2);
        o.addProduct(p5);

        o.getPrecioTotal();

    }

}