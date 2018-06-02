/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeroportocodeit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Felippe
 */
public class AeroportoCodeIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Tripulante> obterTodosTripulantes = getTodosTripulantes();
        
        Random random = new Random();
        while (obterTodosTripulantes.size() > 1) {
        
            int index = random.nextInt(obterTodosTripulantes.size() - 1 );
            Tripulante tripulanteUm = obterTodosTripulantes.remove(index);
            
             if (obterTodosTripulantes.size() == 1 ) {
             
                 index = 0;
                 
             }
             
             else {
                index = random.nextInt(obterTodosTripulantes.size() - 1 );
            }
                Tripulante tripulanteDois = obterTodosTripulantes.remove(index);
        
            if (tripulanteUm.tripulantesConflitantes().contains(tripulanteDois) ||
               tripulanteDois.tripulantesConflitantes().contains(tripulanteUm)) {
            
                System.out.println("Tripulantes não podem ser transportados"); 
                
        
            }
            
            
            if (!tripulanteUm.ehPiloto() || !tripulanteDois.ehPiloto()){
                             
                System.out.println("Não existe piloto para Smart42");
            }
            
            if (obterTodosTripulantes.size() == 0){
                return;
            }
            
            if (tripulanteUm.ehPiloto()) {
                System.out.println("Passageiro  " + tripulanteDois.getClass().getSimpleName() + " transportado");
                obterTodosTripulantes.add(tripulanteUm);
            } else {
                System.out.println("Passageiro  " + tripulanteUm.getClass().getSimpleName() + " transportado");
                obterTodosTripulantes.add(tripulanteDois);
              }
            
            
           
        }
        
        
    }
    
    public static List<Tripulante> getTodosTripulantes() {

        List<Tripulante> tripulantes = new ArrayList<Tripulante>();
        tripulantes.add(Piloto.get());
        tripulantes.add(OficialUm.get());
        tripulantes.add(OficialDois.get());
        tripulantes.add(ChefeDeServico.get());
        tripulantes.add(ComissariaUm.get());
        tripulantes.add(ComissariaDois.get());
        tripulantes.add(Policial.get());
        tripulantes.add(Presidiario.get());
        
        return tripulantes;
    }
    
}
