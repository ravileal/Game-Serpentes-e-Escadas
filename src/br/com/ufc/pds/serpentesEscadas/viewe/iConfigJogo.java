
package br.com.ufc.pds.serpentesEscadas.viewe;

import br.com.ufc.pds.serpentesEscadas.tabuleiro.iObservadorTabuleiro;

public interface iConfigJogo extends iConfigCasa,iConfigJogador,iObservadorTabuleiro {
    public void defineBackground();
    public void defineDado();
    public void Draw();
    public boolean dadoClicked();
    public int getDadoValue();
    public void configurePanel() ;
    public void setSizeWindow(int winWidth, int winHeight) ;
    public void configureBasic(iObservadorTabuleiro obs) ;
}
