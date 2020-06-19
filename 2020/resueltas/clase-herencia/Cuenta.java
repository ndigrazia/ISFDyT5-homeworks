
public class Cuenta
{
    private String titular;
    private float saldo;
    
    public void depositar(float monto) {
        saldo+=monto;
    }
    
    public void extraer(float monto) {
        saldo-=monto;
    }
    
    public float getSaldo() {
        return saldo;
    }
    
    public String geTitular() {
        return titular;
    }
    //gettters-setters
    
    public String toString(){
        return "Cuenta";
    }
}
