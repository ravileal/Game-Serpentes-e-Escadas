
package br.com.ufc.pds.serpentesEscadas.tabuleiro;

public interface iTabuleiro extends iObeservavelTabuleiro{
    
    public void setCasa(String nome, int x, int y, int indice);
    public void setCasa(String nome, int x, int y, int indice, int destino);
    public void addJogador(String nome, String img ,int x, int y);
    public String getNomeJogadorAtual();
    public void setNumCasaJogadorAtual(int numCasa);
    public int getNumCasaDestino(int indiceCasa);
    public int getNumCasaJogadorAtual();
    public void nextJogador();
    public boolean getCaiuNaRand();
    public void setPosicaoJogadorAtual(int x, int y);
    public void DrawJogadorAtual();
    public void DrawTodosJogador();
    public int getY(int indice) ;
    public int getX(int indice) ;
}
