package eje2;

import java.util.Date;

public class Foto
{
    private String descripcion;
    private Date fecha;
    
    public Foto()
    {
    }

    public void setDescripcion(String d) {
    	descripcion = d;
    }
    
    public String getDescripcion() {
    	return descripcion;
    }

    public void setFecha(Date f) {
    	fecha = f;
    }
    
    public Date getFecha() {
    	return fecha;
    }

}
