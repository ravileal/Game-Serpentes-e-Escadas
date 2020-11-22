
package br.com.ufc.pds.serpentesEscadas.casa;

public interface iObservavelCasa {
    public void addObserver(iObservadorCasa obs);
    public void removeObserver();
    public void notifyObserver();
}
