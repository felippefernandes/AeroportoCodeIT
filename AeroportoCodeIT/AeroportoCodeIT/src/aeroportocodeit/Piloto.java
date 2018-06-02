/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeroportocodeit;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Felippe
 */
public class Piloto implements Tripulante {
    
    private Piloto() {}
    private static Piloto instance = null;
    
    public List<Tripulante> tripulantesConflitantes() {
    
        List<Tripulante> tripulantesConflitantes = new ArrayList<Tripulante>();
        tripulantesConflitantes.add(ComissariaUm.get());
        tripulantesConflitantes.add(ComissariaDois.get());
        
        return tripulantesConflitantes;
    
    }
    
    public static Piloto get () {
        
        if (instance == null){
            
            instance = new Piloto();
        
        }
        
        return instance;
        
    }

    @Override
    public boolean ehPiloto() {
       return true;
    }
    
    
}
