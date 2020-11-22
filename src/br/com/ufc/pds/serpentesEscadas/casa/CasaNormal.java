
package br.com.ufc.pds.serpentesEscadas.casa;

public class CasaNormal extends Casa {
    
    public CasaNormal(){
        super();
    }
    
    public CasaNormal(int x, int y){
        super(x,y);
    }
   
    public CasaNormal(int numCasa){
        super(numCasa);
    }
    public CasaNormal(int x, int y, int num){
        super( x,y,  num);
    }
    
    @Override
    public int getDestino(){
        return super.getNumCasa();
    }
}
