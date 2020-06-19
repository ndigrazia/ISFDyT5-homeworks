package eje7;

public class Empleado extends Persona
{
    private Rol rol;
    
    public Empleado()
    {
    }
    
    public Rol getRol() {
        return this.rol;
    }
    public void setRol(Rol rol) {
        this.rol = rol;
    }

    //otros getters/setters
    //...
    
   public int sueldo() {
       return rol.sueldo();
   }
}
