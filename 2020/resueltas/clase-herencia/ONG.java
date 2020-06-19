import java.util.Vector;

public class ONG
{
    private Vector<Cuenta> cuentas = new Vector<Cuenta>();
    
    public ONG()
    {        
    }

    public void addCuenta(Cuenta c){
        cuentas.add(c);
    }
    
    public void removeCuenta(Cuenta c){
        cuentas.remove(c);
    }
    
    public void imprimirCuentas() {
        for(Cuenta c:cuentas)
            System.out.println(c.toString());
    }

}
