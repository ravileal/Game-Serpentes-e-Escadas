
package br.com.ufc.pds.serpentesEscadas.viewe;

public interface iConfigJogador {
    public void definirJogadores();
    public void setPosicaoJogador(int x, int y) ;
    public void nextJogador() ;
    public String getNomeJogadorAtual();
    public boolean confereVencedor();
}
