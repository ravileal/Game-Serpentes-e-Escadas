
package br.com.ufc.pds.serpentesEscadas.casa;


public abstract class CasaEspGoTo extends CasaEspecial{
    private int casaDestino;
    
    public CasaEspGoTo(){
        super();
    }
    
    public CasaEspGoTo(int x, int y, int casaDestino){
        super( x,  y);
        this.casaDestino = casaDestino;
    }
    
    public CasaEspGoTo(int x, int y, int numCasa, int casaDestino){
        super( x,  y,  numCasa);
        this.casaDestino = casaDestino;
    }
    
    public CasaEspGoTo(int numCasa, int casaDestino){
        super(numCasa);
        this.casaDestino = casaDestino;
    }
    
     //////////////////////
    // Metodos Get e Set//
    //////////////////////
    
    public void setCasaDestino(int destino){
        this.casaDestino = destino;
    }
    
    public int getCasaDestino(){
        return this.casaDestino;
    }
}
