
package com.lasencinas.fastbreak;

import com.lasencinas.desayuno.Desayuno;
import com.lasencinas.desayuno.bebida.TurbulentJuice;
import com.lasencinas.desayuno.cereales.Eyeholes;
import com.lasencinas.interfaces.Item;


public class FastBreakTruck {
    
    public FastBreakTruck(){
        
    }
    
    public static Desayuno prepararEyeHoles() {
        Item eyeholes = (Item) new Eyeholes();
        Item turbulentJuice = (Item) new TurbulentJuice();
        Desayuno desayuno = new Desayuno();
        desayuno.getDesayunos().add(eyeholes);
        desayuno.getDesayunos().add(turbulentJuice);

        return desayuno;
    }
    
}
