
package com.lasencinas.desayuno.bebida;


public class TurbulentJuice {
    
    private String NOMBRE = "Turbulent Juuuuuice";
    private Float PVP = 30.0f;

    public TurbulentJuice(){}

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public Float getPVP() {
        return PVP;
    }

    public void setPVP(Float PVP) {
        this.PVP = PVP;
    }
    
    public String toString() {
        return "Item: " + this.NOMBRE + "\n" + "Precio: " + this.PVP;
    }
    
    
    
}
