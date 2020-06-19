public class CajaAhorro extends Cuenta
{
    
    public void extraer(float monto) {
        if(monto <= getSaldo())
            super.extraer(monto);
    }
    
    public String toString(){
        return "CajaAhorro";
    }


}
