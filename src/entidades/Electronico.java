package entidades;

import interfaces.*;

public abstract class Electronico extends Producto implements IElectronico {
    protected String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }


    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    @Override
    public String toString(){
        return String.format("Fabricante: %s",this.fabricante);
    }
}
