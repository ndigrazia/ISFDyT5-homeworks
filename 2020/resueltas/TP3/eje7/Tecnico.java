package eje7;

public class Tecnico extends Rol
{
    private int monto;
    
    public Tecnico()
    {
    }

    public int sueldo() {
        return monto;
    }
    
    public void setMonto(int monto) {
        this.monto = monto;
    }
    
    public int getMonto() {
        return monto;
    }

}
