
package com.lasencinas.desayuno;

import com.lasencinas.fastbreak.FastBreakTruck;
import com.lasencinas.interfaces.Item;
import java.util.ArrayList;
import java.util.List;


public class Desayuno {
    
    private List<Item> desayunos = new ArrayList<>();

    public List<Item> getDesayunos() {
        return desayunos;
    }

    public void setDesayunos(List<Item> desayunos) {
        this.desayunos = desayunos;
    }
    
    public void mostrarItems() {
        
        for (int i = 0; i < desayunos.size() - 1; i++) {
            System.out.println(desayunos.toString());
        }
    }
    
    public Float getCoste() {
        Float precio = 0f;
        
        for (Item items: this.getDesayunos()) {
            precio = precio + items.pvp();
        }
        
        return precio;
    }
    
}
