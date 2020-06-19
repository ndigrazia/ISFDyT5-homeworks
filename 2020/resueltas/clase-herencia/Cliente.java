import java.util.Vector;

public class Cliente
{
    private Vector<CuentaCorriente> cuentasCorrientes = new Vector<CuentaCorriente>();
    
    public Cliente()
    {        
    }

    public void addCuentaCorriente(CuentaCorriente c){
        cuentasCorrientes.add(c);
    }
    
    public void removeCuentaCorriente(CuentaCorriente c){
        cuentasCorrientes.remove(c);
    }
    
    public int total(){
        return cuentasCorrientes.size();
    }
    
    public float sumaTotal(){
         float t = 0;
         
         for(CuentaCorriente c:cuentasCorrientes) {
               t+=c.getSaldo();
         }
          
         return t;
    }

}
