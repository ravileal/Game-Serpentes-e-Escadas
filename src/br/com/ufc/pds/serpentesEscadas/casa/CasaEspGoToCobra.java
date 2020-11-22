package br.com.ufc.pds.serpentesEscadas.casa;


public class CasaEspGoToCobra extends CasaEspGoTo {
  
    public CasaEspGoToCobra(){
        super();
    }
    
    public CasaEspGoToCobra(int x, int y){
        super(x, y);
    }
    
    public CasaEspGoToCobra(int x, int y, int casaDestino){
        super( x,  y, casaDestino);
    }
    
    public CasaEspGoToCobra(int x, int y, int numCasa, int casaDestino){
        super(x, y,  numCasa, casaDestino);
    }
    
    
    @Override
    public  int getDestino(){
        return super.getCasaDestino();
    }
    
}
