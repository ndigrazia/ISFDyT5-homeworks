package eje2;

import java.util.Date;

public class CuentaBancaria
{
    //Atributos
    //Alcance[private] tipo[int/long/String/...] nombre
    
    private float saldo;
    private String titular;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private int cantExtraccciones;
    
    //Operacion 
    ////Alcance(private/public] void|tipo[int/long/String/...] nombre
    
    //Getters
    public String getTitular(){
        return titular;
    }

    public Date getFechaCreacion(){
        return fechaCreacion;
    }

    public float getSaldo(){
        return saldo;
    }

    public int getCantExtraccciones(){
        return cantExtraccciones;
    }

    //Setters
    public void setTitular(String t){
        titular = t;
    }

    public void setFechaCreacion(Date fc){
        fechaCreacion = fc;
    }

    public void setCantExtraccciones(int ce) {
        cantExtraccciones = ce;
    }

    //TODO Agregar los setters/getters que considere
    
    public void depositar(float monto) {
       saldo=saldo+monto;//saldo+=monto;
    }
    
    public void extraer(float monto) {
        if(saldo>=monto && cantExtraccciones>0) {//
            saldo=saldo-monto;//saldo-=monto;
            cantExtraccciones=cantExtraccciones-1;//cantExtraccciones--
        }
    }

}
