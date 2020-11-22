
package br.com.ufc.pds.serpentesEscadas.casa;


public class FabricaCasa implements iFabricaCasa{

    @Override
    public iCasa criaCasa(String nome, int x, int y, int indice, int destino,
            iObservadorCasa obs) {
        switch(nome){
            case "normal":
                return new CasaNormal(calculaX(indice),calculaY(indice), indice);
            case "random":
                return new CasaEspRandom(calculaX(indice),calculaY(indice), indice, obs);
            case "cobra":
                return new CasaEspGoToCobra(calculaX(indice),calculaY(indice), indice, destino);
            case "escada":
                return new CasaEspGoToEscada(calculaX(indice),calculaY(indice), indice, destino);
            default:
                return null;
        }
    }
    
    private int calculaY(int indice) {
    	String y = String.valueOf(indice);
    	if(y.length() == 1)
    		y = "0";
    	else
    		y = y.substring(0,1);
    	indice = Integer.parseInt(y);
    	
    	
    	indice = 612-(indice*68);
    	System.out.println("valor y:" +indice);
    	//new Scanner(System.in).nextLine();
    	return indice;
    }
    
    private int calculaX(int indice) {
    	String x = String.valueOf(indice);
    	int xx = 0;
    	if(x.length() != 1){
    		x = x.substring(0,1);
    		xx = Integer.parseInt(x);
    		if(xx%2 != 0) {	
    			x = String.valueOf(indice);
    			x = x.substring(1,2);
    			xx = Integer.parseInt(x);
    			xx = 9 - xx;
    		}else {
    			x = String.valueOf(indice);
    			x = x.substring(1,2);
    			xx = Integer.parseInt(x);
    		}
    	}else {
    		x = x.substring(0,1);
        	xx = Integer.parseInt(x);	
    	}
    	
    	xx = xx*102;
    	System.out.println("valor x:" +xx);
    	// Scanner(System.in).nextLine();
    	return xx;
    }
    
    @Override
    public iCasa criaCasa(String nome, int x, int y, int indice) {
        return criaCasa(nome, x, y, indice, 0, null);
    }
    
    @Override
    public iCasa criaCasa(String nome, int x, int y, int indice, iObservadorCasa obs) {
        return criaCasa(nome, x,y, indice,0 ,obs);
    }
    
    @Override
    public iCasa criaCasa(String nome, int x, int y, int indice, int destino) {
        return criaCasa(nome, x,y, indice, destino, null);
    }
    
}
