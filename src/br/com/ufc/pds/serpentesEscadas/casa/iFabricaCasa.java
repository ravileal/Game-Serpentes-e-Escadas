

package br.com.ufc.pds.serpentesEscadas.casa;

public interface iFabricaCasa {
	public iCasa criaCasa(String nome, int x, int y, int indice, int destino,
            iObservadorCasa obs);
    public iCasa criaCasa(String nome, int x, int y, int indice, int destino);
    public iCasa criaCasa(String nome, int x, int y, int indice, iObservadorCasa obs);
    public iCasa criaCasa(String nome, int x, int y, int indice);
}
