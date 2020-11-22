
package br.com.ufc.pds.serpentesEscadas.jogador;

import JPlay.Sprite;

public class Jogador implements iJogador{ 
    
    private String nome = "";
    private Sprite image = null;
    private int x = 0;
    private int y = 0;
    private int numCasa = 0;
    private int xp;
    private int yp;
    
    public Jogador(){
    }
    
    public Jogador(String img, int x, int y) {
        image = new Sprite(img, 1);
        xp = x;
        yp = y;
        setPosicao(0, 612);
    }
    
    public Jogador(String nome, String img, int x, int y) {
        this(img, x, y);
        this.nome = nome;
    }
    

	public Jogador(String nome){
        this.nome = nome;
        this.numCasa = 0;
    }    
    //////////////////////
    // Metodos Get e Set//
    //////////////////////
    
	
    public Sprite getImage() {
		return image;
	}

	public void setImage(Sprite image) {
		this.image = image;
	}

	
	
	public void setPosicao(int x_casa, int y_casa) {
    	image.setPosition(x_casa+xp, y_casa+yp);
		//image.setPosition(15, 578);
    }
	
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

	
	
	@Override
    public int getNumCasa(){
        return numCasa;
    }
    
	@Override
    public void setNumCasa(int numCasa){
        this.numCasa = numCasa;
    }
    
	
    @Override
    public String getNome(){
        return nome;
    }
    
    @Override
    public void setNome(String nome){
        this.nome = nome;
    }
    
    
    public void draw() {
        image.draw();
    }

    
}   

