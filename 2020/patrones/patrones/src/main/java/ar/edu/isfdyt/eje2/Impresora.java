package ar.edu.isfdyt.eje2;

public class Impresora extends Sujeto {

    private boolean encendida;
    private String name;
    private boolean imprimiendo;
	
    public void setEncendida(boolean e) {
        encendida = e;
        notificar();
    }

    public void setImprimiendo(boolean i) {
        imprimiendo = i;
        notificar();
    }

    public boolean isEncendida() {
        return encendida;
    }

    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

    public String toString() {
        return name;
    }

}
