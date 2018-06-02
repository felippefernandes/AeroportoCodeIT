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
public class ChefeDeServico implements Tripulante{
    
    private ChefeDeServico() {}
    private static ChefeDeServico instance = null;
    
    public List<Tripulante> tripulantesConflitantes() {
    
        List<Tripulante> tripulantesConflitantes = new ArrayList<Tripulante>();
        tripulantesConflitantes.add(OficialUm.get());
        tripulantesConflitantes.add(OficialDois.get());
        
        return tripulantesConflitantes;
    
    }
    
    public static ChefeDeServico get () {
        
        if (instance == null){
            
            instance = new ChefeDeServico();
        
        }
        
        return instance;
        
    }
    
    
    @Override
    public boolean ehPiloto() {
       return true;
    }
    
}
