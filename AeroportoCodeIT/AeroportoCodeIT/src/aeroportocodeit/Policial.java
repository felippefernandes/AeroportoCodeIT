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
public class Policial implements Tripulante{
    
    private Policial() {}
    private static Policial instance = null;
    
    public List<Tripulante> tripulantesConflitantes() {
    
        List<Tripulante> tripulantesConflitantes = new ArrayList<Tripulante>();
        tripulantesConflitantes.add(Piloto.get());
        tripulantesConflitantes.add(OficialUm.get());
        tripulantesConflitantes.add(OficialDois.get());
        tripulantesConflitantes.add(ChefeDeServico.get());
        tripulantesConflitantes.add(ComissariaUm.get());
        tripulantesConflitantes.add(ComissariaDois.get());
        
        return tripulantesConflitantes;
        
    }
    
    public static Policial get () {
        
        if (instance == null){
            
            instance = new Policial();
        
        }
        
        return instance;
        
    }
    
    @Override
    public boolean ehPiloto() {
       return true;
    }
    
}
