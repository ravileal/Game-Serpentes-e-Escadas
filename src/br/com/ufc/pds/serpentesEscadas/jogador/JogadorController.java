
package br.com.ufc.pds.serpentesEscadas.jogador;

import java.util.ArrayList;


public class JogadorController implements iJogadorController{
    
    private ArrayList<iJogador> listJogador = null;
    private Integer indiceJogadorAtual = null;

    
    public JogadorController(){
        listJogador = new ArrayList<>();
        indiceJogadorAtual = 0;
    }
    
    public void addJogador(String nome){
        if(canAddJogador())
            listJogador.add(new Jogador(nome));
    }
    
    @Override
    public void addJogador(String nome, String img ,int x, int y){
        if(canAddJogador()) 
            listJogador.add(new Jogador(nome, img, x, y));
    }
    
    ////////////////////////////////////////////////
    // Metodos get e set do jogador atual da lista//
    ////////////////////////////////////////////////
    
    public int getIndiceJogadorAtual(){
        return indiceJogadorAtual;
    }
    
    public void setIndiceJogadorAtual(int indiceJogador){
        indiceJogadorAtual = indiceJogador;
    } 
    
    private iJogador getJogadorAtual(){
        return listJogador.get(indiceJogadorAtual);
    }
    
    @Override
    public String getNomeJogadorAtual(){
        return getJogadorAtual().getNome();
    }
    
    @Override
    public void setNumCasaJogadorAtual(int numCasa){
        getJogadorAtual().setNumCasa(numCasa);
    }
    
    @Override
    public int getNumCasaJogadorAtual(){
        return getJogadorAtual().getNumCasa();
    }
    
    public int getXJogadorAtual() {
    	return getJogadorAtual().getX();
    }
    
    public int getYJogadorAtual() {
    	return getJogadorAtual().getY();
    }
    
    public void setPosicaoJogadorAtual(int x, int y) {
    	getJogadorAtual().setPosicao(x, y);
    }
    
    public void draw(int indice) {
        listJogador.get(indice).draw();
    }
    
    ///////////////////////////////////////
    // Metodos get e set jogador da lista//
    ///////////////////////////////////////
    
    private boolean canAddJogador(){
        return (listJogador.size() < 4);
    }
    
    @Override
    public void nextJogador(){
        if(indiceJogadorAtual == listJogador.size()-1)
            indiceJogadorAtual = 0;
        else
            indiceJogadorAtual++;
    }

	@Override
	public void drawTodosJogador() {
		for (iJogador iJogador : listJogador) 
			iJogador.draw();
	}

	@Override
	public void drawJogadorAtual() {
		getJogadorAtual().draw();
	}
}
