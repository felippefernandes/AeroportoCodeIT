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
public class OficialUm implements Tripulante{
    
    private OficialUm() {}
    private static OficialUm instance = null;
    
    public List<Tripulante> tripulantesConflitantes() {
    
        List<Tripulante> tripulantesConflitantes = new ArrayList<Tripulante>();
        tripulantesConflitantes.add(ChefeDeServico.get());
        
        return tripulantesConflitantes;
    
    }
    
    public static OficialUm get () {
        
        if (instance == null){
            
            instance = new OficialUm();
        
        }
        
        return instance;
        
    }
    
    @Override
    public boolean ehPiloto() {
       return false;
    }
}
