package eje5;

import java.util.Date;

public class Libro
{
    private String titulo;
    private String editorial;
    private int cantPaginas;
    private int cantCopias;
    private Date fechaPublicacion;
    
    public Libro()
    {
    }

    //TODO getters/setters
    
    public int getCantCopias(){
        return cantCopias;
    }
    
    public void setCantCopias(int cantCopias){
        this.cantCopias = cantCopias;
    }
    
}
