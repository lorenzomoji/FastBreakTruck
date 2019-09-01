
package com.lasencinas.desayuno.cereales;


public class Eyeholes {
    
    private String NOMBRE = "Eyeholes";
    private Float PVP = 25.0f;


    public Eyeholes(){}

    public String nombre(){
        return this.NOMBRE;
    }

    public Float pvp(){
        return this.PVP;
    }

    public String toString(){
        return "\nItem: " + this.NOMBRE + ", Empaquetado: " + super.toString() + ", Precio: " + this.pvp();
    }
    
}
