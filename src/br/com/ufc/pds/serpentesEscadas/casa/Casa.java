package br.com.ufc.pds.serpentesEscadas.casa;


public class Casa implements iCasa{
   
    private int x;
    private int y;
    private int numCasa;
    private int xp = 102;
    private int yp = 68;
    
    
    public Casa(){
        numCasa = 0;
    }
  
    public Casa(int numCasa){
        this.numCasa = numCasa;
    }
    
    
    
    public Casa(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Casa(int x, int y, int numCasa) {
		super();
		this.x = x;
		this.y = y;
		this.numCasa = numCasa;
	}
    
    //////////////////////
    // Metodos Get e Set//
    //////////////////////

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setPosicao(int x, int y) {
		this.y = y;
	}
	
	@Override
    public int getNumCasa(){
        return numCasa;
    }
 
    public void setNumCasa(int numCasa){
        this.numCasa = numCasa;
    }

    @Override
    public int getDestino() {
        return 1+numCasa;
    }
    
}
