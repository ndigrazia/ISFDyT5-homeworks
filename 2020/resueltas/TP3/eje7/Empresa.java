package eje7;

import java.util.Vector;

public class Empresa
{
    private Vector<Empleado> empleados = new Vector<Empleado>();
    
    public Empresa()
    {
    }

    public void addEmpleado(Empleado e) {
        empleados.add(e);
    }
    
    public void removeEmpleado(Empleado e) {
        empleados.remove(e);
    }
    
    public int montoTotal() {
        int total = 0;
        
        for(Empleado e:empleados) {
            total+=e.sueldo();
        }
        
        return total;
    }
}
