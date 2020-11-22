
package br.com.ufc.pds.serpentesEscadas.casa;


public abstract class CasaEspecial extends Casa{
    
    public CasaEspecial(){
        super();
    }
    
    public CasaEspecial(int numCasa){
        super(numCasa);
    }
    
    public CasaEspecial(int x, int y){
        super( x,  y);
    }
    
    public CasaEspecial(int x, int y, int numCasa){
        super( x,  y,  numCasa);
    }
    
}
