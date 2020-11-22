
package br.com.ufc.pds.serpentesEscadas.tabuleiro;

public interface iTabuleiroController{
    
    public void setCasa(String nome, int x, int y, int indice);
    
    public void setCasa(String nome,int x, int y, int indice, int destino);
    
    public void addJogador(String nome, String img ,int x, int y);
    
    //public boolean nextRodada();
    
    public void addObserver(iObservadorTabuleiro obs);

    public void removeObserver();
    
    public void setPosicaoJogadorAtual(int x, int y);
    
    public void DrawJogadorAtual();
    
    public void DrawTodosJogador();
    
    public void setCasaDestino(int casaDestino);

    public int getCasDestino();

    
    //Rodada
    public boolean caiuNaRandom();
    public int getCasaAtual();
    public boolean confereVencedor();
    public int confereNovoDestino();
    public void nextJogador();
    public String getNomeJogador();
}
