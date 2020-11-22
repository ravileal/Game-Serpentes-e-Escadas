package br.com.ufc.pds.serpentesEscadas.casa;

import java.util.ArrayList;

public class CasaController implements iCasaController{
    
    private ArrayList<iCasa> listCasa = null;
    private iFabricaCasa fabricaCasa = null;
    private boolean caiuNaRand = false;
    
    public CasaController(){
        fabricaCasa = new FabricaCasa();
        listCasa = new ArrayList<>();
        criaTodasNormal();
    }
    
    ///////////////////////////////////////
    //Metodos de set CasaEspecial na list//
    ///////////////////////////////////////

    @Override
    public void setCasa(String nome,int x, int y,int indice, int destino){
        listCasa.set(indice, fabricaCasa.criaCasa(nome, x, y,indice, destino));
    }
    
    @Override
    public void setCasa(String nome,int x, int y,int indice){
        listCasa.set(indice, fabricaCasa.criaCasa(nome,x, y, indice));
    }
    
    @Override
    public void setCasa(String nome,int x, int y, int indice, iObservadorCasa obs){
        listCasa.set(indice, fabricaCasa.criaCasa(nome, x, y,indice, obs));
    }
    
    //////////////////////
    // Metodos Get e Set//
    //////////////////////
    
    public int getNumCasa(int indice){
        return listCasa.get(indice).getNumCasa();
    }
    
    @Override
    public int getNumCasaDestino(int indice){
        return listCasa.get(indice).getDestino();
    }
    
    @Override
    public iCasa getCasa(int indice){
        return listCasa.get(indice);
    }
    
    public ArrayList<iCasa> getListCasa(){
        return listCasa;
    }
    
    public void setListCasa(ArrayList<iCasa> listCasa){
        this.listCasa = listCasa;
    }
    
    public final void criaTodasNormal() {
        for(int i = 0; i<100 ; i++)
            listCasa.add(fabricaCasa.criaCasa("normal",0,0, i));
    }

    @Override
    public boolean getCaiuNaRand(){
        boolean ret = caiuNaRand;
        caiuNaRand = false;
        return ret;
    }
    
    @Override
    public void caiuNaRandom() {
        caiuNaRand = true;
    }

    public int getX(int indice) {
    	return listCasa.get(indice).getX();
    }
    public int getY(int indice) {
    	return listCasa.get(indice).getY();
    }
    
    public void setX(int indice, int x) {
    	listCasa.get(indice).setX(x);
    }
    
    public void setY(int indice, int y) {
    	listCasa.get(indice).setY(y);
    }
}
