
package br.com.ufc.pds.serpentesEscadas.tabuleiro;

import java.util.Random;

public class Dado {
    
    private static Dado instance = null;
    
    private Dado(){
    }
    
    public static Dado getInstance(){
        if(instance==null)
            instance = new Dado();
        
        return instance;
    }
    
    // gera o numero aleatorio do dado
    public int getValorDado(){
        return new Random().nextInt(6)+1;
    }//randon gera 0~range; somo +1 ao range(0~5) para se tornar (1~6) 
}
