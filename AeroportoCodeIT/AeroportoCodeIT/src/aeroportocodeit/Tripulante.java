/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeroportocodeit;

import java.util.List;

/**
 *
 * @author Felippe
 */
public interface Tripulante {
    
    List<Tripulante> tripulantesConflitantes();
    
    boolean ehPiloto ();
    
    
}
