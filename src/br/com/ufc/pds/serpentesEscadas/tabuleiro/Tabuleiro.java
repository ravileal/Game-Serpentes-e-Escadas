
package br.com.ufc.pds.serpentesEscadas.tabuleiro;

import br.com.ufc.pds.serpentesEscadas.casa.CasaController;
import br.com.ufc.pds.serpentesEscadas.casa.iCasaController;
import br.com.ufc.pds.serpentesEscadas.jogador.JogadorController;
import br.com.ufc.pds.serpentesEscadas.jogador.iJogadorController;

public class Tabuleiro implements iTabuleiro{
    
    private iCasaController ctrlCasa = null;
    private iJogadorController ctrlJogador = null;
    private static Tabuleiro instance = null;
    private iObservadorTabuleiro observador = null;
    
    private Tabuleiro(){
        ctrlCasa = new CasaController();
        ctrlJogador = new JogadorController();
    }
    
    public static Tabuleiro getInstance(){
        if(instance == null)
            instance = new Tabuleiro();
        
        return instance;
    }
    
    //////////////////////
    // Metodos Get e Set//
    //////////////////////
    
    @Override
    public void setCasa(String nome, int x, int y, int indice){
        ctrlCasa.setCasa(nome, x, y, indice, ctrlCasa ); 
    }
    
    
    @Override
    public void setCasa(String nome, int x, int y, int indice, int destino){
        ctrlCasa.setCasa(nome, x, y,indice, destino);
    }
        
    // add set get iCasa

    @Override
    public int getNumCasaDestino(int indice){
        return ctrlCasa.getNumCasaDestino(indice);
    }
    
    // add set get Jogador

    @Override
    public void addJogador(String nome, String img ,int x, int y){
    	ctrlJogador.addJogador(nome, img ,x, y);
    }
    
    @Override
    public String getNomeJogadorAtual(){
        return ctrlJogador.getNomeJogadorAtual();
    }
    
    @Override
    public int getNumCasaJogadorAtual(){
        return ctrlJogador.getNumCasaJogadorAtual();
    }
    
    public void setPosicaoJogadorAtual(int x, int y) {
    	ctrlJogador.setPosicaoJogadorAtual(x, y);
    }
    
    public int getX(int indice) {
    	return ctrlCasa.getCasa(indice).getX();
    }
    public int getY(int indice) {
    	return ctrlCasa.getCasa(indice).getY();
    }
    
    @Override
    public void setNumCasaJogadorAtual(int numCasa){
        ctrlJogador.setNumCasaJogadorAtual(numCasa);
    }
    
    @Override
    public void nextJogador() {
        ctrlJogador.nextJogador();
    }

    @Override
    public boolean getCaiuNaRand() {
        return ctrlCasa.getCaiuNaRand();
    }
    
    
    @Override
    public void addObserver(iObservadorTabuleiro obs) {
        observador = obs;
    }

    @Override
    public void removeObserver() {
        observador = null;
    }

    @Override
    public void notifyObserver() {
        observador.fimDeJogo();
    }
    
    public void DrawTodosJogador() {
    	ctrlJogador.drawTodosJogador();
    }
    
    public void DrawJogadorAtual() {
    	ctrlJogador.drawJogadorAtual();
    }
}
