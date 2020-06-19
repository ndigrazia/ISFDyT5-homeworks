public class CuentaCorriente extends Cuenta
{
    private float montoPrestamo;
    
    public void extraer(float monto) {
        if(monto <= getSaldo() + montoPrestamo)
            super.extraer(monto);
    }

    public float getMontoPrestado() {
        return montoPrestamo;
    }
    
    public void setMontoPrestado(float monto) {
        montoPrestamo = monto;
    }
    
    public String toString(){
        return "CuentaCorriente";
    }

}
