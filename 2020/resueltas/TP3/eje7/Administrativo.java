package eje7;


public class Administrativo extends Rol
{
    private int categoria;
    private int antiguedad;
    
    public Administrativo()
    {
    }

    public int sueldo() {
        return categoria * antiguedad;
    }
    
    public void setCategoria(int cat) {
        categoria = cat;
    }
        
    public int getCategoria() {
        return categoria;
    }

    
    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

}
