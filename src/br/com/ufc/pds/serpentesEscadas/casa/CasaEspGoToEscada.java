
package br.com.ufc.pds.serpentesEscadas.casa;


public class CasaEspGoToEscada extends CasaEspGoTo {
    
    public CasaEspGoToEscada(){
        super();
    }
    
    public CasaEspGoToEscada(int x, int y){
        super(x,y);
    }
    
    public CasaEspGoToEscada(int x, int y, int casaDestino){
        super(x,y, casaDestino);
    }
    
    public CasaEspGoToEscada(int x, int y, int numCasa, int casaDestino){
        super( x, y,  numCasa, casaDestino);
    }
    
    
    
    @Override
    public int getDestino(){
        return super.getCasaDestino();
    }
    
}
