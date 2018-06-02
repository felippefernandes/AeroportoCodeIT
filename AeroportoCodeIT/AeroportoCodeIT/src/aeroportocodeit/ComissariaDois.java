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
public class ComissariaDois implements Tripulante{
    
    private ComissariaDois() {}
    private static ComissariaDois instance = null;
    
    public List<Tripulante> tripulantesConflitantes() {
        
    List<Tripulante> tripulantesConflitantes = new ArrayList<Tripulante>();
    tripulantesConflitantes.add(Piloto.get());
        
    return tripulantesConflitantes;
    
    }
    
    public static ComissariaDois get () {
        
        if (instance == null){
            
            instance = new ComissariaDois();
        
        }
        
        return instance;
        
    }
    
    
    @Override
    public boolean ehPiloto() {
       return false;
    }
    
}
